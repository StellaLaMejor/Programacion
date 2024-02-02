package ejercicios20_21.ejercicio11_20;

public class Romboide extends Paralelogramo{

	private double ladoOblicuo;
	private double base;
	private double altura;
	
	public Romboide(double base, double altura, double ladoOblicuo) {
		super(base, altura);
		this.ladoOblicuo=ladoOblicuo;
		this.base= base;
		this.altura= altura;
	}

	@Override
	public double perimetro() {
		return (this.getBase()+ladoOblicuo)*2;
	}

	@Override
	public void escalar(double factor) {
	this.altura*=factor;
	this.base*=factor; 
	}

	

}
