package ejercicios06_10;

import java.util.Scanner;

public class Ejercicio04_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);

System.out.println("Indica un año: ");
	int anio= sc.nextInt();
	
	if ((anio % 4 == 0 && anio %4 != 100) || anio % 400 ==0) {
		System.out.printf("El año %d es un año bisiesto.", anio);
	} else {
		System.out.println("El año %d no es un año bisiesto.");
	}


















	}

}
