package ejercicios17_19.ejercicio11_19.viento.tipos;

import ejercicios17_19.ejercicio11_19.viento.Material;
import ejercicios17_19.ejercicio11_19.viento.Viento;

public class Tuba extends Viento{

	private static final int DIFICULTAD = 8;
	private static final String NOMBRE_INSTRUMENTO= "tuba";
	private static final Material MATERIAL = Material.METAL;

	public Tuba (String propietario) {
		super(propietario, DIFICULTAD, MATERIAL, NOMBRE_INSTRUMENTO);

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
