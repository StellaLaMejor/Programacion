package ejercicios06_10;

import java.util.Random;

public class Ejercicio05_09 {

	public static void main(String[] args) {
		
/*Escribe un programa que cree un array de 100 posiciones, en el que se almacenen números enteros aleatorios.
 * 
	Queremos procesar cada posición del array según el siguiente algoritmo:
		•	Si el valor en una posición es un número par, lo dividimos entre 2, modificando el valor almacenado en el array en esa posición
		•	Si el valor en una posición es impar, lo multiplicamos por 2, modificando el valor almacenado en el array.
		
	Para hacerlo, usa dos métodos estáticos del programa principal:
	•	Método procesarNumeros, que recibe el array y lo procesa. No devuelve nada, modifica los valores del array.
	•	Método esPar. Recibe un número y devuelve un boolean indicando si el número es par o no. 
*/

		int [] array = new int[10];
		Random rdm= new Random();
		
		for (int i = 0; i < array.length; i++) 
		{
			array[i]= rdm.nextInt(100);
		}
		
		System.out.println("Números no editados: ");
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+ " ");			 
		}
		
		procesarNumeros(array);
		
		
		
	}
	
	private static boolean esPar(int num) {
		if(num % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private static void procesarNumeros (int[] array)
	{
		System.out.println("\nNúmeros editados: ");
	
		for (int i = 0; i < array.length; i++) 
		{
			if ( esPar(array[i])) 
			{
				array[i]= array[i]/2;
			}
			else
			{
				array[i]= array[i]*2;
			}

			System.out.print(array[i]+ " ");
		}
		
		
	}

}
