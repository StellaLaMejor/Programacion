package ejercicios06_10;

import java.util.Scanner;

public class Ejercicio05_06 {

	public static void main(String[] args) {

/*Modifica el código del ejercicio 05 para que se usen estos métodos que debes implementar como métodos estáticos del programa principal:
•	Método buscaMaximo que recibe el array y que devuelve la posición en la que se encuentra el valor máximo.
•	Método buscaMinimo que recibe el array y que devuelve la posición en la que se encuentra el valor mínimo.
*/

Scanner sc= new Scanner (System.in);
		
		int[] numeros= new int[4];
		
		for (int i = 0; i < numeros.length; i++) 
		{
			System.out.printf("Introduce un número para la posición %d: ",i+1);	
			numeros[i]= sc.nextInt();
		}
	
		System.out.println("El número mayor está en la posición "+ buscaMaximo(numeros));
		System.out.println("El número menor está en la posición "+ buscaMinimo(numeros));

	}

	private static int buscaMaximo (int [] numeros)
	{
		int numeroMayor= numeros[0];
		int posicionMayor= 0;
		
		for (int i= 1; i<numeros.length; i++)
		{
			if(numeros[i]>numeroMayor)
			{
				posicionMayor= i+1;
			}
		}
		return posicionMayor;
	}
	
	private static int buscaMinimo (int [] numeros)
	{

		int numeroMenor= numeros[0];
		int posicionMenor= 0;
		
		for (int i= 1; i<numeros.length; i++)
		{
			if(numeros[i]<numeroMenor)
			{
				posicionMenor= i+1;
			}
		}
		return posicionMenor;
	}

}
