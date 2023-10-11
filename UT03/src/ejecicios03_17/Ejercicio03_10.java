package ejecicios03_17;

import java.util.Scanner;

public class Ejercicio03_10 {
	final static double CONSTANTE= (0.15);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
	System.out.println("Introduce el precio sin el descuento");
	double a = sc.nextDouble();
	double tc = a * CONSTANTE;
	double b = a - tc;
	
	System.out.println("El precio con el descuento es " + b);
	


	}

}
