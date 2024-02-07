package es.iesclaradelrey.dm1e2324.calderonmartinezstella.juegocartas;

abstract class Baraja extends Juego{

	private int numero;
	private PaloF paloF;
	private PaloE paloE;
	private int numCartas;

	public Baraja (int numero, PaloF palo) {
		this.numero= numero;
		this.paloF = palo;
	}
	public Baraja (int numero, PaloE palo) {
		this.numero= numero;
		this.paloE = palo;
	}
	
	public Baraja (int numCartas) {
		this.numCartas=numCartas;
	}
	
	
}
