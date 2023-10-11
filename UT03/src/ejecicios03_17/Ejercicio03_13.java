package ejecicios03_17;

import java.util.Scanner;

public class Ejercicio03_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
	System.out.println("Indica el número x1");
	int x1= sc.nextInt();
	System.out.println("Indica el número y1");
	int y1= sc.nextInt();
	System.out.println("Indica el número x2");
	int x2= sc.nextInt();
	System.out.println("Indica el número y2");
	int y2= sc.nextInt();
		
	double a = Math.sqrt(Math.pow(x2 - x1 , 2)+ Math.pow(y2 - y1 , 2));
	
	System.out.printf("La distancia entre %d, %d, %d y %d es %.2f", x1, y1, x2, y2, a);
	
	
	}

}

