package ejercicios17_19.ejercicio11_17.viento.tipos;

import ejercicios17_19.ejercicio11_17.viento.Material;
import ejercicios17_19.ejercicio11_17.viento.Viento;

public class Clarinete extends Viento{

	private static final int DIFICULTAD = 8;
	private static final String NOMBRE_INSTRUMENTO= "clarinete";
	private static final Material MATERIAL = Material.MADERA;

	public Clarinete (String propietario) {
		super(propietario, DIFICULTAD, MATERIAL, NOMBRE_INSTRUMENTO);
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
