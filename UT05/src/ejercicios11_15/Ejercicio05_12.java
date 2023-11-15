package ejercicios11_15;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05_12 {
	
	private static final int MAX_NUMERO=15;
	private static final int MIN_NUMERO=0;

	public static void main(String[] args) {
		
	/*Crea un programa que:
	•	Pregunte al usuario cuántos números desea generar, que tendrá que ser un valor entre 10 y 100 ambos incluidos. 
		Si el usuario introduce un número menor que 10 o mayor que 100 se le volverá a preguntar. 
	•	Cree un array con tantos números aleatorios como haya indicado el usuario. Cada número tendrá que ser un valor 
		entre 0 y 1000 ambos incluidos, y no podrán repetirse, no podrá aparecer el mismo número en el array dos veces.
	•	Muestre el array en pantalla.
	A tener en cuenta:
	•	El array se debe crear con un método que:
	o	Recibe la cantidad de números a generar.
	o	Recibe el valor mínimo y el valor máximo para generar los números aleatorios
	o	Devuelve el array con los números creados.
	•	El array se debe mostrar con un método que muestra los números del array separados por guiones (-).
	*/
		
		Scanner sc= new Scanner (System.in);
		Random rdm= new Random ();
		
		
		int cantidad=0;
		
		do
		{
			System.out.print("Introduce la cantidad de números que deseas generar (mayor 10 y menor de 100): ");
			cantidad= sc.nextInt();	
			
		} while (cantidad<10 || cantidad >100);
		
		int[] array = new int[cantidad];

		for (int i = 0; i < array.length; i++) 
		{
			int candidato=rdm.nextInt(MIN_NUMERO,MAX_NUMERO+1);
			
				while(contieneNumero(array, candidato, i))
				{
					candidato=rdm.nextInt(0,1001);
				}
				
			array[i]= candidato;
		}
		for (int i = 0; i < array.length; i++) 
		{
			if(i!=0)
			{
			System.out.print(" - "+ array[i]);
	
			}
			else
			{
				System.out.print(array[i]);				
			}
		}
	}
	
	private static boolean contieneNumero (int [] array, int numero, int hastaPosicion)
	{
		for (int i = 0; (i< array.length) && (i < hastaPosicion); i++) 
		{
			int j = array[i];
			if (j==numero)
			{
				return true;
			}
		}
		return false;
	}
		

}
