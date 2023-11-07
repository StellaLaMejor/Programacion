package ejercicios01_05;

import java.util.Scanner;

public class Ejercicio05_03 {

	public static void main(String[] args) {
		
/*Escribe un programa que:
 * 
•	Preguntará la cantidad de números que vamos a procesar. Esta cantidad tiene que ser mayor que cero. Si el usuario introduce 
	un número menor o igual a cero se mostrará un mensaje de error y se volverá a pedir el número. Se repetirá el proceso hasta que se introduzca un valor correcto.
•	Creará un array del tamaño especificado.
•	Pedirá al usuario que introduzca los números uno a uno, y los irá almacenando en el array.
•	Tomará los números que el usuario introdujo, y los mostrará en la consola. Primero desde el primero al último (el mismo orden en que los introdujo el usuario) 
	y luego desde el último al primero.
	
Usa al menos los siguientes métodos:
•	pedirCantidadNumeros. Pide al usuario la cantidad de números que se van a procesar. Se encarga de controlar que es un valor mayor que cero, y de repetir la 
	pregunta hasta que el usuario introduzca el valor adecuado.
•	pedirNumeros. Dos opciones:
o		Recibe un array y pide números al usuario para rellenarlo.
o		Recibe el tamaño del array que queremos crear, y devuelve un array, de ese tamaño, lleno de números que se preguntan al usuario.
•	mostrarNumerosOrdenNormal. Muestra los números del array en el orden en que se introdujeron.
•	mostrarNumerosOrdenInverso. Muestra los números del array en el orden inverso al que se introdujeron.


*/
		Scanner sc= new Scanner (System.in);
	 
		int [] numeritos = pedirNumeros(sc, pedirCantidadNumeros(sc));
		
		mostrarNumerosOrdenNormal(numeritos);
		mostrarNumerosOrdenInverso(numeritos);		
	
	}

	private static int pedirCantidadNumeros (Scanner sc)
	{
		System.out.println("Introduce la cantidad de números que quieres procesar: ");
		int respuesta= sc.nextInt();
		
		while (respuesta<1)
		{
			System.out.println("Introduce la cantidad de números que quieres procesar: ");
			respuesta= sc.nextInt();			
		}
		return respuesta;
	}
	
	private static int [] pedirNumeros (Scanner sc, int cantidad)
	{
		int [] arrayCompleta = new int[cantidad];
				
		for (int i = 0; i < arrayCompleta.length; i++) 
		{
			System.out.print("Introduce un número: ");
			int numero= sc.nextInt();
			
			arrayCompleta[i]= numero ;
			
		}
		return arrayCompleta;
	}
	
	private static void mostrarNumerosOrdenNormal (int [] arrayCompleta)
	{
		for (int i = 0; i < arrayCompleta.length; i++) 
		{
			System.out.println("Los números en orden normal son: "+arrayCompleta[i]);
		}
		
	}
	
	private static void mostrarNumerosOrdenInverso (int[] arrayCompleta)
	{
		for (int i = arrayCompleta.length-1; i >= 0; i--) 
		{
		System.out.println("Los números en orden inverso son: "+ arrayCompleta[i]);	
		}
	}
	
	
	
	
	
	
	
	
	
}










































