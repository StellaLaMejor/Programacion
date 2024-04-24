package ejercicios13_15;

import java.io.*;
import java.nio.file.Path;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
    private static final Scanner sc = new Scanner(System.in);
    private static final Random rnd = new Random();
    private static final int MAX_ALEATORIO = 100;
    private static final Path FICHERO_BINARIO_NUMEROS_RND = Path.of("Desktop", "PruebasFicheros", "Ejercicio12_13", "NumerosRndBinario.txt");

    public static void main(String[] args) throws IOException {

        if (!FICHERO_BINARIO_NUMEROS_RND.toFile().exists()) {
            FICHERO_BINARIO_NUMEROS_RND.toFile().getParentFile().mkdirs();
        }

        System.out.print("Indica la cantidad de números aleatorios positivos a guardar en el fichero binario: ");
        int cantidad = Integer.parseInt(sc.nextLine());

        try (FileOutputStream fOs = new FileOutputStream(FICHERO_BINARIO_NUMEROS_RND.toFile(), true)) {

            while ((cantidad>0)){
                int numeroRnd= rnd.nextInt(MAX_ALEATORIO+1);
//                byte byteNumero = (byte)numeroRnd;
                fOs.write(numeroRnd);
                cantidad--;
            }

            try(FileInputStream fIs = new FileInputStream(FICHERO_BINARIO_NUMEROS_RND.toFile())){
                int numero;
                int cuantos = 0;
                while ((numero = fIs.read())!= -1){
                    if (cuantos%20==0){
                        System.out.println();
                    }
                    System.out.printf("%2d ", numero);
                    cuantos++;
                }
            }


        }


    }
}
