package es.iesclaradelrey.dm1e2324.calderonmartinezstella.juegocartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase Jugador en el juego de cartas. Tiene cartas en la mano del jugador y su
 * número de jugador.
 * 
 * @author Stella
 */

public class Jugador {

	private List<Carta> mano;
	private int numJugador;

	public Jugador(List<Carta> mano, int numJugador) {
		this.mano = mano;
		this.numJugador = numJugador;
	}

	public Jugador(int numJugador) {
		this.numJugador = numJugador;
		this.mano = new ArrayList<>();
	}

	public List<Carta> getMano() {
		return mano;
	}

	public int getNumJugador() {
		return numJugador;
	}

	/**
	 * Añade cartas a la mano del jugador
	 * 
	 * @param carta
	 */
	public void recibirCarta(Carta carta) {

		mano.add(carta);
	}

	/**
	 * @return Puntuación del jugador.
	 */
	public int calcularPuntuacion() {
		int puntuacion = 0;
		for (Carta carta : mano) {
			puntuacion += carta.getValor();
		}
		return puntuacion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jugador ").append(this.numJugador).append(": [");
		for (Carta carta : this.mano) {
			builder.append(carta.toString()).append(", ");
		}
		if (!this.mano.isEmpty()) {
			builder.delete(builder.length() - 2, builder.length());
		}
		builder.append("]");
		return builder.toString();
	}

}
