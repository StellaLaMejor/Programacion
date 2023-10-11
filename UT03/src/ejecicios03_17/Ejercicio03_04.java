package ejecicios03_17;

import java.util.Scanner;

public class Ejercicio03_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
		System.out.println("¿Cuál es la base del rectángulo?");
		int base= sc.nextInt();
		System.out.println("¿Cuál es la altura del rectángulo?");
		int altura= sc.nextInt();
		System.out.println("El parámetro es "+ (base + altura) *2 + " y el área es "+(base * altura));
		
	}

}
