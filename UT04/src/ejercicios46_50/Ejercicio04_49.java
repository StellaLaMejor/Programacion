package ejercicios46_50;

import java.util.Scanner;

public class Ejercicio04_49 {

	/*
	 * Ya hay métodos en la API de Java para hacer lo que hace el método del
	 * ejercicio 48. Y mejor, porque funciona con números negativos. Busca dos
	 * formas de hacer lo mismo, usando métodos de la API de Java, y comprueba si el
	 * resultado es el mismo.
	 */

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc= new Scanner(System.in);
		
		System.out.print("Intruduce el número que quieras pasar a binario:");
		int a= sc.nextInt();
		String binaryString = Integer.toBinaryString(a);
		System.out.println("El número introducido en binario es: "+ binaryString);
		sc.close();

	}

}
