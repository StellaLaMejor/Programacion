package ejercicios17_19.ejercicio11_18.viento;

import ejercicios17_19.ejercicio11_18.Instrumento;

public abstract class Viento extends Instrumento {

	private   Material MATERIAL = null;


	public Material getMaterial() {
		return MATERIAL;
	}

	public Viento(String propietario, int dificultad, Material tipoViento, String nombreInstrumento) {
		super(propietario, dificultad, nombreInstrumento);
		this.MATERIAL= tipoViento;
	}
	@Override
	public String toString() {
		return super.toString() + " el material es "+ MATERIAL;
	}
}
