package ejercicios11_15;

import java.util.Scanner;

public class Ejercicio04_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Indica el precio inicial por kilo de uva: ");
		double inicial = sc.nextDouble();
		sc.nextLine();
		System.out.println("Indica el tipo de uva (A o B): ");
		String tipo = sc.nextLine();
		System.out.println("Indica el tamaño de uva (1 o 2): ");
		int tamanio = sc.nextInt();

		if (!tipo.equalsIgnoreCase("A") && !tipo.equalsIgnoreCase("B")) {
			System.out.println("Tipo de uva incorrecto. Debe ser A o B.");
		} else if (tamanio != 1 && tamanio != 2) {
			System.out.println("Número de tamaño incorrecto. Debe ser 1 o 2.");
		} else {
			if (tipo.equalsIgnoreCase("A")) {
			} else {
				if (tamanio == 1) {
					double a1 = (inicial + 0.2);
					System.out.printf("El precio por kilo de uva es: %.2f", a1);
				} else {
					if (tamanio == 2) {
						double a2 = (inicial + 0.3);
						System.out.printf("El precio por kilo de uva es: %.2f", a2);
					}
				}
			}
			if (tipo.equalsIgnoreCase("B")) {
			} else {
				if (tamanio == 1) {
					double b1 = (inicial - 0.3);
					System.out.printf("El precio por kilo de uva es: %.2f", b1);
				} else {
					if (tamanio == 2) {
						double b2 = (inicial - 0.5);
						System.out.printf("El precio por kilo de uva es: %.2f", b2);
					}

				}
			}
		}

	}
}
