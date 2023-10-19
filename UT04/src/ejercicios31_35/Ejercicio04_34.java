package ejercicios31_35;

import java.util.Scanner;

public class Ejercicio04_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Programa que muestra en pantalla los N primeros números primos. Se pide por
		 * teclado la cantidad de números primos que queremos mostrar.
		 */
		
		Scanner sc= new Scanner (System.in);
			
		System.out.print("Cantidad de números primos que quieres mostrar: ");
		int cantidad= sc.nextInt();
		
		int num=2;
		int encontrados= 1;
		
		while (encontrados<= cantidad)
		{
			boolean primo=true;
			for (int i=2; i<= Math.sqrt(num); i++)
			{
				if(num%i==0)
				{
					primo= false;
				}
			}
			if(primo)
			{
				System.out.println(num);
				encontrados++;
			}
		
			num++;
		}
		
	}

}
