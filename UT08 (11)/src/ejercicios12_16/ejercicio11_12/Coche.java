package ejercicios12_16.ejercicio11_12;

public class Coche implements Vehiculo {
	falta como todo aprox
	@Override
	public void frenar (int cuantos)
	{
		if (cuantos<0 && cuantos < Vehiculo.VELOCIDAD_MAXIMA)
			System.out.println();
	}
	@Override
	public void acelerar (int cuantos)
	{
		
	}

	@Override
	public int getNumPlazas ()
	{
		return 1;
	}
	
}
