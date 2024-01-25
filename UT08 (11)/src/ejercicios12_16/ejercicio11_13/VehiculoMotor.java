package ejercicios12_16.ejercicio11_13;

public abstract class VehiculoMotor implements Vehiculo{

	private int velocidadActual=0;

	
	
	
	public VehiculoMotor() {
	super();
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}
	
	@Override
	public void acelerar (int cuantos)
	{
		int velocidad = this.velocidadActual+cuantos;
		if(velocidad > VELOCIDAD_MAXIMA)
		{
			this.velocidadActual=VELOCIDAD_MAXIMA;
		}
		else {
			this.velocidadActual=velocidad;
		}
	}
	@Override
	public void frenar (int cuantos)
	{
		int velocidad = this.velocidadActual+cuantos;
		if(velocidad < 0)
		{
			this.velocidadActual=0;
		}
		else {
			this.velocidadActual=velocidad;
		}
	}
	
}
