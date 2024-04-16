package es.iesclaradelrey.dm1e2324.calderonmartinezstella.juegocartas;

public class BarajaEspañola implements Baraja {

	

	@Override
	public Carta[] crearBaraja() {
		Carta[] cartas = new Carta[40];
		int contadorPalo = 0;

		for (int i = 0; i < cartas.length; i++) {
			for (int j = 0; j < 10; j++) {
				cartas[i] = new Carta(siguienteNumero(j), siguientePalo(contadorPalo));
				contadorPalo++;
			}
		}
		return cartas;
	}

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
