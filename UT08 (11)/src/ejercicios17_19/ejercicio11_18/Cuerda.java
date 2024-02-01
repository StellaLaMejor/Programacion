package ejercicios17_19.ejercicio11_18;

import ejercicios17_19.ejercicio11_17.Instrumento;

public abstract class Cuerda extends Instrumento implements Afinable {

	private String nombreInstrumento = "";

	private int numeroCuerdas;

	public int getNumeroCuerdas() {
		return numeroCuerdas;

	}

	public Cuerda(String propietario, int dificultad, int numeroCuerdas, String nombreInstrumento) {
		super(propietario, dificultad, nombreInstrumento);
		this.numeroCuerdas = numeroCuerdas;
		this.nombreInstrumento = nombreInstrumento;

	}

	@Override
	public boolean afinar() {
		System.out.printf("Se está afinando %s \n.", nombreInstrumento );
		return true;
		
	}
}
