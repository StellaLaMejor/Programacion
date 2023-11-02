package ejercicios51_53;

import java.util.Scanner;

public class Ejercicio04_52 {

	public static void main(String[] args) {
		/*Crea un método “pedirConfirmacion” que:
		•	Recibe dos parámetros:
		o	Un objeto Scanner, para poder interactuar con el usuario.
		o	Un mensaje, que será la pregunta a la que el usuario tiene que responder “S” o “N”.
		•	Devuelve un boolean, true si ha respondido “S” y false si ha respondido “N”
		Este método realizará el siguiente proceso:
		•	Pedirá al usuario, usando el mensaje que ha recibido como parámetro, que responda a la pregunta.
		•	Si el usuario responde con cualquier cosa distinta a “S”, “s”, “N” o “n”, mostrará un mensaje de error del tipo 
		“El valor introducido no es válido. Sólo puede responder S/N”.
		•	Devolverá el valor adecuado en función de lo que haya introducido el usuario.
		Haz un pequeño programa principal para poder probar el método.
		*/
		
		Scanner sc= new Scanner (System.in);
	
		pedirConfirmacion(sc, "¿Vas a aprobar?", "Seguro/a?");
		
	}
	
	private static void pedirConfirmacion (Scanner sc, String pregunta, String pregunta2)
	{
		boolean a= false;
		
		System.out.println(pregunta);
		String respuesta= sc.next();
		
		if(respuesta.toLowerCase().equals("s"))
		{
			a= true;
		}
		else if(respuesta.toLowerCase().equals("n"))
		{
			a =false;
		}

		while (!respuesta.toLowerCase().equals("s") && !respuesta.toLowerCase().equals("n"))
		{
			System.out.println("El valor introducido no es válido. Sólo puede responder S/N");

			System.out.println(pregunta);
			respuesta= sc.next();
			
			if(respuesta.equals("s"))
			{
				a=true;
			}
		}
		if(a== true)
		{
			System.out.println(pregunta2);
			respuesta=sc.next();
		}
		
	}
	
	
}
