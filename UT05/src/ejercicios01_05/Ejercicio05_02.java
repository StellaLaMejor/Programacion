package ejercicios01_05;

import java.util.Scanner;

public class Ejercicio05_02 {
	private static final int CANTIDAD_NOMBRES=3;

	public static void main(String[] args) {
//		Escribe un programa que pida 10 nombres por teclado. Almacena los nombres en un array, y luego muéstralos junto 
//		a la posición que ocupan en el array.
//		Ten en cuenta el tipo de dato más adecuado para guardar un nombre, para usarlo en la declaración del array.

		Scanner sc= new Scanner(System.in);
		String[] nombres= new String [CANTIDAD_NOMBRES];
		
		for (int i=0;i< nombres.length; i++) 
		{
		System.out.println("Introduce un nombre: ");
		String nombreIntroducido= sc.nextLine();
		
		nombres[i]= nombreIntroducido;
		
		System.out.printf("Posición %d - %s", i, nombreIntroducido);
		}

	}

}
