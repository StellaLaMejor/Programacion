package ejercicios01_02;

import java.util.Scanner;

public class Ejercicio09_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un texto: ");
		String cadena = sc.nextLine();

		int posicion = -1;
		while (posicion != 0) {
			try {
				System.out.print("Introduce la posición de la frase que quieres extraer (0 para terminar):");
				posicion = Integer.parseInt(sc.nextLine());
				
				if (posicion != 0) {
					System.out.printf("El caracter en la posición %d es %s.\n", posicion, cadena.charAt(posicion - 1));
				}

			} catch (NumberFormatException a) {
				System.out.println("El número introducido no es un número válido");
			}

			catch (IndexOutOfBoundsException b) {

				System.out.println("El número introducido está fuera de los rangos de la cadena");
			} catch (Exception c) {
				System.out.println("Error desconocido");
			}

		}

		System.out.println("Fin del programa.");

	}

}
