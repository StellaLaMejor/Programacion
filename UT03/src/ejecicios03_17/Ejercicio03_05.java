package ejecicios03_17;

import java.util.Scanner;

public class Ejercicio03_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");
		int numero1= sc.nextInt();
		System.out.println("Dime otro número");
		int numero2= sc.nextInt();
		System.out.println("La suma de " + numero1 + " y " + numero2 +" es: " + (numero1 + numero2 ));
		System.out.printf("La suma de %d y %d es %d\n", numero1, numero2, numero1 + numero2 );
		System.out.println("Suma de los números: " + (numero1 + numero2 ));
		System.out.println("Resta de los números: " + (numero1 - numero2 ));
		System.out.println("Multiplicación de los números: " + (numero1 * numero2 ));
		System.out.println("División de los números: " + (numero1 / numero2 ));
		System.out.println("División del 1er número entre el 2º: " + (numero2 / numero1 ));
	}

}
