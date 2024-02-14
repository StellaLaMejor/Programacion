package es.iesclaradelrey.dm1e2324.calderonmartinezstella.juegocartas;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaJuego {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String respuesta;

		do {

			System.out.println("Qué tipo de baraja desea jugar (Española (E) / Francesa (F))");
			respuesta = sc.next();

		} while (!respuesta.equals("E") && !respuesta.equals("F"));
		
		Baraja baraja = new BarajaEspañola();
	}
	

}
