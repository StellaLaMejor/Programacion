package ejercicios_repasacion.ejercicios05_09;

import java.io.*;
import java.nio.file.Path;

public class Ejercicio09 {
    private static final int LIMITE_INFERIOR = 0x20;
    private static final int LIMITE_SUPERIOR = 0x7E;
    private static final Path FICHERO_ORIGINAL = Path.of("Ficheros", "FicherosRepasacion", "Ejercicios05_09", "Ejercicio09", "ficheroOriginal.txt");
    private static final Path FICHERO_CIFRADO = Path.of("Ficheros", "FicherosRepasacion", "Ejercicios05_09", "Ejercicio09", "ficheroCifrado.txt");
    private static final Path FICHERO_DESCIFRADO = Path.of("Ficheros", "FicherosRepasacion", "Ejercicios05_09", "Ejercicio09", "ficheroDescifrado.txt");

    public static void main(String[] args) throws IOException {
        if (!FICHERO_ORIGINAL.toFile().exists())
            FICHERO_ORIGINAL.toFile().getParentFile().mkdirs();

        int claveCifrado = 10;

        cifrar(FICHERO_ORIGINAL.toFile(), FICHERO_CIFRADO.toFile(), claveCifrado);
        descifrar(FICHERO_CIFRADO.toFile(), FICHERO_DESCIFRADO.toFile(), claveCifrado);
    }

    private static void cifrar(File ficheroOriginal, File ficheroCifrado, int claveCifrado) throws IOException {

        if (claveCifrado > (LIMITE_SUPERIOR - LIMITE_INFERIOR))
            throw new IllegalArgumentException(String.format("La clave de cifrado no puede ser mayor que %d", (LIMITE_SUPERIOR - LIMITE_INFERIOR)));


        try (BufferedReader reader = new BufferedReader(new FileReader(ficheroOriginal));
             BufferedWriter writer = new BufferedWriter(new FileWriter(ficheroCifrado))) {

            int charOriginal;

            while ((charOriginal = reader.read()) != -1) {
                if (charOriginal > LIMITE_SUPERIOR || charOriginal < LIMITE_INFERIOR) {
                    writer.write(charOriginal);
                } else {
                    int charCifrado = charOriginal + claveCifrado;
                    if (charCifrado > LIMITE_SUPERIOR)
                        charCifrado = LIMITE_INFERIOR + (charCifrado % (LIMITE_SUPERIOR + 1));

                    writer.write(charCifrado);
                }

            }

        }
    }

    private static void descifrar(File ficheroCifrado, File ficheroDescifrado, int claveCifrado) throws IOException {

        if (claveCifrado > (LIMITE_SUPERIOR - LIMITE_INFERIOR))
            throw new IllegalArgumentException(String.format("La clave de cifrado no puede ser mayor que %d", (LIMITE_SUPERIOR - LIMITE_INFERIOR)));


        try (BufferedReader reader = new BufferedReader(new FileReader(ficheroCifrado));
             BufferedWriter writer = new BufferedWriter(new FileWriter(ficheroDescifrado))) {

            int charOriginal;

            while ((charOriginal = reader.read()) != -1) {
                if (charOriginal > LIMITE_SUPERIOR || charOriginal < LIMITE_INFERIOR) {
                    writer.write(charOriginal);
                } else {
                    int charDescifrado = charOriginal - claveCifrado;
                    if (charDescifrado < LIMITE_INFERIOR)
                        charDescifrado = LIMITE_SUPERIOR - (charDescifrado % (LIMITE_INFERIOR + 1));

                    writer.write(charDescifrado);
                }

            }

        }
    }

}
