package ejercicios21_25;

import java.util.Scanner;

public class Ejercicio04_24 {
	
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);

		System.out.println("Dame un número inicial entero: ");
		int n1= sc.nextInt();
		
		System.out.println("Dame un número final entero: ");
		int n2= sc.nextInt();
		
		if (n1>n2)
		{
			System.out.printf("%d no es menor o igual que %d", n1, n2);
		}
		else
		{
		int num= n1;
		while (num<= n2)
		{
			System.out.printf("%d ", num);
			num++;
		}
			
			
			
		}

	}

}
