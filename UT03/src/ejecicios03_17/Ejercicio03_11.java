package ejecicios03_17;

import java.util.Scanner;

public class Ejercicio03_11 {

	final static double PROMEDIO_PARCIALES= 0.55;
	final static double EXAMEN_FINAL= 0.30;
	final static double TRABAJO_FINAL= 0.15;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

	System.out.println("Indica la calificación del primer exámen parcial");
	double examen1 = sc.nextDouble();
	System.out.println("Indica la calificación del segundo exámen parcial");
	double examen2 = sc.nextDouble();
	System.out.println("Indica la calificación del tercer exámen parcial");
	double examen3 = sc.nextDouble();
	System.out.println("Indica la calificación del exámen final");
	double examenf = sc.nextDouble();
	System.out.println("Indica la calificación del trabajo final");
	double trabajof = sc.nextDouble();
	
	double a= ((examen1 + examen2+ examen3)/3)* PROMEDIO_PARCIALES;
	double b= examenf* EXAMEN_FINAL;
	double c= trabajof * TRABAJO_FINAL;
	double m= a+ b+ c;
	
	System.out.printf("Tu calificación final es %.2f", m );
	
	}

}
