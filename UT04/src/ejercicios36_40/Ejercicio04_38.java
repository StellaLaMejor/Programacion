package ejercicios36_40;

import java.util.Scanner;

public class Ejercicio04_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe un programa que pregunte una frase al usuario. Mostrará cuantas
		 * vocales hay en la frase introducida por el usuario. Se considerarán vocales
		 * las siguientes letras: 
		 * • Vocales minúsculas y mayúsculas: a, e, i, o, u, A, E, I, O, U. 
		 * • Vocales minúsculas y mayúsculas con tilde: á, é, í, ó, ú, Á, É,Í, Ó, Ú. 
		 * • La u con diéresis, tanto minúscula como mayúscula: ü, Ü. Aunque
		 * hay varias formas de hacerlo, unas pistas para una de las formas más
		 * flexibles, que permite incorporar ciertos cambios prácticamente sin tocar
		 * código: 
		 * • Se puede recorrer la cadena introducida por el usuario con un
		 * bucle, extrayendo caracteres con charAt. 
		 * • Se puede crear una constante con todas las letras que consideramos vocales válidas. 
		 * • Se puede usar indexOf en la constante para saber si un carácter es una vocal válida.
		 */
		
		Scanner sc= new Scanner (System.in);

		System.out.printf("Introduce una frase: ");
		String frase= sc.nextLine();
		char vocal;
		int contador =0;
		
		for (int i = 0; i < frase.length(); i++) 
		{
		   vocal= Character.toLowerCase(frase.charAt(i));
		   
		   if(vocal == 'a' ||vocal == 'e' ||vocal == 'i' || vocal == 'o' ||vocal == 'u' ||vocal == 'á' ||vocal == 'é' ||vocal == 'í' ||vocal == 'ó' ||vocal == 'ú' ||vocal == 'ü') 
		   {
			   contador++;
		   }
		}
		 System.out.printf("Has puesto %d vocales.", contador);
		
	}

}
