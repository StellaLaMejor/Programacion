package ejercicios_array_bid_01_04;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class EjercicioAB_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Escribe un programa que:
•	Pida al usuario un número n y m
•	Cree un array de dos dimensiones de n filas y m columnas
•	Rellene el array con números aleatorios menores que 10
•	Presente el array en consola
•	Calcule la fila con el mayor valor acumulado. Es decir, la fila en la que la suma 
	de sus elementos sea mayor que la de cualquier otra fila.
•	Calcule la fila con el menor valor acumulado. Es decir, la fila en la que la suma de sus 
	elementos sea menor que la de cualquier otra fila.
•	Permute (intercambie) las filas de menor y mayor valor. Es decir, los valores de la fila 
	encontrada deben pasar a la primera fila, y los de la primera tienen que pasar al sitio que tenían esos valores.
•	Vuelva a presentar el array en consola
*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("Introduce un número de filas: ");
		int filas =sc.nextInt();
		System.out.printf("Introduce un número de columnas: ");
		int columnas =sc.nextInt();
		
		int [][] arrayBi = new int [filas][columnas];
		
		llenarArrayRandom(arrayBi);
		mostrarArray2D(arrayBi);
		
		int filaMasGrande= 0; 
		int numeroFila=0;
		for (int i = 0; i < arrayBi.length; i++) 
		{
			int sumaFila= sumarFila(arrayBi, i);
			if (sumaFila>= filaMasGrande)
			{
				filaMasGrande= sumaFila;
				numeroFila= i;
			}
		}
		System.out.printf("La suma de la fila %d es la más grande (la suma es de %d).", numeroFila+1, filaMasGrande);
		System.out.println();
		
		int filaMasPequenia= Integer.MAX_VALUE;  // Inicializado con el valor máximo posible para un entero 
		numeroFila=0;
		for (int i = 0; i < arrayBi.length; i++) 
		{
			int sumaFila= sumarFila(arrayBi, i);
			if (sumaFila<= filaMasPequenia)
			{
				filaMasPequenia= sumaFila;
				numeroFila= i;
			}
		}
		System.out.printf("La suma de la fila %d es la más pequeña (la suma es de %d).", numeroFila+1, filaMasPequenia);
		
//		Esta parte no la sé hacer.
		
//		int[] filaTemporal = Arrays.copyOf(arrayBi[filaMasGrande], arrayBi[filaMasGrande].length);
//
//		// Copia los valores de la fila con la suma más pequeña en la fila con la suma más grande
//		System.arraycopy(arrayBi[filaMasPequenia], 0, arrayBi[filaMasGrande], 0, arrayBi[filaMasGrande].length);
//
//		// Copia los valores guardados en la fila con la suma más pequeña
//		System.arraycopy(filaTemporal, 0, arrayBi[filaMasPequenia], 0, filaTemporal.length);
//
//		System.out.println("Array después de la permutación:");
//		mostrarArray2D(arrayBi);
	}
	
	private static int [][] llenarArrayRandom (int[][] arrayBi)
	{
		Random rdm= new Random ();

		for (int i = 0; i < arrayBi.length; i++) 
		{
			for (int j = 0; j < arrayBi[i].length; j++) 
			{
				arrayBi[i][j]= rdm.nextInt(10);
			}
		}
		return arrayBi;
	}
	
	private static int sumarFila (int [][] arrayBi, int numeroFila)
	{
		int sumaFila=0;
		for (int i = 0; i < arrayBi[numeroFila].length; i++) 
		{
			sumaFila= sumaFila + arrayBi[numeroFila][i];
		}
		return sumaFila;
	}
	private static int sumarColumna (int [][] arrayBi, int numeroColumna)
	{
		int sumaColumna=0;
		for (int i = 0; i < arrayBi.length ; i++) 
		{
			   if (numeroColumna < arrayBi[i].length) 
			   {
		            sumaColumna += arrayBi[i][numeroColumna];
		       }
		}
		
		return sumaColumna;
	}
	
	private static void mostrarArray2D (int [][] arrayBi)
	{
		for (int i = 0; i < arrayBi.length; i++) 
		{
			for (int j = 0; j < arrayBi[i].length; j++) 
			{
			System.out.printf("%02d ", arrayBi [i][j]);	
			}
			System.out.println();
		}
	}
}
