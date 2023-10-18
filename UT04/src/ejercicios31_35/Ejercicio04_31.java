package ejercicios31_35;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio04_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea una aplicación que permita adivinar un número. La aplicación genera un
		 * número aleatorio del 1 al 99. A continuación, va pidiendo números y va
		 * respondiendo si el número a adivinar es mayor o menor que el introducido,
		 * además de informarle de los intentos que le quedan (tiene 10 intentos para
		 * acertarlo). El programa termina cuando se acierta el número (además te dice
		 * en cuantos intentos lo has acertado), si se llega al límite de intentos te
		 * muestra el número que había generado. Para generar un número aleatorio,
		 * podemos usar un objeto de la clase Random. También se puede usar el método
		 * Math.random(), pero es algo más complicado que con la clase Random.
		 */
		Scanner sc= new Scanner (System. in);
		Random rnd= new Random ();
		
		int random= rnd.nextInt(1,100);
		int contador=1;
		int eleccion=0;
		
		
		for (; random !=eleccion && contador <=10;contador++)
		{
			int intentos= 10-contador+1;
			System.out.printf("Ecribe un número del 1 al 99 (tienes %d intentos): ",intentos);
			eleccion= sc.nextInt();
			
			if(eleccion<random)
			{
				System.out.println("El número es mayor al introducido.\n");
			}
			else if (eleccion>random)
			{
				System.out.println("El número es menor al introducido.\n");
			}
		}
		
		if(contador>10)
		{
			System.out.println("Fin de las oportunidades, la resupuesta correcta es: "+random);
		}
		else if(eleccion==random)
		{
			System.out.println("La respuesta es correcta.");
		}
		
	
	}

}
