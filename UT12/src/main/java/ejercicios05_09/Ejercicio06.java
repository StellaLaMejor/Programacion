package ejercicios05_09;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio06 {

    private static final Path FICHERO_ENTRADA_EJERCICIO5= Path.of("ejercicios", "03", "parrafo.txt");
    private static final Path FICHERO_SALIDA_PARRAFO= Path.of("ejercicios", "03", "parrafoSinVocales.txt");

    private static final Set<Character> VOCALES = Set.of('a','e','i','o','c','u','á','é','í','ó','ú','A','E','I','O','U');

    public static void main(String[] args) throws IOException {

        FICHERO_SALIDA_PARRAFO.toFile().getParentFile().mkdirs();

        try (BufferedReader reader = new BufferedReader(new FileReader(FICHERO_ENTRADA_EJERCICIO5.toFile()));
             BufferedWriter writer = new BufferedWriter((new FileWriter(FICHERO_SALIDA_PARRAFO.toFile())))) {

            int c;
            while ((c= reader.read())!=-1){
                char caracterLeido = (char) c;
                if(!VOCALES.contains(caracterLeido)){
                    writer.write(caracterLeido);
                }
            }
        }

    }

}
