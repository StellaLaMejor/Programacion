package ejercicios22_22;

public abstract class VehiculoAereo extends Vehiculo {

	private int altitudMaxima;

	public VehiculoAereo(String nombrePropietario, int altitudMaxima) {
		super(nombrePropietario);
		if(altitudMaxima<100 || altitudMaxima> 10000)
			throw new IllegalArgumentException("La altitud máxima no puedeser menor de 100 ni mayor que 10000");
		
		this.altitudMaxima = altitudMaxima;
	}
	
	public int getAltitudMaxima() {
		return altitudMaxima;
	}

	@Override
	public String toString() {
		return String.format("%s tiene un %s que su altitud máxima es %s. ", getNombrePropietario(), getClass().getSimpleName(), this.altitudMaxima);
	}


}
