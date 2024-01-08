package ejercicios_array_bid_01_04;

import java.util.Random;
import java.util.Scanner;

public class EjercicioAB_02 {
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
		
		/*Amplía el programa del ejercicio 01 para que calcule también:
•	Las medias de las filas y las columnas.
//Los valores máximo y mínimo de cada columna.
//El valor máximo del array al completo.
//Hazlo con métodos nuevos. Estos métodos, siempre que sea posible, deben utilizar los métodos ya creados, para evitar programar de nuevo la iteración del array de dos dimensiones
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
			
			System.out.printf("La suma de la fila %d es: %d ", i+1, sumarFila(arrayBi, i));
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < arrayBi.length; i++) 
		{
			System.out.printf("La suma de la columna %d es: %d", i+1, sumarColumna(arrayBi, i));
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < arrayBi.length; i++) 
		{
			   float media = mediaFila(arrayBi, i);
			    if (media > 0) 
			    {
					System.out.printf("La media de la fila %d es: %.2f ", i+1, mediaFila(arrayBi, i));
					System.out.println();
			    }
		}
		System.out.println();
		for (int i = 0; i < arrayBi.length; i++) 
		{
		   float media = mediaColumna(arrayBi, i);
		    if (media > 0) 
		    {
				System.out.printf("La media de la columna %d es: %.2f  ",i+1, mediaColumna(arrayBi, i));
				System.out.println();
		    }
		}
		System.out.println();
		
	      for (int i = 0; i < arrayBi[0].length; i++) {
	            System.out.printf("El valor máximo de la columna %d es: %d%n", i + 1, maximoColumna(arrayBi, i));
	            System.out.printf("El valor mínimo de la columna %d es: %d%n", i + 1, minimoColumna(arrayBi, i));
	            System.out.println();
	        }
          System.out.println();

	        System.out.printf("El valor máximo del array completo es: %d%n", maximoArray(arrayBi));
	    
	}

	private static int [][] arrayBiRandom (int [][] arrayBi, int min, int max)
	{
		Random rdm = new Random ();
		for (int i = 0; i < arrayBi.length; i++) 
		{
			for (int j = 0; j < arrayBi[i].length; j++) 
			{
				arrayBi[i][j]= rdm.nextInt(min, max+1);
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
				System.out.printf("%02d ", arrayBi[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
		
	private static float mediaFila (int [][] arrayBi, int cantidadNumero)
	{
		int sumaTotal= sumarFila(arrayBi, cantidadNumero);
		float suma1 = (float) sumaTotal;
		float resultado=  suma1/arrayBi[cantidadNumero].length;
		return resultado;
	}
	private static float mediaColumna (int [][] arrayBi, int cantidadNumero)
	{
		int sumaTotal1= sumarColumna(arrayBi, cantidadNumero);
		float sumaTotal = (float) sumaTotal1	;
		float resultado= (float) sumaTotal/arrayBi.length;
		return resultado;
	}
    private static int maximoColumna(int[][] arrayBi, int numeroColumna) {
        int maximo = arrayBi[0][numeroColumna];

        for (int i = 1; i < arrayBi.length; i++) {
            if (numeroColumna < arrayBi[i].length) {
                maximo = Math.max(maximo, arrayBi[i][numeroColumna]);
            }
        }

        return maximo;
    }

    private static int minimoColumna(int[][] arrayBi, int numeroColumna) {
        int minimo = arrayBi[0][numeroColumna];

        for (int i = 1; i < arrayBi.length; i++) {
            if (numeroColumna < arrayBi[i].length) {
                minimo = Math.min(minimo, arrayBi[i][numeroColumna]);
            }
        }

        return minimo;
    }

    private static int maximoArray(int[][] arrayBi) {
        int maximo = arrayBi[0][0];

        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                maximo = Math.max(maximo, arrayBi[i][j]);
            }
        }
        return maximo;
    }

}
