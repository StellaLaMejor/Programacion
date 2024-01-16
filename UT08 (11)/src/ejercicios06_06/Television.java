package ejercicios06_06;

public class Television extends Electrodomestico{
	
	private static final int RESOLUCION_DEFECTO=42;
	private static final boolean SINTONIZADOR_DEFECTO = true;
	
	private int resolucionPulgadas;
	private boolean sintonizador;
	
	public Television() {
		super();
		this.resolucionPulgadas=RESOLUCION_DEFECTO;
		this.sintonizador= SINTONIZADOR_DEFECTO;
	}
	
	public Television(double precioBase, double pesoKg, Color color, ConsumoEnergetico consumoEnergetico, int resolucionPulgadas, boolean sintonizador) {
		super(precioBase, pesoKg, color, consumoEnergetico);
		this.resolucionPulgadas=resolucionPulgadas;
		this.sintonizador=sintonizador;
	}
	
	public Television (double precioBase, double pesoKg)
	{
		super(precioBase,pesoKg);
		this.resolucionPulgadas= RESOLUCION_DEFECTO;
		this.sintonizador= SINTONIZADOR_DEFECTO;
	}
	@Override
	public double getPrecioBase() {
		// TODO Auto-generated method stub
		return super.getPrecioBase();
	}
	@Override
	public double getPrecioFinal() {
		double precioFinal= precioFinal();
		return precioFinal;
	}

	private double precioFinal ()
	{
		double precioFinal= super.getPrecioFinal();
		if(this.resolucionPulgadas>65)
		{
			double aumentoPrecio= ((30/100)*precioFinal);
			precioFinal+=aumentoPrecio;
		}
		if(this.sintonizador==true)
		{
			precioFinal+=50;
		}
		return precioFinal;
	}
	@Override
	public String toString() {
		return String.format("Resolución en pulgadas: %d\n"
				+ "Sintonizador TDT: %s\n"
				+ "%s", this.resolucionPulgadas, this.sintonizador, super.toString());
	}
	
}
