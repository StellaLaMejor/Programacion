package ejercicios22_22;

public class Camion extends VehiculoTerrestre implements Motorizado, Matriculable {

	private int almacenarCarga;
	private String matricula;
	private String potencia;

	public Camion(String nombrePropietario, String matricula, String potencia, int numRuedas, int almacenCarga) {
		super(nombrePropietario, numRuedas);
		if (numRuedas < 4 || numRuedas > 16)
			throw new IllegalArgumentException("El camión no puede tener menos de 4 rudas ni más de 16");

		if (almacenCarga < 0 || almacenCarga > 40000)
			throw new IllegalArgumentException(
					"El almacén de la carga máxima debe ser mayor que 0 y menor o igual que 40000. ");

		this.almacenarCarga= almacenCarga;
		this.matricula=matricula;
		this.potencia=potencia;
	}

	public int getAlmacenarCarga() {
		return almacenarCarga;
	}

	@Override
	public String getMatricula() {
		
		return this.matricula;
	}

	@Override
	public String getPotencia() {
		return this.potencia;
	}
	@Override
	public String toString() {
		return String.format("%s tiene un %s que tiene %s ruedas. \nTiene una potencia de %s y su matrícula es %s.", getNombrePropietario(), getClass().getSimpleName(), getNumRuedas(), getPotencia(), getMatricula());
	}
	
}
