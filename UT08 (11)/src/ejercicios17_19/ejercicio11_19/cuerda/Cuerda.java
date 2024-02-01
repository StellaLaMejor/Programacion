  package ejercicios17_19.ejercicio11_19.cuerda;

import ejercicios17_19.ejercicio11_19.Afinable;
import ejercicios17_19.ejercicio11_19.Instrumento;

public abstract class Cuerda extends Instrumento implements Afinable{
	
	private  String nombreInstrumento = "";
	private boolean afinado=false;

	private int numeroCuerdas;


	public int getNumeroCuerdas() {
		return numeroCuerdas;
		 	
	}

	public Cuerda(String propietario, int dificultad, int numeroCuerdas ,String nombreInstrumento) {
		super(propietario, dificultad, nombreInstrumento);
		this.numeroCuerdas = numeroCuerdas;
		this.nombreInstrumento = nombreInstrumento;	
	}
	@Override
	public boolean afinar() {
		
		System.out.printf("Se está afinando el %s \n", nombreInstrumento );
		this.afinado=true;
		return true;
	}



	
	
	
}
