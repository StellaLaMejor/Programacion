package ejercicios17_19.ejercicio11_17.cuerda;

import ejercicios17_19.ejercicio11_17.Instrumento;

public abstract class Cuerda extends Instrumento{
	

	private int numeroCuerdas;


	public int getNumeroCuerdas() {
		return numeroCuerdas;
		
		
	}


	public Cuerda(String propietario, int dificultad, int numeroCuerdas) {
		super(propietario, dificultad);
		this.numeroCuerdas = numeroCuerdas;
	}
	



	
	
	
}
