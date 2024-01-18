package ejercicios08_10.ejercicio11_08;

public class Circulo extends Figura{

	private double radio;

	
	public Circulo (double radio)
	{
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
	
}
