package ejercicios22_22;

public abstract class Vehiculo {


	private String nombrePropietario;

	public Vehiculo(String nombrePropietario) {
		
		if(nombrePropietario== null || nombrePropietario.isBlank())
			throw new IllegalArgumentException ("El nombre introducido no es válido.");

		this.nombrePropietario = nombrePropietario;
		
	}
	
	public String getNombrePropietario() {
		return nombrePropietario;
	}

	
	
}
