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
		
		
//		ESTÁ SIN TERMINAR
		
		Scanner sc= new Scanner (System.in);
		
		
		System.out.println("Indica un número: ");
		int num= sc.nextInt();
		
		double raiz= Math.sqrt(num);
		int i= 2;
		
		while((num%num==0 && num%1==0)|| num==2 || num==3 || num>1)
		{
			for(;i <= raiz;i++)
			{
				System.out.printf("El número %d es primo.", num);
			}	
		}
		
		System.out.printf("El número %d no es primo.", num);

	}

}
