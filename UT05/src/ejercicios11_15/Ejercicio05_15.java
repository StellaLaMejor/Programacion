package ejercicios11_15;

import java.util.Scanner;

public class Ejercicio05_15 {
	
	final static int POSICIONES= 10;

	public static void main(String[] args) {
		
/*Hacer un programa en Java que permita insertar valores en un array manteniéndolo ordenado. Para ellos vamos a:
 * 
•	Crear un array de 10 posiciones, que inicializaremos todas con el valor cero.
•	Pediremos al usuario que introduzca números mayores que cero. Seguiremos pidiendo números hasta que el usuario introduzca un 
	número menor o igual a cero.
•	Cada número que el usuario introduzca se incluirá en el array, pero manteniendo el array ordenado de menor a mayor.
•	Los ceros en el array indican posiciones “vacías”, que no han sido utilizadas.
•	Al insertar un número en el array, los números “a la derecha” del insertado deben desplazarse para dejarle sitio.
•	Si el array está ya lleno (no quedan ceros al final):
o	Si el número a insertar es mayor que todos los del array, se descarta (no se inserta.
o	Si se inserta, al desplazar todos los números a la derecha, el que hasta entonces era el mayor número se descartará.
•	Cada vez que el usuario indica un número se mostrará el array antes y después de la inserción.
*/
		Scanner sc= new Scanner (System.in);
		int[] arrayCon0= new int [POSICIONES];
		
		System.out.println("Números iniciales: ");
		arrayCon0= numerosIniciales(sc, arrayCon0);	
		pedirNumeros(sc, arrayCon0);
	}
	
	private static int [] numerosIniciales (Scanner sc, int [] arrayCon0)
	{

		for (int i = 0; i < arrayCon0.length; i++) 
		{
			System.out.print(arrayCon0[i]+ " ");
		}
		return arrayCon0;
	}
	private static int [] pedirNumeros (Scanner sc, int [] arrayCon0)
	{
		System.out.print("\nIntroduce un número: ");
		int num= sc.nextInt();
		
		arrayCon0[0]=num;
		
		numerosIniciales(sc, arrayCon0);
		
		for (int i = 1; i < arrayCon0.length; i++) 
		{
			System.out.println("\nIntroduce un número: ");
			num= sc.nextInt();
			
			if(num<arrayCon0[i] && arrayCon0[i]!=0)
			{
				arrayCon0[i]=arrayCon0[i-1];
			}
			else if(num>arrayCon0[i] && arrayCon0[i]!=0)
			{
				arrayCon0[i]=arrayCon0[i+1];
			}
			
			numerosIniciales(sc, arrayCon0);

		}
		return arrayCon0;
	}

}
