package es.iesclaradelrey.dm1e2324.calderonmartinezstella.juegocartas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Clase de una Baraja Francesa, extiende de la clase Baraja.
 * Implementa los métodos abstractos para crear y barajar la baraja francesa.
 * @author Stella
 */

public class BarajaFrancesa extends Baraja{

	private ArrayList<Carta> barajaFrancesa= crearBaraja();

	
	@Override
	public ArrayList<Carta> getBaraja() {
		return barajaFrancesa;
	}

	@Override
	public ArrayList<Carta> crearBaraja() {
		ArrayList <Carta> cartas = new ArrayList<Carta>();

		for (int i = 0; i < 4 ; i++) {
			for (int j = 0;j<13; j++) {
				cartas.add(new Carta((j+1), siguientePalo(i)));
			}
		}
		return cartas;
	}

	@Override
	public Palo siguientePalo(int i) {
		switch (i) {
		case 0:
			return Palo.CORAZONES;
		case 1:
			return Palo.TREBOLES;
		case 2:
			return Palo.PICAS;
		default:
			return Palo.DIAMANTES;
		}
	}

	@Override
	public void barajar() {
		Collections.shuffle(barajaFrancesa);
	}

}
