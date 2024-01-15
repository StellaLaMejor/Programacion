package ejercicios04_05.ejercicio11_05;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto{

	private int codigoOrganismo;

	public ProductoRefrigerado(LocalDate fechaCaducidad, int numeroLote, int codigoOrganismo) {
		super(fechaCaducidad, numeroLote);
		this.codigoOrganismo= codigoOrganismo;
	}

	
	public int getCodigoOrganismo() {
		return codigoOrganismo;
	}
	public void setCodigoOrganismo(int codigoOrganismo) {
		this.codigoOrganismo = codigoOrganismo;
	}
	
	
	@Override
	public String toString() {
	return String.format("%s"
				+ "Código del organismo de supervisión alimentaria: %s\n", super.toString(), codigoOrganismo);
	}
}
