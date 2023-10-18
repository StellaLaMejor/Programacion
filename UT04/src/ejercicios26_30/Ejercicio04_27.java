package ejercicios26_30;

import java.util.Scanner;

public class Ejercicio04_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Realizar un programa que:
//			•	Pregunte al usuario cuántos números vamos a procesar.
//			•	Pida al usuario la cantidad de números que ha introducido en el paso anterior, y para cada número 
//				indique si el número es menor que cero, cero o mayor que cero.
//	
		
		Scanner sc= new Scanner (System.in);

		System.out.print("Cantidad de números que se quieren procesar: ");
		int cantidad= sc.nextInt();
		
		int i=1;
		
		while(i<=cantidad)
		{
			System.out.print("\nIntroduce un número: ");
			int num =sc.nextInt();
			
				if (num < 0)
				{
					System.out.printf("El número %d es menor que 0. \n",num);
				}
				else if (num > 0)
				{
					System.out.printf("El número %d es mayor que 0. \n",num);
				}
				else
				{
					System.out.printf("El número %d es igual a 0. \n",num);
				}
			
			i++;
		}
		
		System.out.println("Fin del programa.");
		
		
	}

}
