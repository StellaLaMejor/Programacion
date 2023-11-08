package ejercicios01_05;

import java.util.Random;

public class Ejercicio05_04 {

	public static void main(String[] args) {
		
		/*Escribe un programa que genere 100 números aleatorios menores que 100 (de 0 a 99), 
		 * y los almacene en un array. Luego debe calcular la suma y la media de los números introducidos. 
Usa al menos los siguientes métodos:
•	generarNumeros. Hay dos opciones:
o	Recibe un array de cierto tamaño y lo llena de números aleatorios.
o	Recibe el tamaño del array que queremos crear, y devuelve un array, de ese tamaño, lleno de números 
	aleatorios.
•	calcularSuma. Recibe el array de números y devuelve la suma de los números.
•	calcularMedia. Recibe el array de números y devuelve la media de los números. 
	Recomendación: para simplificar este método, puedes llamar al método calcularSuma
*/
		
		int[] tamanioArray= new int [2];
				
		tamanioArray= array(tamanioArray);
		
	     for (int numero : tamanioArray) 
	     {
	            System.out.print(numero + " ");
	     }
	     System.out.println();
	     System.out.println("La suma de los números anteriores es: "+calcularSumaArray(tamanioArray));
	     System.out.println("La media de los números anteriores es: "+calcularMediaArray(tamanioArray));

	}
	private static int[] array (int[] tamanioArray)
	{
		Random rdm= new Random();
		for (int i = 0; i < tamanioArray.length; i++) 
		{
			tamanioArray[i]= rdm.nextInt(0,100);
		}
		return tamanioArray;
	}
	private static int calcularSumaArray (int[] array)
	{
		int suma=0; 
		
		for (int i = 0; i < array.length; i++) 
		{
			suma+= array[i];
		}
		
		return suma;
	}

	private static int calcularMediaArray (int [] numeros)
	{
		int suma= calcularSumaArray(numeros);
		int media= suma / numeros.length;
		return media;
	}


}
