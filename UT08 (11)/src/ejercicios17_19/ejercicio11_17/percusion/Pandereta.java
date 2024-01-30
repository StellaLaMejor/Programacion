package ejercicios17_19.ejercicio11_17.percusion;

public class Pandereta extends Percusion{

	private static final int DIFICULTAD = 4;
	private static final String NOMBRE_INSTRUMENTO= "pandereta";

	public Pandereta (String propietario) {
		super(propietario, DIFICULTAD);
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
