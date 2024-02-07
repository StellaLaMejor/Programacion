package ejercicios22_22;

public abstract class VehiculoTerrestre extends Vehiculo {
	

	private int numRuedas;

	public VehiculoTerrestre(String nombrePropietario, int numRuedas) {
		super(nombrePropietario);
		this.numRuedas = numRuedas;
	}
	
	public int getNumRuedas() {
		return numRuedas;
	}

	@Override
	public String toString() {
		return String.format("%s tiene un %s que tiene %s ruedas. ", getNombrePropietario(), getClass().getSimpleName(), this.numRuedas);
	}

}
