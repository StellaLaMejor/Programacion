package ejercicios08_10.ejercicio11_10;

public class Elipse extends Figura{
	private static final int NUM_LADOS=2;

	
	public Elipse() {
		super(NUM_LADOS);

	}

	
	private double semiEjeMenor;
	private double semiEjeMayor;
	
	@Override
	public double perimetro() {
		return 2* Math.PI* Math.sqrt(((semiEjeMayor*semiEjeMayor)+ (semiEjeMenor*semiEjeMenor))/2) ;
	}
	@Override
	public double area() {
		return Math.PI*semiEjeMayor*semiEjeMenor;
	}

}
