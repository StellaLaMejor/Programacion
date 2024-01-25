package ejercicios12_16.ejercicio11_12;

public class Programa {
	public static void main(String[] args) {

		Vehiculo coche = new Coche();
		Vehiculo moto = new Moto();

		moto.acelerar(5);
		System.out.println("Velocidad actual: " + moto.getVelocidadActual());
		System.out.println(moto.getNumPlazas());
		moto.acelerar(120);
		System.out.println("Velocidad actual: " + moto.getVelocidadActual());

		coche.frenar(10);
		System.out.println("Velocidad actual: " + coche.getVelocidadActual());
		coche.acelerar(120);
		System.out.println("Velocidad actual: " + coche.getVelocidadActual());
		coche.frenar(10);
		System.out.println("Velocidad actual: " + coche.getVelocidadActual());

	}

}
