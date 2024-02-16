package es.iesclaradelrey.dm1e2324.calderonmartinezstella.juegocartas;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaJuego {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String respuestaTipoCartas;
		Baraja baraja;

		do {
			System.out.print("Qué tipo de baraja desea jugar (Española (E) / Francesa (F)): ");
			respuestaTipoCartas = sc.next();

		} while (!respuestaTipoCartas.equalsIgnoreCase("E") && !respuestaTipoCartas.equalsIgnoreCase("F"));

		if (respuestaTipoCartas.equals("E"))
			baraja = new BarajaEspañola();
		else {
			baraja = new BarajaFrancesa();
		}

		String respuestaCantidadJugadores;

		boolean correcto = false;
		int cantidadJugadores;
		while (!correcto) {
			try {
				System.out.printf("Con cuántos judadores quieres jugar (2-6): ");
				respuestaCantidadJugadores = sc.next();
				cantidadJugadores = Integer.parseInt(respuestaCantidadJugadores);
				if (cantidadJugadores < 2 || cantidadJugadores > 6)
					throw new IllegalArgumentException();

				correcto = true;
			} catch (IllegalArgumentException a) {
				System.out.println("El número de jugadores no es válido.");
			}
		}

	}

}
