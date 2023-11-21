package ejercicios11_15;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05_14 {

	public static void main(String[] args) {
/*Crear un programa que:
	•	Pida al usuario 5 números enteros, entre 1 y 100, y los almacene en un array.
	•	Genere un array de 25 números aleatorios entre 1 y 100.
	•	Calcule qué números de los que ha introducido el usuario están en el array de números aleatorios.
	•	Muestre en pantalla los números que sí estaban en el array de aleatorios.
Para hacerlo:
•	Crear un método “pedirNumero” que:
	o	Recibe dos parámetros “minimo” y “máximo”, y un scanner ya creado, para poder preguntar al usuario.
	o	Pide al usuario un número entre esos dos valores, ambos incluidos.
	o	Si el usuario no introduce un valor válido, vuelve a preguntar hasta que el usuario lo introduzca correctamente.
	o	Devuelve el valor introducido por el usuario.
•	Crear un método “pedirNumerosAUsuario” que:
	o	Recibe la cantidad de números que tiene que pedir al usuario.
	o	Recibe el máximo y el mínimo (ambos incluidos) que puede escribir el usuario.
	o	Crea un array del tamaño adecuado para guardar los números.
	o	Usando el método “pedirNumero”, pregunta al usuario todos los números necesarios para llenar el array.
	o	Devuelve el array de números.
•	Crear un método “generarNumerosAleatorios” que:
	o	Recibe la cantidad de números a generar, y los valores máximo y mínimo (ambos incluidos) para los números generados.
	o	Crea un array del tamaño adecuado.
	o	Genera números aleatorios en el rango indicado y rellena con ellos el array.
	o	Devuelve el array.
•	Crear un método “buscarNumeros” que:
	o	Recibe dos arrays, uno con el conjunto de números que buscamos (el array de números que ha cargado el usuario) y otro con el conjunto de 
		números entre los que queremos buscar (el array de aleatorios).
	o	Devuelve un array de boolean del mismo tamaño que el array de números buscados (cargados por el usuario), de forma que en cada posición del
	 array devuelto aparece true si el número en la misma posición del array de números del usuario aparece en alguna posición del array de aleatorios, y false en caso contrario.
•	Crear un método “mostrarEncontrados” que:
o	Recibe dos arrays: 
		El array de números cargado por el usuario
		El array de boolean indicando si los números del usuario se encontraron en el array de aleatorios.
o	Muestra, para cada número que introdujo el usuario, si apareció o no en el array de aleatorios.
*/

	}

	private static int pedirNumero (Scanner sc, int min, int max)
	{
		System.out.printf("Introduce un número entre %d y %d (ambos incluidos): ", min, max);
		int num= sc.nextInt();
		 
		while (num<min || num>max)
		{
			System.out.println("\nEl número introducio es incorrecto.");
			System.out.printf("Introduce un número entre %d y %d (ambos incluidos): ", min, max);
			num= sc.nextInt();
		}
		return num;
	}
	
	private static int [] pedirNumerosAUsuario (Scanner sc, int cantidad, int min, int max)
	{
		int [] numeros= new int [cantidad];
		
		for (int i = 0; i < numeros.length; i++) 
		{
			numeros[i]=pedirNumero(sc, min, max);
		}
		return numeros;
	}
	
	private static int [] generarNumerosAleatorios (int cantidad, int min, int max)
	{
		int [] numeros= new int [cantidad];
		Random rdm = new Random ();
		
		for (int i = 0; i < numeros.length; i++) 
		{
			numeros[i]= rdm.nextInt(min, max+1);
		}
		return numeros;
	}
}
