package ejercicios11_15;

import java.util.Scanner;

public class Ejercicio04_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el día: ");
		int dia = sc.nextInt();
		System.out.println("Introduce el mes: ");
		int mes = sc.nextInt();
		System.out.println("Introduce el año: ");
		int anio = sc.nextInt();

		boolean bisiesto = ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0);
		boolean fechavalida = false;

		if (mes >= 1 && mes <= 12) {
			switch (mes) {
			case 1, 3, 5, 7, 8, 10, 12:
				if (dia >= 1 && dia <= 31) {
					fechavalida = true;
					break;
				}
			case 4, 6, 9, 11:
				if (dia >= 1 && dia <= 30) {
					fechavalida = true;
				}
				break;
			case 2:
				if (bisiesto && dia >= 1 && dia <= 29) {
					fechavalida = true;
				} else {
					if (!bisiesto && dia >= 1 && dia <= 28) {
						fechavalida = true;
					} else {
						System.out.printf("El mes %d no tiene %d días. \n", mes, dia);
						break;
					}
				}
				break;
			default:
				System.out.printf("");
				break;
			}
		}
		if (fechavalida) {
			System.out.printf("La fecha %d/%d/%d es correcta. ", dia, mes, anio);
		} else {
			System.out.printf("La fecha %d/%d/%d no es correcta", dia, mes, anio);
		}
	}

}
