package examen1parcial;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	/*
Una sucesión numérica es una lista de números (conocidos como términos) que siguen una regla, un patrón.
Por ejemplo, la sucesión 1, 2, 5, 10, 13, 26, 29, 58, 61, 122, 125, 250, … se forma de la siguiente manera:

	• El primer término (posición 1) es 1.
	• Los términos en posición par se calculan multiplicando por dos el término anterior.
	• Los términos en posición impar (excepto el primero) se forman sumando tres al término anterior.
	• Los cálculos serían:
		o 1 (el primer término siempre es 1)
		o 2 = 1 x 2
		o 5 = 2 + 3
		o 10 = 5 x 2
		o 13 = 10 + 3
		o 26 = 13 x 2
		o 29 = 26 + 3

	Esta sucesión tiende a infinito, nunca deja de crecer.
	Crea un programa que permita generar los primeros “n” términos de la sucesión. El programa:
		• Preguntará al usuario cuántos términos de la sucesión quiere generar (entero mayor que cero).
		• Generará los términos de la sucesión, mostrándolos en la consola en una misma línea, separados por
		un espacio.
	A tener en cuenta:
		• Se puede asumir que el usuario siempre va a introducir un número entero mayor que cero, no hace
		falta comprobar si el número es correcto
		• Es obligatorio usar un método para crear la sucesión. Este método recibirá la cantidad de términos
		que se desean generar. */

		Scanner sc= new Scanner (System.in);
		
		System.out.print("¿Cuántos términos de la sucesión quieres generar? ");
		int cantidad= sc.nextInt();
		
		sucesion(cantidad);
		
	}
	
	private static void sucesion (int cantidad)
	{
		int numero=1;
		
		for(int i=1; i <= cantidad;i++)
		{

			if (i % 2== 0)
			{
				numero= numero*2;
			}
			else if (i > 1)
			{
				numero= numero +3;
			}
			System.out.print(numero+ ", ");


		}
	}
}
