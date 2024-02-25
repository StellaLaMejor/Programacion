package es.iesclaradelrey.dm1e2324.calderonmartinezstella.juegocartas;

/**
 * Clase de una Carta de la baraja de juego. Tiene el número y el palo de la
 * carta.
 * 
 * @author Stella
 */

public class Carta {

	private int numero;
	private Palo palo;

	public Carta(int numero, Palo palo) {
		this.numero = numero;
		this.palo = palo;
	}

	/**
	 * @return número de la carta.
	 */
	public int getValor() {
		return this.numero;
	}

	@Override
	public String toString() {
		return String.format("%s (%s) ", this.numero, this.palo);
	}

}
