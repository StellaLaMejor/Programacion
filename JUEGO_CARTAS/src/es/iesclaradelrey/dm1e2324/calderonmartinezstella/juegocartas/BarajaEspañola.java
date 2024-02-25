package es.iesclaradelrey.dm1e2324.calderonmartinezstella.juegocartas;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase de una Baraja Española, extiende de la clase Baraja. Implementa los
 * métodos abstractos para crear y barajar la baraja española.
 * 
 * @author Stella
 */

public class BarajaEspañola extends Baraja {

	private ArrayList<Carta> barajaEspaniola = crearBaraja();

	@Override
	public ArrayList<Carta> getBaraja() {
		return barajaEspaniola;
	}

	@Override
	public ArrayList<Carta> crearBaraja() {
		ArrayList<Carta> cartas = new ArrayList<Carta>();

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				cartas.add(new Carta(siguienteNumero(j), siguientePalo(i)));
			}
		}
		return cartas;
	}

	@Override
	public Palo siguientePalo(int i) {

		switch (i) {
		case 0:
			return Palo.OROS;
		case 1:
			return Palo.COPAS;
		case 2:
			return Palo.ESPADAS;
		default:
			return Palo.BASTOS;
		}
	}

	@Override
	public void barajar() {
		Collections.shuffle(barajaEspaniola);
	}

	/**
	 * 
	 * @param i
	 * @return El número siguiente en las cartas.
	 */
	private int siguienteNumero(int i) {
		switch (i) {
		case 0:
			return 1;
		case 1:
			return 2;
		case 2:
			return 3;
		case 3:
			return 4;
		case 4:
			return 5;
		case 5:
			return 6;
		case 6:
			return 7;
		case 7:
			return 10;
		case 8:
			return 11;
		default:
			return 12;
		}
	}
}
