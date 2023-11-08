package ejercicios01_05;

import java.util.Scanner;

public class Ejercicio05_05 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida 10 números por teclado, los almacene en un array
		 * y que luego muestre el máximo valor, el mínimo y las posiciones que ocupan
		 * estos dos números en el array.
		 */

		Scanner sc= new Scanner (System.in);
		
		int[] numeros= new int[4];
		
		for (int i = 0; i < numeros.length; i++) 
		{
			System.out.printf("Introduce un número para la posición %d: ",i+1);	
			numeros[i]= sc.nextInt();
		}
		int numeroMayor= numeros[0];
		int posicionMayor= 0;
		int numeroMenor= numeros[0];
		int posicionMenor= 0;

		for (int i= 1; i<numeros.length; i++)
		{
			if(numeros[i]>numeroMayor)
			{
				numeroMayor=numeros[i];
				posicionMayor= i+1;
			}
			else if(numeros[i]<numeroMenor)
			{
				numeroMenor=numeros[i];
				posicionMenor= i+1;
			}
		}
		System.out.println("El número mayor introducido es "+ numeroMayor +" y está en la posición "+ posicionMayor);
		System.out.println("El número menor introducido es "+numeroMenor +" y está en la posición "+ posicionMenor);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
