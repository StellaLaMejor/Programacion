package ejercicios05_09;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class Ejercicio08 {
    private static final char CHAR_INICIAL = 0x20;
    private static final char CHAR_FINAL= 0x7E;
    public static final int CANTIDAD_CHAR_RND = 100;

    private static Random rnd = new Random();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        Path nombreFichero1 = nombreDelFicheroAcrear();
        if( nombreFichero1.toFile().exists()){
            System.out.println("El fichero ya existe.");
            return;
        }
        ficheroCharAleatorios(nombreFichero1);

        Path nombreFichero2 = nombreDelFicheroAcrear();
        if( nombreFichero2.toFile().exists()){
            System.out.println("El fichero ya existe.");
            return;
        }
        ficheroCharAleatorios(nombreFichero2);


        Path f3 = Path.of("Desktop", "PruebasFicheros","Ejercicio12_08", "f3.txt");
        f3.toFile().getParentFile().mkdirs();

        try (FileReader reader1 = new FileReader(nombreFichero1.toFile());
             FileReader reader2 = new FileReader(nombreFichero2.toFile());
             FileWriter writer = new FileWriter(f3.toFile())) {

            int caracter1= reader1.read();
            int caracter2=reader2.read();

            while ((caracter1!=-1) && (caracter2 !=-1)){


                    if (caracter1 <= caracter2) {
                        writer.write(caracter1);
                        caracter1 = reader1.read();
                    } else {
                        writer.write(caracter2);
                        caracter2 = reader2.read();
                    }
            }

            if(caracter1 ==-1){
                do{
                    writer.write(caracter2);
                }while ((caracter2 = reader2.read()) != -1);
            }
            if(caracter2==-1){
                do{
                    writer.write(caracter1);
                }while ((caracter1 = reader1.read()) != -1);
            }

        }

    }



    private static Path nombreDelFicheroAcrear() {
        System.out.println("Indica el nombre del fichero que quieres crear.");
        String respuestaNombre = sc.nextLine()+".txt";

        Path nombreFichero = Path.of("Desktop", "PruebasFicheros","Ejercicio12_08", respuestaNombre );

        nombreFichero.toFile().getParentFile().mkdirs();
        return nombreFichero;
    }

    private static void ficheroCharAleatorios(Path nombreFichero) throws IOException {
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
