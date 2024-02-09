package es.iesclaradelrey.dm1e2324.calderonmartinezstella.juegocartas;

public class Carta {

	private int numero;
	private Palo palo;
	
	
	public Carta(int numero, Palo palo) {
		this.numero = numero;
		this.palo = palo;
	}


	@Override
	public String toString() {
		return String.format("%s (%s) ", this.numero, this.palo); 
	}
	
	
	
	
	
}
