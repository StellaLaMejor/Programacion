package es.iesclaradelrey.dm1e2324.calderonmartinezstella.juegocartas;

import java.util.ArrayList;
import java.util.Arrays;

public class BarajaFrancesa implements Baraja{

	ArrayList<Carta> barajaFrancesa= crearBaraja();

	
	@Override
	public ArrayList<Carta> getBaraja() {
		return barajaFrancesa;
	}

	@Override
	public void setBaraja(ArrayList<Carta> barajaEditada) {
		this.barajaFrancesa= barajaEditada;
		
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

}
