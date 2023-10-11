package ejecicios03_17;

import java.util.Scanner;

public class Ejercicio03_16 {

	final static int PUNTOS =5;
	final static int PUNTOS_INCORRECTA= -1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
Scanner sc= new Scanner (System.in);

	System.out.println("Número de respuestas correctas");
		double correctas= sc.nextDouble();
	System.out.println("Número de respuestas incorrectas");
		double incorrectas= sc.nextDouble();
		double notafinal= (correctas* PUNTOS)+(incorrectas*PUNTOS_INCORRECTA);
	System.out.printf("La nota final es %.2f", notafinal);
		
	

	}

}
