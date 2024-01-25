package ejercicios12_16.ejercicio11_12;

public class Coche implements Vehiculo {
	
	private int velocidadActual=0;
	

	public Coche() {
		super();
		
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}
	
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	@Override
	public void frenar (int cuantos)
	{
		int velocidad = this.velocidadActual-cuantos;
		if(velocidad <= 0)
		{
			System.out.println("Soy un coche y no puedo frenar más.");
			this.velocidadActual=0;
		}
		else {
			this.velocidadActual=velocidad;
		}
		
	}
	@Override
	public void acelerar (int cuantos)
	{
		System.out.println("Soy un coche, puedo acelerar hasta 120 km/h.");
		int velocidad = this.velocidadActual+cuantos;
		if(velocidad > 120)
		{
			System.out.println("Soy un coche y no puedo acelerar más.");
			this.velocidadActual=120;
		}
		else {
			this.velocidadActual=velocidad;
		}
	}

	@Override
	public int getNumPlazas ()
	{
		return 5;
	}
	
}
