package ejercicios08_10.ejercicio11_08;

public class Triangulo extends Figura{

	private double lado1;
	private double lado2;
	private double lado3;
	

	public Triangulo(double lado1, double lado2, double lado3) {
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
	

}
