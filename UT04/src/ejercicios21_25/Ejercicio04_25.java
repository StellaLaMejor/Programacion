package ejercicios21_25;

import java.util.Scanner;

public class Ejercicio04_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Igresa el valor que quieres multiplicar: ");
		int n1= sc.nextInt();
		
		for(int num=1;num <=10; num++)
		{
			System.out.printf("  %d X %d = %d\n", n1, num, n1*num);
		}
		
		
		
	}

}
