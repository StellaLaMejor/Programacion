package ejercicios01_05;

import java.util.Scanner;

public class Ejercicio04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner (System.in);
	System.out.println("Dime un número");
		int a= sc.nextInt();
		int b = a % 2;
	if (b==0) {
		System.out.printf("El número %d es par", a);
	} else {
		System.out.printf("El número %d es impar", a);
	}
		
	}

}
