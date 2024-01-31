package ejercicios17_19.ejercicio11_18;

import ejercicios17_19.ejercicio11_17.Instrumento;

public abstract class Cuerda extends Instrumento{
	
	private  String nombreInstrumento = "";

	private int numeroCuerdas;


	public int getNumeroCuerdas() {
		return numeroCuerdas;
		
		
	}


	public Cuerda(String propietario, int dificultad, int numeroCuerdas ,String nombreInstrumento) {
		super(propietario, dificultad, nombreInstrumento);
		this.numeroCuerdas = numeroCuerdas;
		
		
	}
	



	
	
	
}
