package ejercicios_string01_08;

import java.util.Scanner;

public class EjercicioS_02 {

	public static void main(String[] args) {
		/*Crea un método insertarGuionesCadena2 que haga lo mismo que el ejercicio 02, pero que internamente:
•	Convierte el parámetro a un array de caracteres
•	Monta un array de caracteres con el resultado (la cadena con los caracteres separados por guiones) 
•	Vuelve a convertir el array en cadena (String) antes de devolverlo
*/

		Scanner sc =new Scanner (System.in);
		
		System.out.println("Introduce una frase:");
		String cadena= sc.nextLine();
		
		System.out.println(insertarGuionesCadena2(cadena));
		
	}


	
	private static String insertarGuionesCadena2 (String cadena)
	{
		String [] arrayCadena= new String [cadena.length()];
		String cadenaA="";
		
		for (int i = 0; i < arrayCadena.length; i++) 
		{
			if(i<arrayCadena.length -1)
			{
				arrayCadena[i]=String.valueOf(cadena.charAt(i));
				cadenaA=cadenaA+ arrayCadena[i] + "-";
			}
			else
			{
				arrayCadena[i]=String.valueOf(cadena.charAt(i));
				cadenaA=cadenaA+ arrayCadena[i];
			}
			
		}

		return cadenaA;
		
		
	}
	
	
	

}
