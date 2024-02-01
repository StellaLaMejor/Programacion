package ejercicios17_19.ejercicio11_19.cuerda.tipos.pulsada;

import ejercicios17_19.ejercicio11_19.cuerda.tipos.Pulsada;

public class Arpa extends Pulsada {

	private static final int DIFICULTAD = 10;
	private static final int NUM_CUERDAS = 47 ;
	private static final String NOMBRE_INSTRUMENTO= "arpa";

	public Arpa (String propietario) {
		super(propietario, DIFICULTAD, NUM_CUERDAS, NOMBRE_INSTRUMENTO);
	}

	@Override
	public void tocar() {
		System.out.printf("El %s de %s empieza a tocar.\n",NOMBRE_INSTRUMENTO, this.getPropietario());
		
	}

	@Override
	public void parar() {
		System.out.printf("El %s de %s deja de tocar.\n", NOMBRE_INSTRUMENTO, this.getPropietario());		
	}

	
}
