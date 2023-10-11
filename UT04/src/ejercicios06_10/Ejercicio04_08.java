package ejercicios06_10;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Ejercicio04_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int numerouno = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		int numerodos = sc.nextInt();
		System.out.print("Introduce el tercer número: ");
		int numerotres = sc.nextInt();

		if (numerouno >= numerodos && numerouno >= numerotres) {
			if (numerodos >= numerotres) {
				System.out.printf("Los números ordenados de mayor a menor: %d, %d, %d ", numerouno, numerodos,
						numerotres);
			} else {
				System.out.printf("Los números ordenados de mayor a menor: %d, %d, %d ", numerouno, numerotres,
						numerodos);
			}
		}
		if (numerodos >= numerouno && numerodos >= numerotres) {
			if (numerouno >= numerotres) {
				System.out.printf("Los números ordenados de mayor a menor: %d, %d, %d ", numerodos, numerouno,
						numerotres);
			} else {
				System.out.printf("Los números ordenados de mayor a menor: %d, %d, %d ", numerodos, numerotres,
						numerouno);
			}
		}
		if (numerotres >= numerouno && numerotres >= numerodos) {
			if (numerouno >= numerodos) {
				System.out.printf("Los números ordenados de mayor a menor: %d, %d, %d ", numerotres, numerouno,
						numerodos);
			} else {
				System.out.printf("Los números ordenados de mayor a menor: %d, %d, %d ", numerotres, numerodos,
						numerouno);
			}
		}

	}

}
