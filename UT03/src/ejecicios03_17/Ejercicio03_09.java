package ejecicios03_17;

import java.util.Scanner;

public class Ejercicio03_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
	System.out.println("Dime tu sueldo base");
	Double a= sc.nextDouble();
	Double b= (((a*10)/100)+ a); 
	System.out.println("El sueldo final es " + b);
	}

}
