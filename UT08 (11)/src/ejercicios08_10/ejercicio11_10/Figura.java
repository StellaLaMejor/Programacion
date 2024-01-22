package ejercicios08_10.ejercicio11_10;

public abstract class Figura {

	private int numLados=0;
	
//	public Figura()
//	{
//		
//	}
	public Figura(int numeroLados)
	{
		this.numLados=numeroLados;
	}
	
	public abstract double perimetro();
	
	public abstract double area();



	
	
	
}
