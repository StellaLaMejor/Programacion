package ejercicios06_10;

import java.util.Random;

public class Ejercicio05_08 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 99 y
		 * los almacene en un array. Usando métodos, calcula la suma de los números que
		 * están en posiciones pares, y la media de los que están en impares.
		 */
		
		int[] array= new int[20];
		
		arrayAleatorios (array);
		
		for (int i = 0; i < array.length; i++) 
		{
			int a= array[i];
			System.out.println("Posición: "+ i+ " Número: "+ a);	
		}
		numerosParEImp(array);
	}
	
	private static int [] arrayAleatorios (int [] cantidad)
	{
		Random rdn= new Random();
		
		for (int i = 0; i < cantidad.length; i++) 
		{
			cantidad[i]= rdn.nextInt(100);
		}
		
		return cantidad;	
	}
	
	private static void numerosParEImp (int [] array)
	{
		int par= 0;
		int impar=0;
		int contador=0;
			
			for (int i = 0; i < array.length; i++) 
			{
				if(i % 2 == 0)
				{
					par= array[i]+ par;
				}
				else
				{
					impar= array[i]+impar;
					contador++;
				}
			}
		
		System.out.println("la suma de los números que están en una posición par es: "+ par);
		System.out.println("la media de los números que están en una posición impar es: "+ impar/contador);
	}
	
}
	
	
