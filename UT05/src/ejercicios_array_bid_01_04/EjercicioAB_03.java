package ejercicios_array_bid_01_04;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class EjercicioAB_03 {

	public static void main(String[] args) {
		/*Escribe un programa que:
•	Pida al usuario un número n
•	Cree un array de dos dimensiones de n filas y n columnas 
•	Rellene el array con números aleatorios menores que 10
•	Presente el array en pantalla
•	Trasponga el array (las filas pasan a columnas y las columnas a filas)
•	Vuelva a presentar el array en pantalla
•	Trasponer una matriz:
*/
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("Introduce un número: ");
		int numero =sc.nextInt();
		
		int [][] arrayBi = new int [numero][numero];
		
		llenarArrayRandom(arrayBi);
		mostrarArray2D(arrayBi);
		
		int [][] arrayTraspuesta = trasponerArray(arrayBi);
		mostrarArray2D(arrayTraspuesta);

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
	private static void mostrarArray2D (int [][] arrayBi) 
	{
		for (int i = 0; i < arrayBi.length; i++) 
		{
			for (int j = 0; j < arrayBi.length; j++) 
			{
				System.out.printf("%02d ", arrayBi[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	private static int [][] trasponerArray (int [][] arrayBi)
	{
		int filas= arrayBi.length;
		int columnas= arrayBi[filas-1].length;
		int [][] arrayTraspuesto =new int [columnas][filas];
		for (int i = 0; i < filas; i++) 
		{
			for (int j = 0; j < columnas; j++) 
			{
				arrayTraspuesto[j][i]= arrayBi[i][j];
			}
		}
		return arrayTraspuesto;
	}
}
