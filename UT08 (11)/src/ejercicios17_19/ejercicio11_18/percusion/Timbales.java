package ejercicios17_19.ejercicio11_18.percusion;

public class Timbales extends Percusion{

	private static final int DIFICULTAD = 6;
	private static final String NOMBRE_INSTRUMENTO= "timbales";

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
	

}
