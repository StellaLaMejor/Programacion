package ejercicios06_06;

public class Lavadora extends Electrodomestico{
	
	private static final double CARGA_DEFECTO= 5;

	private double carga;

	public Lavadora() {
		super();
		this.carga=CARGA_DEFECTO;
	}

	public Lavadora(double precioBase, double pesoKg) {
		super(precioBase, pesoKg);
		this.carga= CARGA_DEFECTO;
	}
	
	public Lavadora(double carga) {
		super();
		this.carga=carga;
	}

	@Override
	public double getPrecioBase() {
		// TODO Auto-generated method stub
		return super.getPrecioBase();
	}
	public double getPrecioFinal() {
		double precioFinal= precioFinal();
		return precioFinal;
	}
	
	private double precioFinal ()
	{
		double precioFinal= super.getPrecioFinal();
		if (this.carga>8)
		{
			precioFinal+=50;
		}
		
		return precioFinal;
	}
	
	@Override
	public String toString() {
		return String.format("Carga: %.2f\n"
				+ "%s", this.carga, super.toString());
	}
}
