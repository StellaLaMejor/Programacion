package es.iesclaradelrey.dm1e2324.calderonmartinezstella.juegocartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase abstracta que representa una Baraja de cartas. Las clases que extiendan
 * esta clase deben implementar los métodos abstractos para gestionar la
 * creación, obtención y barajado de la baraja.
 * 
 * @author Stella
 * 
 */

public abstract class Baraja {
	/**
	 * @return Lista de cartas en la baraja.
	 */
	public abstract ArrayList<Carta> getBaraja();

	/**
	 * @return Lista de cartas que representa la baraja.
	 */
	public abstract ArrayList<Carta> crearBaraja();

	/**
	 * Devuelve el siguiente palo.
	 * 
	 * @param i Índice que determina el palo siguiente.
	 * @return Palo siguiente.
	 */
	public abstract Palo siguientePalo(int i);

	/**
	 * Baraja las cartas en la baraja.
	 */
	public abstract void barajar();

}
