package ejercicios08_10.ejercicio11_08;

public class Romboide extends Paralelogramo{

	private double ladoOblicuo;
	
	public Romboide(double base, double altura, double ladoOblicuo) {
		super(base, altura);
		this.ladoOblicuo=ladoOblicuo;
	}

	@Override
	public double perimetro() {
		return (this.getBase()+ladoOblicuo)*2;
	}

	

}
