package ejercicios04_05.ejercicio11_05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ProductoFresco extends Producto{

	private LocalDate fechaEnvasado;
	private String paisOrigen;
	
	
	public ProductoFresco(LocalDate fechaCaducidad, int numeroLote, LocalDate fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, numeroLote);
		this.fechaEnvasado= fechaEnvasado;
		this.paisOrigen=paisOrigen;
		
	}


	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}


	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%s"
				+ "Fecha envasado: %s\n"
				+ "País de origen: %s\n",  super.toString(),formato.format(fechaEnvasado), paisOrigen);
	}
	

}
