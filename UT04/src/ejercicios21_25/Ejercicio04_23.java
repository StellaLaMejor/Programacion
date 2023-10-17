package ejercicios21_25;

import java.util.Scanner;

public class Ejercicio04_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
			for(int num = n1; num<=n2;num++)
			{
				System.out.printf("%d ", num);
			}
		}
		
		
	}

}
