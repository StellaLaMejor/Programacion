package es.iesclaradelrey.dm1e2324.calderonmartinezstella.juegocartas;

import java.util.ArrayList;

public interface Baraja {
	ArrayList<Carta> getBaraja();
	void setBaraja(ArrayList<Carta> barajaEditada);
	ArrayList<Carta> crearBaraja();
	Palo siguientePalo(int i);
	
}
