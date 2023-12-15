package ejercicios01_02;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio09_02 {

	
	private final static int LIMITE_MAX = 500;
	private static final int LIMITE_MIN = 0;

	public static void main(String[] args) {

		ESTA BASURA NO FUNCIONA, ARRÉGLALA PERRRA
		
		Scanner sc = new Scanner(System.in);
		Random rdm = new Random();

		System.out.print("Límite inferior A (no puede ser superior a 500): ");

		int a = Integer.parseInt(sc.nextLine());
		while (a > LIMITE_MAX) {
			System.out.println("El número introducido no es un número válido");
			System.out.print("Introduce un número mayor o igual a 0 como límite inferior: ");
			a = Integer.parseInt(sc.nextLine());
		}

		boolean correcto = false;

		while (!correcto) {
		    try {
		        a = Integer.parseInt(sc.nextLine());
		        correcto = true;
		    } catch (NumberFormatException aA) {
		        System.out.println("El número introducido no es un número válido");
		        System.out.print("Introduce un número entero como límite inferior: ");
		    } catch (Exception aAA) {
		        System.out.println("Error desconocido.");
		        System.out.print("Introduce un número entero como límite inferior: ");
		    }
		}

		System.out.print("Límite superior B (no puede ser inferior a 0): ");

		correcto = false;
		int b = 0;
		while (!correcto) {
			try {
				b = Integer.parseInt(sc.nextLine());
				correcto = true;
			} catch (NumberFormatException aB) {
				System.out.println("El número introducido no es un número válido");
				System.out.print("Introduce un número entero como límite superior: ");
			} catch (Exception aBB) {
				System.out.println("Error desconocido.");
				System.out.print("Introduce un número entero como límite superior: ");
			}
		}

		while (b < LIMITE_MIN) {

			System.out.println("El número introducido no es un número válido");
			System.out.print("Introduce un número menor o igual que 500 como límite superior: ");
			b = Integer.parseInt(sc.nextLine());
		}

		int contadorIntentos = -1;

		int numeroRdm = rdm.nextInt(a, b + 1);

		System.out.printf("Introduce un número entre %d y %d: ", a, b);
		int adivinacion = -1;

		for (; adivinacion != numeroRdm; contadorIntentos++) {
			try {
				System.out.print("Vuelve a intentarlo: ");
				adivinacion = Integer.parseInt(sc.next());

				if (adivinacion < a || adivinacion > b) {
					System.out.println("El número está fuera de los límites.");
				} else if (adivinacion < numeroRdm) {
					System.out.println("El número es menor.");
				} else {
					System.out.println("El número es mayor.");
				}
			} catch (NumberFormatException f) {
				System.out.println("El número introducido no es un número válido");
				}

		}

	}

}
