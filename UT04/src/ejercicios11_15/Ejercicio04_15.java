package ejercicios11_15;

import java.util.Scanner;

public class Ejercicio04_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);

		System.out.print("Introduce el resultado obtenido al lanzar un dado: ");
		int dado= sc.nextInt();
		
		switch (dado)
		{
		case 1:
			
			System.out.printf("El número que hay en la cara opuesta es el seis");
			
			break;
		
		case 2:
			
			System.out.printf("El número que hay en la cara opuesta es el cinco");
			
			break;
			
		case 3:
			
			System.out.printf("El número que hay en la cara opuesta es el cuatro");
			
			break;
			
		case 4:
			
			System.out.printf("El número que hay en la cara opuesta es el tres");
			
			break;
			
		case 5:
			
			System.out.printf("El número que hay en la cara opuesta es el dos");
			
			break;
			
		case 6:
			
			System.out.printf("El número que hay en la cara opuesta es el uno");
			
			break;
	
		default:
			
			System.out.println("El número introducido es incorrecto.");

		}
		
		
		
		
		
	}

}
