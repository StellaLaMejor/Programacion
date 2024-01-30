package ejercicios17_19.ejercicio11_17.percusion;

public class Xilofono extends Percusion{

	private static final int DIFICULTAD = 8;
	private static final String NOMBRE_INSTRUMENTO= "xilófono";

	public Xilofono (String propietario) {
		super(propietario, DIFICULTAD);
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
