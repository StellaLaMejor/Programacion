package ejercicios17_19.ejercicio11_17.viento.tipos;

import ejercicios17_19.ejercicio11_17.viento.Material;
import ejercicios17_19.ejercicio11_17.viento.Viento;

public class Flauta extends Viento{

	private static final int DIFICULTAD = 6;
	private static final String NOMBRE_INSTRUMENTO= "flauta";
	private static final Material MATERIAL = Material.MADERA;

	public Flauta (String propietario) {
		super(propietario, DIFICULTAD, MATERIAL);
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
