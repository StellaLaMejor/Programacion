package ejercicios20_21.ejercicio11_20;

public class PoligonoRegular extends Figura{



	private double lado;
	private double apotema;
	private int numeroLados;
	
	public PoligonoRegular(int numeroLados, double apotema, double lado) {
		super(numeroLados);
		this.apotema= apotema;
		this.lado=lado;
	}
	@Override
	public double perimetro() {
		return this.lado*this.numeroLados;
	}

	@Override
	public double area() {
		return (this.lado* this.numeroLados* apotema)/2;
	}

}
