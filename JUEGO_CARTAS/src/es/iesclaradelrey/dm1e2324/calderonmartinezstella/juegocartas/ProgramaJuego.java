package es.iesclaradelrey.dm1e2324.calderonmartinezstella.juegocartas;

import java.util.ArrayList;
import java.util.Scanner;


public class ProgramaJuego {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        Baraja baraja = Juego.obtenerTipoBaraja(sc);
	        int numJugadores = Juego.obtenerCantidadJugadores(sc);

	        Jugador[] jugadores = new Jugador[numJugadores];
	        for (int i = 0; i < numJugadores; i++) {
	            jugadores[i] = new Jugador(i + 1);
	        }

	        Juego juego = new Juego(baraja, jugadores);
	        

	        juego.iniciarJuego(sc, numJugadores);

	    
	}

}
