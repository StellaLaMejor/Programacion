package ejercicios31_35;

import java.util.Scanner;

public class Ejercicio04_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un ejemplo de menú, donde podemos escoger las distintas opciones
		 * hasta que seleccionamos la opción de “Salir”. El menú podría ser algo similar
		 * a esto: 
		 * 1. Opción A 
		 * 2. Opción B 
		 * 3. Opción C 
		 * 4. Opción D 
		 * 9. Salir
		 * Cuando elusuario elige una opción, el programa mostrará “Se ha elegido A“, o 
		 * “Se ha elegido B”, etc. Cuando elija la opción “Salir” el programa mostrará 
		 * “Gracias por usar este menú sin utilidad”.
		 */
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Elige una opción: \n1. Opción A\n2. Opción B\n3. Opción C \n4. Opción D\n9. Salir  " );
		String respuesta= sc.nextLine();
		
		if (respuesta.equalsIgnoreCase("a")|| respuesta.equals("1"))
		{
			System.out.println("Se ha elegido la opción A.");
		}
		else if (respuesta.equalsIgnoreCase("b")|| respuesta.equals("2"))
		{
			System.out.println("Se ha elegido la opción B.");
		}
		else if (respuesta.equalsIgnoreCase("c")|| respuesta.equals("3"))
		{
			System.out.println("Se ha elegido la opción C.");
		}
		else if (respuesta.equalsIgnoreCase("d")|| respuesta.equals("4"))
		{
			System.out.println("Se ha elegido la opción D.");
		}
		else if (respuesta.equalsIgnoreCase("salir")|| respuesta.equals("9"))
		{
			System.out.println("Gracias por usar este menú sin utilidad.");
		}
		else
		{
			System.out.println("Esta opción no es correcta.");
		}

	}

}
