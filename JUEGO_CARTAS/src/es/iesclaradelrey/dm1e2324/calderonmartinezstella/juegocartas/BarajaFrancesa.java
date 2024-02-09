package es.iesclaradelrey.dm1e2324.calderonmartinezstella.juegocartas;

public class BarajaFrancesa implements Baraja{

	@Override
	public Carta[] crearBaraja() {
		Carta[] cartas = new Carta[40];
		int contadorPalo = 0;

		for (int i = 0; i < cartas.length; i++) {
			for (int j = 0; j < 13; j++) {
				cartas[i] = new Carta(j+1, siguientePalo(contadorPalo));
				contadorPalo++;
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
