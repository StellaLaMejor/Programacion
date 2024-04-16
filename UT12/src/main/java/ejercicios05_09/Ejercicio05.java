package ejercicios05_09;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Ejercicio05 {

    private static Path FICHERO_SALIDA= Path.of("ejercicios", "03", "parrafo.txt");
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        FICHERO_SALIDA.toFile().getParentFile().mkdirs();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FICHERO_SALIDA.toFile()))) {
            System.out.println("Introduce líneas de texto, una línea \"FIN\" para terminar");
            String textoUsuario;
            do{
                textoUsuario= sc.nextLine();
                writer.write(textoUsuario);
                writer.newLine();

            }while (!textoUsuario.equals("FIN"));
        }

    }
}
