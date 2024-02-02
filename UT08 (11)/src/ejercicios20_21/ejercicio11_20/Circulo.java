package ejercicios20_21.ejercicio11_20;

public class Circulo extends Figura{
	private static final int NUM_LADOS=0;
	
	private double radio;

	
	public Circulo (double radio)
	{
		super(NUM_LADOS);
		this.radio= radio;
	}
	
	@Override
	public double perimetro() {
		double pi= Math.PI;
		return 2*pi*this.radio;
	}

	@Override
	public double area() {
		double pi= Math.PI;
		double alCuadrado= this.radio*this.radio;
		return pi*alCuadrado;
	}



	@Override
	public void escalar(double factor) {

		this.radio*= factor;
		
	}

	
	
	
}
