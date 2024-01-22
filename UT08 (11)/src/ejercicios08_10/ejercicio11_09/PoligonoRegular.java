package ejercicios08_10.ejercicio11_09;

public class PoligonoRegular extends Figura{

	private double lado;
	private double apotema;
	private int numeroLados;
	
	@Override
	public double perimetro() {
		return this.lado*this.numeroLados;
	}

	@Override
	public double area() {
		return (this.lado* this.numeroLados* apotema)/2;
	}

}
