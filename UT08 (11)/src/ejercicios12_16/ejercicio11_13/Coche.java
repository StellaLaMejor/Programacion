package ejercicios12_16.ejercicio11_13;

public class Coche extends VehiculoMotor implements Vehiculo {

	public Coche() {
		super();

	}

	@Override
	public void frenar(int cuantos) {
		super.frenar(cuantos);
		System.out.println("Soy un coche y puedo frenar hasta 0");

	}

	@Override
	public void acelerar(int cuantos) {
		super.acelerar(cuantos);
		System.out.println("Soy un coche y puedo acelerar hasta 120");

	}

	@Override
	public int getNumPlazas() {
		return 5;
	}

}
