package ejercicios16_20;

import java.util.Scanner;

public class Ejercicio04_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);

		System.out.print("Intruduce un número: ");
		int n1= sc.nextInt();
		System.out.print("Intruduce otro número: ");
		int n2= sc.nextInt();
		System.out.print("Operaciones disponibles: "
						+ "\n \t SUMAR"
						+ "\n \t RESTAR"
						+ "\n \t MULTIPLICAR"
						+ "\n \t DIVIDIR\n");
		
		System.out.println("\n¿Qué operación quieres hacer? ");
		String operacion = sc.next();
		
		if (!operacion.equalsIgnoreCase("sumar") && !operacion.equalsIgnoreCase("restar")
				&& !operacion.equalsIgnoreCase("restar") && !operacion.equalsIgnoreCase("multiplicar")
				&& !operacion.equalsIgnoreCase("dividir"))
		{
			System.out.println("La operación que quieres hacer no existe.");
		}
			else if (operacion.equalsIgnoreCase("sumar"))
			{
				System.out.printf("El resultado de %d + %d = %d",n1, n2, n1+n2);
				
			} else if (operacion.equalsIgnoreCase("restar"))
			{
				System.out.printf("El resultado de %d - %d = %d",n1, n2, n1-n2);
			}
			else if (operacion.equalsIgnoreCase("multiplicar"))
			{
				System.out.printf("El resultado de %d x %d = %d", n1, n2, n1*n2);
			}
			else if (operacion.equalsIgnoreCase("dividir"))
			{
				System.out.printf("El resultado de %d : %d = %d",n1, n2, n1/n2);
			}
			else
			{
				System.out.printf("ERROR");
			}

		
		
	}

}
