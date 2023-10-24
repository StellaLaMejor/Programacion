package ejercicios36_40;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejercicio04_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Escribe un programa que:
•	Pregunte al usuario una frase, formada por varias palabras.
•	Pregunte al usuario la palabra que quiere buscar en la frase.
•	Localice TODAS las apariciones de la palabra buscada, teniendo en cuenta que no se deben distinguir mayúsculas y minúsculas.
•	Por cada aparición de la palabra buscada, mostrará la posición en la frase.
•	Si la palabra buscada no aparece ninguna vez, no mostrará nada.
•	Antes de salir, mostrará “Fin del programa”.
*/
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Escribe una frase: ");
		String frase =sc.nextLine();
		
		System.out.println("Escribe una palabra que quieras buscar: ");
		String palabra =sc.nextLine();

		frase= frase.toLowerCase();		
		palabra = palabra.toLowerCase();
		
		for (int i = 0; i < frase.length(); i++) 
		{
            int posicion = frase.indexOf(palabra, i);
            i= posicion+i;
            
			if (posicion !=-1)
			{
				System.out.println( posicion);
			}
		}
		
		System.out.println("Fin del programa.");
	}

}
