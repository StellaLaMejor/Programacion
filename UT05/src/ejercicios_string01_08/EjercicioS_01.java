package ejercicios_string01_08;

import java.util.Scanner;

public class EjercicioS_01 {

	public static void main(String[] args) {

		/*Crea un método insertarGuionesCadena que:
•	Recibe una cadena como parámetro
•	Devuelve una nueva cadena con los mismos caracteres de la cadena uno a uno, pero separándolos con un guión.
•	Para hacerlo, utiliza el método charAt de la clase String.
•	Si la cadena es null, devuelve null.
Ejemplo:
	insertarGuionesCadena(“101 Dálmatas”) devolvería “1-0-1- -D-á-l-m-a-t-a-s”
*/
		
//		NO TIENE NADA QUE VER PERO .REPLACE (" ", "") SIRVE PARA SUSTITUIR UNA COSA POR OTRA
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una cadena: ");
		
		String cadena= sc.nextLine();
		
		System.out.println(insertarGuionesCadena(cadena));

	}

	private static String insertarGuionesCadena (String cadena)
	{
		String cadenaConGuiones="";
		
		if (cadena==null)
		{
			return "null";
		}
		
		for (int i = 0; i < cadena.length(); i++) 
		{
			cadena= cadena.trim();
			if(i!=0) 
			{
				
//				System.out.print("-");
				cadenaConGuiones=cadenaConGuiones + "-";
			}
//			System.out.print(cadena.charAt(i));
			cadenaConGuiones = cadenaConGuiones + cadena.charAt(i);

		}
		return cadenaConGuiones;
	}
	
	
}
