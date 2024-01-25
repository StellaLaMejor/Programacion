package ejercicios12_16.ejercicio11_13;

public class Moto extends VehiculoMotor implements Vehiculo{
	

	public Moto() {
		
	}

	
	
	public void getVelocidadActual(int velocidadActual) {
		super.getVelocidadActual();
	}
	@Override
	public void frenar (int cuantos)
	{
		super.frenar(cuantos);
		
	}
	@Override
	public void acelerar (int cuantos)
	{
		super.acelerar(cuantos);
		System.out.println("Soy una moto, puedo acelerar hasta 120 km/h.");
		
	}

	@Override
	public int getNumPlazas ()
	{
		return 2;
	}
	

}
