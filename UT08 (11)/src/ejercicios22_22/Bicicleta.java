package ejercicios22_22;

public class Bicicleta extends VehiculoTerrestre{

	public Bicicleta(String nombrePropietario, int numRuedas) {
		super(nombrePropietario, numRuedas);
		if(numRuedas!=2)
			throw new IllegalArgumentException("La bicicleta no puede tener ni menos ni más de 2 ruedas.");
	}

}
