package ejercicios_array_bid_01_04;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class EjercicioAB_01 {
	private final static int MIN= 0;
	private final static int MAX= 10;

	public static void main(String[] args) {
		/*Escribe un programa que:
•	Pregunte al usuario dos números: filas y columnas
•	Cree un array de dos dimensiones con las filas y columnas especificadas.
•	Rellene el array con números aleatorios menores que 100.
•	Calcule la suma de cada fila y cada columna, y las muestre por pantalla.
Usa métodos para resolver el problema. Por ejemplo:
•	crearArray2D: 
o	Recibe el número de “filas” y “columnas”, y el valor máximo para los elementos del array (límite)
o	Crea el array de 2 dimensiones
o	Lo rellena con aleatorios de 0 a límite-1 
o	Devuelve el array
•	sumarFila: recibe el array y un número de fila y devuelve la suma de los elementos de la fila.
•	sumarColumna: recibe el array y un número de columna, y devuelve la suma de los elementos de la columna.
*/
		
//		para pasar un array a string Arrays.toString(laArrayEnCuestion)
//		para pasar un array bidimensional a string Arrays.deepToString(laArray)
		
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Indica el número de filas: ");
		int filas=sc.nextInt();
		
		System.out.print("Indica el número de columnas: ");
		int columnas=sc.nextInt();
		
		int[][] arrayBi= new int [filas][columnas];
		
		System.out.println();

		arrayBi= arrayBiRandom(arrayBi, MIN, MAX);
		
		mostrarArray2D(arrayBi);
		
		for (int i = 0; i < arrayBi.length; i++) 
		{
			System.out.printf("La suma de la fila %d es: %d ", i, sumarFila(arrayBi, i));
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < arrayBi.length; i++) 
		{
			System.out.printf("La suma de la columna %d es: %d", i, sumarColumna(arrayBi, i));
			System.out.println();
		}
	}

	private static int [][] arrayBiRandom (int [][] arrayBi, int min, int max)
	{
		Random rdm = new Random ();
		for (int i = 0; i < arrayBi.length; i++) 
		{
			for (int j = 0; j < arrayBi[i].length; j++) 
			{
				arrayBi[i][j]= rdm.nextInt(min, max -1);
			}
		}
		return arrayBi;
	}
	
	private static int sumarFila (int [][] arrayBi, int numeroFila)
	{
		int sumaFila= 0;
		for (int i = 0; i < arrayBi[numeroFila].length; i++) 
		{
			
				sumaFila= sumaFila + arrayBi[numeroFila][i];	
		}
		return sumaFila;
	}
	
	private static int sumarColumna (int [][] arrayBi, int numeroColumna)
	{
		int sumaColumna=0;
		for (int i = 0; i < arrayBi.length; i++) 
		{
			sumaColumna= sumaColumna + arrayBi[i][numeroColumna];
		}
		
		return sumaColumna;
	}
	
	private static void mostrarArray2D (int [][] arrayBi)
	{
		for (int i = 0; i < arrayBi.length; i++) 
		{
			for (int j = 0; j < arrayBi[i].length; j++) 
			{
				System.out.printf("%02d ", arrayBi[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
