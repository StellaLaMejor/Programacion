package ejercicios12_16.ejercicio11_13;

public interface Vehiculo {

	 int VELOCIDAD_MAXIMA= 120;
	
	
	public abstract void frenar(int cuanto);
	void acelerar(int cuanto);
	int getNumPlazas();
	 int getVelocidadActual();
	
}
