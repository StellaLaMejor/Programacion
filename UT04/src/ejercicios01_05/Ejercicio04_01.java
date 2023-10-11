package ejercicios01_05;

import java.util.Scanner;

public class Ejercicio04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
	
	System.out.print("Dime 2 números ");
		int a= sc.nextInt();
		int b= sc.nextInt();
	if (a>b) {
		System.out.printf("El número %d es mayor que el número %d", a, b);
	}
	if (a<b) {
		System.out.printf("El número %d es menor o igual al númro %d", a, b);
	} else {
		System.out.printf("El número %d y el número %d son iguales", a, b);
	}

	}

}
