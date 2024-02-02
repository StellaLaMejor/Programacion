package ejercicios20_21.ejercicio11_20;

public class Cuadrado extends Paralelogramo{
	
	private double lado;
	
	public Cuadrado(double lado) {
		super(lado, lado);
		this.lado=lado;
	}

	@Override
	public void escalar(double factor) {
		this.lado*= factor;
	}
	
	
	

}
