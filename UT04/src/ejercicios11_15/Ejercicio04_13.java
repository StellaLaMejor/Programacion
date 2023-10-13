package ejercicios11_15;

import java.util.Scanner;

public class Ejercicio04_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa el número de alumnos: ");
		int alumnos = sc.nextInt();

		if (alumnos >= 100) {
			System.out.println("Cada alumno debe pagar: 65€ \nEl pago a la compañía de autobuses será de: "
					+ (65 * alumnos) + "€");
		} 
		else if (alumnos >= 50 && alumnos < 100) {
			System.out.println("Cada alumno debe pagar: 70€ \nEl pago a la compañía de autobuses será de: "
					+ (70 * alumnos) + "€");
		} 
		else if (alumnos >= 30 && alumnos < 50) {
			System.out.println("Cada alumno debe pagar: 95€ \nEl pago a la compañía de autobuses será de: "
					+ (95 * alumnos) + "€");
		} 
		else if (alumnos < 30) {
			System.out.println("Cada alumno debe pagar: " + ( 4000/alumnos )
					+ "€ \nEl pago a la compañía de autobuses será de: " + (4000) + "€");
		}

	}

}
