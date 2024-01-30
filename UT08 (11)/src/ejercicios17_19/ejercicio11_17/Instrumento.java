package ejercicios17_19.ejercicio11_17;

public abstract class Instrumento {


	private String propietario;
	private int dificultad;
	
	
	public Instrumento(String propietario, int dificultad) {
		this.propietario = propietario;
		this.dificultad = dificultad;
	}
	public String getPropietario() {
		return propietario;
	}
	public int getDificultad() {
		return dificultad;
	}

	public abstract void tocar();

	public abstract void parar();

	public boolean esMasDificil(Instrumento instrumento) {
		return this.dificultad > instrumento.getDificultad();
	}
	
	

}
