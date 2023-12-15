package ejercicios01_02;


import java.util.Scanner;

public class Ejercicio09_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("Introduce un texto: ");
		String cadena = sc.nextLine();
		
		System.out.print("Intoduce la posición que quieres consultar: ");
		
		boolean correcto= false;
		while (!correcto)
		{
		try 
		{
			int posicion= Integer.parseInt(sc.nextLine());
			System.out.print(cadena.charAt(posicion-1));
			correcto=true;
		}
		catch (NumberFormatException a)
		{
			System.out.println("El número introducido no es un número válido");
			System.out.print("Introduce un número entero: ");
		}

		catch (IndexOutOfBoundsException b)
		{
			System.out.println("El número introducido está fuera de los rangos de la cadena");
			System.out.print("Introduce un número dentro de los límites: ");
		}
		catch (Exception c)
		{
			System.out.println("Error desconocido");
			System.out.print("Introduce un número correcto: ");
		}
		
		
		}
		
	}

}
