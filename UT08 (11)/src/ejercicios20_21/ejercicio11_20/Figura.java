package ejercicios20_21.ejercicio11_20;

public abstract class Figura implements Escalable{

	private int numLados=0;
	

	public Figura(int numeroLados)
	{
		this.numLados=numeroLados;
	}
	
	public abstract double perimetro();
	
	public abstract double area();



	
	
	
}
