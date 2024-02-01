package ejercicios17_19.ejercicio11_19.viento.tipos;

import ejercicios17_19.ejercicio11_19.viento.Material;
import ejercicios17_19.ejercicio11_19.viento.Viento;

public class Trompeta extends Viento{

	private static final int DIFICULTAD = 7;
	private static final String NOMBRE_INSTRUMENTO= "trompeta";
	private static final Material MATERIAL = Material.METAL;

	public Trompeta (String propietario) {
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
