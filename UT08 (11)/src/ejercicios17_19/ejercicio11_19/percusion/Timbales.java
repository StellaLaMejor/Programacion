package ejercicios17_19.ejercicio11_19.percusion;

import ejercicios17_19.ejercicio11_18.Afinable;

public class Timbales extends Percusion implements Afinable{

	private static final int DIFICULTAD = 6;
	private static final String NOMBRE_INSTRUMENTO= "timbales";
	private boolean afinado=false;

	public Timbales (String propietario) {
		super(propietario, DIFICULTAD,  NOMBRE_INSTRUMENTO);
	}

	@Override
	public void tocar() {
		System.out.printf("Los %s de %s empieza a tocar.\n",NOMBRE_INSTRUMENTO, this.getPropietario());
		
	}

	@Override
	public void parar() {
		System.out.printf("Los %s de %s deja de tocar.\n", NOMBRE_INSTRUMENTO, this.getPropietario());		
	}

	@Override
	public boolean afinar() {
		System.out.println("Se están afinando los timbales. ");
		this.afinado=true;
		return true;
		
	}
	

}
