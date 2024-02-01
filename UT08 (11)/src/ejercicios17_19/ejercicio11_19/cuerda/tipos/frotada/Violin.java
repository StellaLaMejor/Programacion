package ejercicios17_19.ejercicio11_19.cuerda.tipos.frotada;

import ejercicios17_19.ejercicio11_19.cuerda.tipos.Frotada;

public class Violin extends Frotada{

	private static final int DIFICULTAD = 9;
	private static final int NUM_CUERDAS = 4;
	private static final String NOMBRE_INSTRUMENTO= "violín";

	public Violin(String propietario) {
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
