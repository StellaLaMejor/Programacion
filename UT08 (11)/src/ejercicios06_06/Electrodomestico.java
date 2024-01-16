package ejercicios06_06;

public class Electrodomestico {
	
	private static final Color COLOR_DEFECTO= Color.BLANCO;
	private static final ConsumoEnergetico CONSUMO_ENERGETICO_DEFECTO= ConsumoEnergetico.F;
	private static final double PRECIO_DEFECTO= 100;
	private static final double PESO_DEFECTO=5;
	

	private double precioBase;
	private Color color;
	private ConsumoEnergetico consumoEnergetico;
	private double pesoKg;
	
	public Electrodomestico()
	{
		this.color= COLOR_DEFECTO;
		this.consumoEnergetico= CONSUMO_ENERGETICO_DEFECTO;
		this.precioBase= PRECIO_DEFECTO;
		this.pesoKg= PESO_DEFECTO;
	}

	public Electrodomestico(double precioBase, double pesoKg) {
		this.precioBase = precioBase;
		this.pesoKg = pesoKg;
		this.consumoEnergetico= CONSUMO_ENERGETICO_DEFECTO;
		this.precioBase= PRECIO_DEFECTO;

	}

	public Electrodomestico(double precioBase, double pesoKg, Color color, ConsumoEnergetico consumoEnergetico) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.pesoKg = pesoKg;
	}
	

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPrecioFinal() {
		double precioFinal= calcularPrecio();
		return precioFinal;
	}


	private double calcularPrecio ()
	{
		double precioFinal= this.precioBase;
		switch (this.consumoEnergetico) {
		case A:
			precioFinal += 100;
			break;
		case B:
			precioFinal += 80;
			break;
		case C:
			precioFinal += 60;
			break;
		case D:
			precioFinal += 50;
			break;
		case E:
			precioFinal += 30;
			break;
		case F:
			precioFinal  += 10;
			break;
		default:
			break;
		}
		if (this.pesoKg < 20) {
			precioFinal += 10;
		} else if (this.pesoKg < 50) {
			precioFinal += 50;
		} else if (this.pesoKg < 80) {
			precioFinal += 80;
		} else {
			precioFinal += 100;
		}
		
		return precioFinal;
	}
	
	
	@Override
	public String toString() {
		return String.format("Precio base: %.2f€ \n"
				+ "Peso en Kg: %.2f\n"
				+ "Color: %s\n"
				+ "Consumo energético: %s\n"
				+ "PRECIO FINAL: %.2f€\n", this.precioBase, this.pesoKg, this.color, this.consumoEnergetico, getPrecioFinal());
	}
	
	
}
