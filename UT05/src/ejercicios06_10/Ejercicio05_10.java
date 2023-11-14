package ejercicios06_10;

import java.util.Random;

public class Ejercicio05_10 {

	public static void main(String[] args) {
	/*Escribe un programa que:
	•	Cree un array con 20 números enteros aleatorios entre 1 y 20, ambos incluidos.
	•	Muestre el array en la consola, con los valores separados por comas.
	•	Procese el array, poniendo un cero en las posiciones que contengan un número primo.
	•	Muestre de nuevo el array en la consola.

	Para ello, usar:
	•	Un método para generar un array de números aleatorios de un tamaño dado. Recibe el tamaño del array y devuelve un 
		array de números de la longitud indicada, lleno de números aleatorios. 
	•	Un método para calcular si un número es primo o no. Recibe un número y devuelve un boolean indicando si el número es primo o no.
	•	Un método para mostrar el contenido de un array de enteros. Recibe el array y muestra por pantalla (consola) todos los 
		valores del array, separados por coma. No tiene que haber coma al final, tras el último número.
*/
		
		int []array= arrayRandom(20);
		
		muestraArray(array);

		for (int i = 0; i < array.length; i++) 
		{
			boolean primo= esPrimo(array[i]);
			if(primo==true)
			{
				array[i]=0;
			}
		}
		
		muestraArray(array);

	}

	private static int[] arrayRandom (int tamañoArray)
	{
		Random rdm = new Random();
		int[] array = new int[tamañoArray];
		
		for (int i = 0; i < array.length; i++) 
		{
			array [i]= rdm.nextInt(1, 21);
		}
		
		return array;
	}
	
	private static boolean esPrimo (int numero)
	{
		double raiz= Math.sqrt(numero);

		for (int i=2; i<= raiz; i++)
		{
			if( numero % i ==0)
			{
				return false;
			}
		}
		return true;
	}
	
	private static void muestraArray (int []array)
	{
		for (int i = 0; i < array.length; i++) 
		{
			if((i + 1) == array.length)
			{
				System.out.print(array[i]);
			}
			else
			{
				System.out.print(array[i]+ ", ");	
			}
		}
		System.out.println();
	}
}
