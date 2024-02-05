package ejercicios20_21.ejercicio11_21;

public class Triangulo extends Figura{
	private static final int NUM_LADOS=3;


	private double lado1;
	private double lado2;
	private double lado3;
	

	public Triangulo(double lado1, double lado2, double lado3) {
		super(NUM_LADOS);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public double perimetro() {
		return this.lado1+this.lado2+this.lado3;
	}

	@Override
	public double area() {
		double semiPerimetro = (perimetro())/2;
		return Math.sqrt(semiPerimetro*(semiPerimetro-this.lado1)*(semiPerimetro-this.lado2)*(semiPerimetro-this.lado3));
	}

	@Override
	public void escalar(double factor) {
		this.lado1*= factor;
		this.lado2*= factor;
		this.lado3*= factor;

		
	}
	

}
