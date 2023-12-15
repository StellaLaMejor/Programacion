package ejercicios10_10;

import org.w3c.dom.css.Rect;

public class Rectangulo {

	private int base;
	private int altura;
	
	
	
	public Rectangulo(int lado) {
		
		this(lado, lado);
	}

	public Rectangulo(int base, int altura) 
	{
		if (base <=0 )
		{
			base=1;
			System.err.println("La base introducida es menor que 1");
		}
		if (altura <=0)
		{
			altura = 1;
			System.err.println("La altura introducida es menor que 1");
		}
		
		this.base = base;
		this.altura = altura;
	}
	
	
	
	public int getBase() {
		return base;
	}
	public int getAltura() {
		return altura;
	}
	
	
	
	public double calcularPerimetro()
	{
		return 2*(this.base+ this.altura);
	}
	
	public double calcularArea()
	{
		return 0.5 * this.base * this.altura;
	}
	
	public boolean esMasAlto (Rectangulo rectangulo2)
	{
		return rectangulo2.getAltura() < this.altura;
	}
	public boolean esMasAncho (Rectangulo rectangulo2)
	{
		return rectangulo2.getBase() < this.base;
	}
	public int compararArea (Rectangulo rectangulo2)
	{
		double areaCalculada1= calcularArea();
		double areaCalculada2= rectangulo2.calcularArea();
		
		if (areaCalculada2< areaCalculada1)
		{
			return -1;
		}
		if (areaCalculada2 > areaCalculada1 || rectangulo2==null)
		{
			return 1;
		}
		
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
}
