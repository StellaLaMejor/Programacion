package ejercicios22_22;

public class Planeador extends VehiculoAereo implements Matriculable{

	private String matricula;

	public Planeador(String nombrePropietario, String matricula, int altitudMaxima) {
		super(nombrePropietario, altitudMaxima);
		this.matricula=matricula;
	}

	@Override
	public String getMatricula() {
		return this.matricula;
	}

}
