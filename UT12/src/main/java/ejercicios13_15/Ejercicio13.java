package ejercicios13_15;

import java.nio.file.Path;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
    private static final Scanner sc = new Scanner(System.in);
    private static final Random rnd = new Random();
    private static final int MAX_ALEATORIO= 100;
    private static final Path FICHERO_BINARIO_NUMEROS_RND= Path.of("Desktop","PruebasFicheros",  "Ejercicio12_13", "NumerosRndBinario.txt");

    public static void main(String[] args) {
        System.out.print("Indica la cantidad de números aleatorios positivos a guardar en el fichero binario: ");
        int cantidad = Integer.parseInt(sc.nextLine());




    }
}
