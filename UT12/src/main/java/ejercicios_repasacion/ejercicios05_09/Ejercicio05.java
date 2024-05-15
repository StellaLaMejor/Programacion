package ejercicios_repasacion.ejercicios05_09;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Ejercicio05 {
    private static Path FICHERO_PARRAFO= Path.of("Ficheros", "FicherosRepasacion", "Ejercicios05_09", "Ejercicio05", "parrafo.txt");
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        if (!FICHERO_PARRAFO.toFile().exists())
            FICHERO_PARRAFO.toFile().getParentFile().mkdirs();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FICHERO_PARRAFO.toFile()))) {
            System.out.println("Introduce líneas de texto, usa 'FIN' para terminar: ");
            String textoUsuario="";

            while (!textoUsuario.equals("FIN")){
                textoUsuario= sc.nextLine();
                writer.write(textoUsuario);
                writer.newLine();
            }



        }


    }
}
