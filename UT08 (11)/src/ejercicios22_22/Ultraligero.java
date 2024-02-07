package ejercicios22_22;

public class Ultraligero extends VehiculoAereo implements Motorizado, Matriculable{

	double almacenEnvergadura;
	private String potencia;
	private String matricula;
	
	public Ultraligero(String nombrePropietario,String matricula, String potencia, int altitudMaxima, double almacenEnvergadura) {
		super(nombrePropietario, altitudMaxima);
		
		if(almacenEnvergadura<=5 || almacenEnvergadura>=20)
			throw new IllegalArgumentException("El almacén debe mayor que 5 e inferior a 20 metros. ");

		this.almacenEnvergadura= almacenEnvergadura;
		this.matricula=matricula;
		this.potencia=potencia;
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
		return String.format("%s tiene un %s que su altitud máxima es %s.  \nTiene una potencia de %s y su matrícula es %s. ", getNombrePropietario(), getClass().getSimpleName(), getAltitudMaxima(), getPotencia(), getMatricula());
	}
	
}
