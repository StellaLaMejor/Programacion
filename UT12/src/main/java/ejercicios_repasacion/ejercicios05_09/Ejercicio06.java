package ejercicios_repasacion.ejercicios05_09;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio06 {
    private static final Path FICHERO_PARRAFO = Path.of("Ficheros", "FicherosRepasacion", "Ejercicios05_09", "Ejercicio05", "parrafo.txt");
    private static final Path FICHERO_PARRAFO_SIN_VOCALES = Path.of("Ficheros", "FicherosRepasacion", "Ejercicios05_09", "Ejercicio06", "parrafoSinVocales.txt");

    private static final Set<Character> VOCALES = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    public static void main(String[] args) throws IOException {

        if (!FICHERO_PARRAFO_SIN_VOCALES.toFile().exists())
            FICHERO_PARRAFO_SIN_VOCALES.toFile().getParentFile().mkdirs();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FICHERO_PARRAFO_SIN_VOCALES.toFile()));
             BufferedReader reader = new BufferedReader((new FileReader(FICHERO_PARRAFO.toFile())))) {

            int caracter;
            while ((caracter = reader.read()) != -1) {
                char caracterLeido = (char) caracter;
                if (!VOCALES.contains(caracterLeido)) {
                    writer.write(caracter);
                }
            }


        }


    }
}
