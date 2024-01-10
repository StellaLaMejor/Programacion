package ejercicios01_02.ejercicio11_02;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {

	private String nombre;
	private LocalDate fechaNacimiento= LocalDate.now();
	private String direccion;
	private int codigoPostal;
	private String lugar;
	
	
	public Persona(String nombre, LocalDate fechaNacimiento, String direccion, int codigoPostal, String lugar) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.lugar = lugar;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	

	public boolean esMayorDeEdad ()
	{
		LocalDate fechaActual= LocalDate.now();
		Period edad = Period.between(this.fechaNacimiento, fechaActual);
		return edad.getYears() >=18; 
	}


	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nombre: " + this.nombre +"   ");
		builder.append("Fecha de nacimiento: "+ fechaNacimiento +"   ");
		builder.append("Dirección: "+ this.direccion +"   ");
		builder.append(this.codigoPostal +" " + lugar + "   ");
		return builder.toString();
	}
	
}
