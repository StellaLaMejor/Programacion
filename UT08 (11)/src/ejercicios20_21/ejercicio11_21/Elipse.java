package ejercicios20_21.ejercicio11_21;

public class Elipse extends Figura{
	private static final int NUM_LADOS=2;

	
	private double semiEjeMenor;
	private double semiEjeMayor;
	
	public Elipse(double semiEjeMenor, double semiEjeMayor) {
		super(NUM_LADOS);
		this.semiEjeMayor=semiEjeMayor;
		this.semiEjeMenor=semiEjeMenor;
	}

	
	@Override
	public double perimetro() {
		return 2* Math.PI* Math.sqrt(((semiEjeMayor*semiEjeMayor)+ (semiEjeMenor*semiEjeMenor))/2) ;
	}
	@Override
	public double area() {
		return Math.PI*semiEjeMayor*semiEjeMenor;
	}


	@Override
	public void escalar(double factor) {
		this.semiEjeMayor*= factor;
		this.semiEjeMenor*= factor;
	}



}
