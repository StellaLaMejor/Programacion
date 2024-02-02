package ejercicios20_21.ejercicio11_20;

public class Rectangulo extends Paralelogramo{
	
	
	
	private double lado2;
	private double lado1;

	public Rectangulo(double lado1, double lado2) {
		super(lado1, lado2);
		this.lado1= lado1;
		this.lado2= lado2;
	}

	@Override
	public void escalar(double factor) {
		this.lado1*= factor;
		this.lado2*= factor;
		
	}
	
	

}
