package ejercicios36_40;

import java.util.Scanner;

public class Ejercicio04_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 * Crea un programa que pida una cadena de texto al usuario. El programa creará
		 * otra cadena de texto en el que estarán todas las letras de la cadena
		 * original, excepto las vocales. Se consideran vocales las mismas letras que en
		 * el problema 04-38.
		 */
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Introduce una cadena de texto: ");
		String frase= sc.nextLine();
		frase= frase.toLowerCase();
		String resultado="";
		
		for (int i = 0; i < frase.length(); i++) 
		{
			char a = frase.charAt(i);
			
			if (a != 'a' && a != 'e' && a != 'i' && a != 'o' && a != 'u' &&a != 'á' &&
					a != 'é' && a != 'í' && a != 'ó' && a != 'ú')
			{
				resultado=resultado+a;
			}
			
		}
		
		System.out.println(resultado);
		
		
		
	}

}
