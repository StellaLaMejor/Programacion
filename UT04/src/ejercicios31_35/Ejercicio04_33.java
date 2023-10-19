package ejercicios31_35;

import java.util.Scanner;

public class Ejercicio04_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe un programa que diga si un número introducido por teclado es o no
		 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
		 * unidad. La estrategia más habitual es comprobar si el número es divisible por
		 * algún número menor que él, además de el 1. Para optimizar el algoritmo, basta
		 * con probar con los números desde 2 hasta la raíz cuadrada del número que
		 * estamos probando.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Indica un número: ");
		int num = sc.nextInt();

		int raiz = (int) Math.sqrt(num);

		boolean esDivisiblePorAlguno = false;

		for (int i = 2; i <= raiz && !esDivisiblePorAlguno; i++) 
		{
			// Comprobar si el número es divisible por i. Si lo es, no es primo, así que
			// hago que esDivisiblePorAlguno sea true. 
			if (num%i==0)
			{
				esDivisiblePorAlguno= true;
			}
		}
		
		if(num<=1 ||esDivisiblePorAlguno)
		{
				System.out.printf("El número %d no es primo.", num);
		}
		else
		{
			System.out.printf("El número %d es primo.", num);	
		}
		
	}

}
