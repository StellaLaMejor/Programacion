package ejercicios16_20;

import java.util.Scanner;

public class Ejercicio04_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número del 1 al 12 para obtener un mes del año: ");
		int mes = sc.nextInt();

		switch (mes) {
		case 1:
			System.out.println("Enero y tiene 31 días");
			break;
		case 2:
			System.out.println("Febrero y tiene 28/29 días");
			break;
		case 3:
			System.out.println("Marzo y tiene 31 días");
			break;
		case 4:
			System.out.println("Abril y tiene 30 días");
			break;
		case 5:
			System.out.println("Mayo y tiene 31 días");
			break;
		case 6:
			System.out.println("Junio y tiene 30 días");
			break;
		case 7:
			System.out.println("Julio y tiene 31 días");
			break;
		case 8:
			System.out.println("Agosto y tiene 31 días");
			break;
		case 9:
			System.out.println("Septiembre y tiene 30 días");
			break;
		case 10:
			System.out.println("Octubre y tiene 31 días");
			break;
		case 11:
			System.out.println("Noviembre y tiene 30 días");
			break;	
		case 12:
			System.out.println("Diciembre y tiene 31 días");
			break;	
	
		default:
			System.out.println("El mes del año no existe.");
			break;
		}
	}
//holaaaaaaa
}
