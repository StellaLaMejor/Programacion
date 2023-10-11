package ejercicios01_05;

import java.util.Scanner;

public class Ejercicio04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
	System.out.println("Indícame un número");
		int a= sc.nextInt();
	if (a>0) {
		System.out.printf("El número %d es positivo", a);
	}
	if (a<0) {
		System.out.printf("El número %d es negativo", a);
	} 
	if (a==0) {
		System.out.printf("El número %d es igual a 0", a);
	}

	}

}
