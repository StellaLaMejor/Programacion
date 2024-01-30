package ejercicios17_19.ejercicio11_17.cuerda.tipos.pulsada;

import ejercicios17_19.ejercicio11_17.cuerda.tipos.Pulsada;

public class Guitarra extends Pulsada{

	private static final int DIFICULTAD = 7;
	private static final int NUM_CUERDAS = 6;
	private static final String NOMBRE_INSTRUMENTO= "guitarra";

	public Guitarra (String propietario) {
		super(propietario, DIFICULTAD, NUM_CUERDAS);
	}

	@Override
	public void tocar() {
		System.out.printf("La %s de %s empieza a tocar.\n",NOMBRE_INSTRUMENTO, this.getPropietario());
		
	}

	@Override
	public void parar() {
		System.out.printf("La %s de %s deja de tocar.\n", NOMBRE_INSTRUMENTO, this.getPropietario());		
	}

}
