package ejercicios16_20;

import java.util.Scanner;

public class Ejercicio04_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número del 1 al 7 para obtener el día de la semana: ");
		int dia = sc.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
		break;
		case 2:
			System.out.println("Martes");
		break;
		case 3:
			System.out.println("Miércoles");
		break;
		case 4:
			System.out.println("Jueves");
		break;
		case 5:
			System.out.println("Viernes");
		break;
		case 6:
			System.out.println("Sábado");
		break;
		case 7:
			System.out.println("Domingo");
		break;
		default:
			System.out.println("El día de la semana no existe.");
		break;
		}
	}

}
