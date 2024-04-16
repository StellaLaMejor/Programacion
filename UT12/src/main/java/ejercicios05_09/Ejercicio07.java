package ejercicios05_09;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class Ejercicio07 {
    private static final char CHAR_INICIAL = 0x20;
    private static final char CHAR_FINAL= 0x7E;
    public static final int CANTIDAD_CHAR_RND = 100;

    private static Random rnd = new Random();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        System.out.println("Indica el nombre del fichero que quieres crear.");
        String respuestaNombre = sc.nextLine()+".txt";

        Path nombreFichero = Path.of("Desktop", "PruebasFicheros","Ejercicio12_07", respuestaNombre );

        nombreFichero.toFile().getParentFile().mkdirs();

        if( nombreFichero.toFile().exists()){
            System.out.println("El fichero ya existe.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreFichero.toFile()))) {

            List<Character> listaRndChar = new ArrayList<>();

            char aleatorio;
            for (int i = 0; i < CANTIDAD_CHAR_RND; i++) {
                aleatorio = (char) rnd.nextInt(CHAR_INICIAL,CHAR_FINAL+1);
                listaRndChar.add(aleatorio);
            }

            Collections.sort(listaRndChar);

            for(char caracter: listaRndChar){
                writer.write(caracter);
                writer.newLine();
            }

        }



    }
}
