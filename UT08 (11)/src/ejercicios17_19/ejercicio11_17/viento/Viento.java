package ejercicios17_19.ejercicio11_17.viento;

import ejercicios17_19.ejercicio11_17.Instrumento;

public abstract class Viento extends Instrumento {

	private Material tipoViento;

	public Material getTipoViento() {
		return tipoViento;
	}

	public Viento(String propietario, int dificultad, Material tipoViento) {
		super(propietario, dificultad);
		this.tipoViento= tipoViento;
	}

}
