package ejecicios03_17;

import java.util.Scanner;

public class Ejercicio03_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
	System.out.println("Dime el primer número");
	int primer= sc.nextInt();
	System.out.println("Dime el segundo número");
	int segundo= sc.nextInt();
	
	int a= Math.abs (primer- segundo);
	
			
	System.out.printf("La distancia ente %d y %d es %d", primer, segundo, a);
	}

}
