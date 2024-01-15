package ejercicios04_05.ejercicio11_05;

import java.time.LocalDate;

public class ProductoCongelado extends Producto{

	private int temperaturaCongelacion;

	
	public ProductoCongelado(LocalDate fechaCaducidad, int numeroLote, int temperaturaCongelacion) {
		super(fechaCaducidad, numeroLote);
		this.temperaturaCongelacion= temperaturaCongelacion;
	}

	

	public int getTemperaturaCongelacion() {
		return temperaturaCongelacion;
	}
	public void setTemperaturaCongelacion(int temperaturaCongelacion) {
		this.temperaturaCongelacion = temperaturaCongelacion;
	}

	
	@Override
	public String toString() {
		return String.format("%s"
				+ "Temperatura de congelación recomendada: %s\n", super.toString(), temperaturaCongelacion);	}
	
	
	
}
