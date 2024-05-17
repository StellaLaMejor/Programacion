package ejercicios_repasacion.ejercicios05_09;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class Ejercicio07 {
    private static final Path FICHERO_PARRAFO = Path.of("Ficheros", "FicherosRepasacion", "Ejercicios05_09", "Ejercicio07");
    private static final char CHAR_INICIAL = 0x20;
    private static final char CHAR_FINAL = 0x7E;
    public static final int CANTIDAD_CARACTERES = 100;

    private static Random rnd = new Random();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        List<Character> caracteresAleatorios = generarAleatorios(CANTIDAD_CARACTERES, CHAR_INICIAL, CHAR_FINAL);
        Collections.sort(caracteresAleatorios);

        System.out.print("Indica el nombre del fichero que quieres crear: ");
        String ficheroUsu = sc.nextLine();

        Path ficheroCompleto = FICHERO_PARRAFO.resolve(ficheroUsu);


        if (ficheroCompleto.toFile().exists()) {
            System.out.println("El fichero indicado ya existe");
            return;
        }
        File directorioDetino = ficheroCompleto.toFile().getParentFile();

        if (directorioDetino.exists()) {
            if (!directorioDetino.isDirectory()) {
                System.out.printf("%s no es un directorio\n", directorioDetino);
                return;
            }
        } else {
            directorioDetino.mkdirs();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ficheroCompleto.toFile()))) {
            for (char caracter : caracteresAleatorios) {
                writer.write(caracter);
                writer.newLine();
            }
        }


    }

    private static List<Character> generarAleatorios(int cantidadAleatorios, char charInicial, char charFinal) {
        List<Character> aleatorios = new ArrayList<>();

        for (int i = 0; i < CANTIDAD_CARACTERES; i++) {
            char aleatorio = (char) rnd.nextInt(charInicial, charFinal + 1);
            aleatorios.add(aleatorio);
        }

        return aleatorios;
    }
}
