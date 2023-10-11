package ejercicios06_10;

import java.util.Scanner;

public class Ejercicio04_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Indica el valor del punto central x1: ");
		double x1 = sc.nextDouble();
		System.out.println("Indica el valor del punto central y1: ");
		double y1 = sc.nextDouble();
		System.out.println("Indica el valor del punto central x2: ");
		double x2 = sc.nextDouble();
		System.out.println("Indica el valor del punto central y2: ");
		double y2 = sc.nextDouble();

		System.out.println("Indica el valor del radio r1: ");
		double r1 = sc.nextDouble();
		System.out.println("Indica el valor del radio r2: ");
		double r2 = sc.nextDouble();

		double distanciacentros = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double sumaradios = r1 + r2;
		double diferencia = distanciacentros - sumaradios;
		double diferenciapositiva = Math.abs(diferencia);

		if (distanciacentros > sumaradios) {
			System.out.println("Las circunferencias son exteriores.");
		} else {
			if (distanciacentros == sumaradios) {
				System.out.println("Las circunferencias son tangentes exteriores.");
			} else {
				if (distanciacentros < sumaradios && distanciacentros > diferenciapositiva) {
					System.out.println("Las circunferencias son secantes.");
				} else {
					if (distanciacentros == diferenciapositiva) {
						System.out.println("Las circunferencias son tangentes interiores.");
					} else {
						if (distanciacentros > 0 && distanciacentros < diferenciapositiva) {
							System.out.println("Las circunferencias son interiores.");
						}
					}
				}

			}
		}
		if (x1 == x2 && y1 == y2) {
			if (r1 == r2) {
				System.out.println("Las circunferencias son la misma circunferencia.");
			} else {
				System.out.println("Las circunferencias son concéntricas.");
			}

		}

	}
}
