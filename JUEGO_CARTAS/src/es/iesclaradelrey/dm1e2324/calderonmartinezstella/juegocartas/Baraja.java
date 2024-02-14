package es.iesclaradelrey.dm1e2324.calderonmartinezstella.juegocartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Baraja {
	
	public abstract ArrayList<Carta> getBaraja();
	
	public abstract ArrayList<Carta> crearBaraja();
	public abstract Palo siguientePalo(int i);
	
	public abstract void barajar();
	

}
