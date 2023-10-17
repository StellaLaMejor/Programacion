package ejercicios26_30;

import java.util.Scanner;

public class Ejercicio04_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);

		boolean cero= false;
		
		while(!cero)
		{
			System.out.print("Dime un número (0 para finalizar el programa): ");
			int num= sc.nextInt();
			cero= (num==0);
			
			if(!cero)
			{
				System.out.println("El número introducido es: "+ num+"\n");
			}
			
		}
		
		System.out.println("Fin del programa.");
		
	}

}
