package ejecicios03_17;

import java.util.Scanner;

public class Ejercicio03_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
	System.out.println("Cantidad de minutos que quieras pasar a horas");
	int a = sc.nextInt();
	double h = a / 60;
	double m = a % 60;
	System.out.printf("%d minutos son %.0f horas y %.0f minutos \n", a, h, m);
	

	}

}
