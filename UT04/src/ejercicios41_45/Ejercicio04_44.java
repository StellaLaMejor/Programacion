package ejercicios41_45;

import java.util.Scanner;

public class Ejercicio04_44 {

	/*
	 * Crea un método “mostrarNVeces” que reciba un mensaje, que será una cadena de
	 * texto (String) y un número entero. Si el número es menor que cero, mostrará
	 * en pantalla un mensaje indicando que es un error. Si el número es mayor que
	 * cero mostrará el mensaje tantas veces como indique el parámetro entero, una
	 * vez en cada línea.
	 */
	
	private static void mostrarNVeces (String mensaje, int numero)
	{
		if (numero!=0)
		{
			for (int i= 0; i< numero; i++)
			{
				System.out.println(mensaje);
			}
		}
		else
		{
			System.out.println("Error");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mostrarNVeces("VIVA HITLER AAAAA", 2);
	}

}
