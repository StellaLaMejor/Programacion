package ejercicios17_19.ejercicio11_18;

public abstract class Instrumento {



	private String propietario;
	private int dificultad;
	private  String nombreInstrumento = "instrumento";
	
	
	public Instrumento(String propietario, int dificultad , String nombreInstrumento) {
		this.propietario = propietario;
		this.dificultad = dificultad;
		this.nombreInstrumento= nombreInstrumento;
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
	@Override
	public String toString() {
		return String.format("%s tiene un %s con una dificultad de %d", this.propietario, nombreInstrumento, dificultad );
	}

	

}
