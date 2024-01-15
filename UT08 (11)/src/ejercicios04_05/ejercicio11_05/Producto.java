package ejercicios04_05.ejercicio11_05;

//import net.datafaker.Faker;
//import net.datafaker.providers.base.FunnyName;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Producto {

	private LocalDate fechaCaducidad;
	private int numeroLote;
	
	
	public Producto(LocalDate fechaCaducidad, int numeroLote) {
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
	}


	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
	
	
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		return String.format("Fecha de caducidad: %s \n"
				+ "Numero de lote: %s \n", formato.format(fechaCaducidad), numeroLote);

	}
	
//	public static void main(String[] args) {
//	Faker faker = new Faker(new Locale("es"));
//	String a= faker.funnyName().name();
//	System.out.println(a);
//	String b= faker.dragonBall().character();
//	System.out.println(b);
//}
	
}
