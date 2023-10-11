package ejecicios03_17;

import java.util.Scanner;

public class Ejercicio03_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
	System.out.println("Introduce tres números");
	double a= sc.nextDouble();
	double b= sc.nextDouble();	
	double c= sc.nextDouble();
	double d= (double) ((a+b+c)/3);
	

	
	System.out.printf("La la media de %.2f, %.2f y %.2f es %.2f  " , a , b, c, d);
	}

}
