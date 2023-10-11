package ejercicios01_05;

import java.util.Scanner;

public class Ejercicio04_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
	System.out.println("Dime 2 números");
		int a= sc.nextInt();
		int b= sc.nextInt();
		
	if (b==0) {
		System.out.println("No se puede hacer esta operación");
	} else {
		System.out.printf("La división de %d y %d es igual a %.2f", a, b, (double) a/b);
	}

	}

}
