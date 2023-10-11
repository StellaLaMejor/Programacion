package ejecicios03_17;

import java.util.Scanner;

public class Ejercicio03_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner (System.in);
	System.out.println("Dime un número");
	int a= sc.nextInt();
	double raizcuadrada= Math.sqrt(a);
	double raizcubica= Math.cbrt(a);
	double raizquinta= Math.pow(a, (1D / 5D));
	
	System.out.printf("La raíz cúbica de %d es %.2f, la raíz cúbica es %.2f y la raíz quinta es %.2f \n", a, raizcuadrada, raizcubica, raizquinta);
		
	}

}
