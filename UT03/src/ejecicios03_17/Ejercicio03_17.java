package ejecicios03_17;

import java.util.Scanner;

public class Ejercicio03_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
	System.out.println("Indica el total de monedas de 2€");
	int monedaDosEuros = sc.nextInt();
	System.out.println("Indica el total de monedas de 1€");
	int monedaUnEuro = sc.nextInt();
	System.out.println("Indica el total de monedas de 50 céntimos");
	int cincuentaCentimos = sc.nextInt();
	System.out.println("Indica el total de monedas de 20 céntimos");
	int veinteCentimos = sc.nextInt();
	System.out.println("Indica el total de monedas de 10 céntimos");
	int diezCentimos = sc.nextInt();
	
	int euros= (monedaDosEuros*2)+(monedaUnEuro);
	double centimos= (cincuentaCentimos*0.5) + (veinteCentimos* 0.2) + (diezCentimos*0.1);
	
	Double totalDinero= euros + centimos;
	
	System.out.printf("El dinero total que tienes es %.2f€", totalDinero);


	
	
	
	}

}
