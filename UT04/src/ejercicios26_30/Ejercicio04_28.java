package ejercicios26_30;

import java.util.Scanner;

public class Ejercicio04_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	Hacer un programa igual que el del ejercicio 27, pero en lugar de mostrar 
//	un mensaje por cada número introducido, mostrará cuántos números positivos, 
//	cuántos negativos y cuántos ceros se han introducido.		
		
		Scanner sc= new Scanner (System.in);

		
		System.out.print("Cantidad de números que se quieren procesar: ");
		int cantidad = sc.nextInt();
		int i=1;
		
		int positivos=0;
		int negativos=0;
		int cero=0;
		
		while(i<=cantidad)
		{
			System.out.print("\nIntroduce un número: ");
			int num=sc.nextInt();
			
				if(num>0)
				{
					positivos++;
				}
				if (num<0)
				{
					negativos++;
				}
				if (num==0)
				{
					cero++;
				}
			i++;
		}
		
		System.out.printf("\nNúmeros postivos introducidos: %d\nNúmeros negativos introducidos: %d\nNúmeros 0 introducidos: %d\n\n", positivos, negativos, cero);
		System.out.println("Fin del programa.");
		
	
	}

}
