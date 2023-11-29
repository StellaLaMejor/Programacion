package ejercicios11_15;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05_11 {

	public static void main(String[] args) {
		
	/*Crea un programa que 
	•	Cree un array de 100 números aleatorios entre 1000 y 2000.
	•	Pregunte al usuario un número entre 1000 y 2000.
	•	Cuente cuántas veces aparece en el array el número que ha introducido el usuario.
	Utiliza métodos en tu programa. Al menos:
	•	Un método para generar el array de números aleatorios. Recibe la cantidad de números a generar, y devuelve un nuevo array con los números generados.
	•	Un método para buscar en el array el número que ha introducido el usuario.
*/
		Scanner sc= new Scanner (System.in);
		
		int cantidadNumeros= 100;
		
		int[] array = arrayRandom(cantidadNumeros);
		
		
		System.out.println("Introduce un número entre 1000 y 2000: ");
		int numero= sc.nextInt();
		
		int vecesAparece = buscarNumero(array, numero);
		
		System.out.printf("El número introducido aparece %d veces en el array.", vecesAparece );
	}

	private static int [] arrayRandom (int cantidad)
	{
		Random rdm= new Random();
		int [] array = new int [cantidad];
		
		for (int i = 0; i < array.length; i++) 
		{
			array[i]= rdm.nextInt(1000, 2001);	
		}	
		
		return array;
	}
	
	private static int buscarNumero (int [] array,int numero)
	{
		int contador=0;
		
		for (int i = 0; i < array.length; i++) 
		{
			if(numero==array[i])
			{
				contador++;
			}
		}
		return contador;
	}
}
