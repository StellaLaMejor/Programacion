package ejercicios06_10;

import java.util.Scanner;

public class Ejercicio04_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu nota: ");
		int nota = sc.nextInt();
		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();
		System.out.println("Introduce tu sexo: ");
		String sexo = sc.next();

		if (nota >= 5 && edad >= 18) {
			if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("femenino") || sexo.equalsIgnoreCase("mujer")) {
				System.out.println("ACEPTADA");
			} else if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("masculino")
					|| sexo.equalsIgnoreCase("hombre")) {
				System.out.println("POSIBLE");
			}
		} else {
			System.out.println("NO ACEPTADA");

		}

	}
}
