package ejercicios01_02.ejercicio08_02;

import java.time.LocalDate;
import java.util.Objects;

public class Alumno {

	private String nif;
	private String nombre;
	private String apellidos;
	private String cicloFormativo;
	private int curso;
	private LocalDate fechaNacimiento;

	
	
	public Alumno(String nif) {
		this.nif = nif;
	}

	public Alumno(String nif, String nombre, String apellidos, String cicloFormativo, int curso,
			LocalDate localDate) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cicloFormativo = cicloFormativo;
		this.curso = curso;
		this.fechaNacimiento = localDate;
	}

	public String getNif() {
		return nif;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getCicloFormativo() {
		return cicloFormativo;
	}

	public void setCicloFormativo(String cicloFormativo) {
		this.cicloFormativo = cicloFormativo;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(nif, other.nif);
	}


	
	@Override
	public String toString() {
		return String.format("Alumno/a %s %s con NIF %s está cursando %dº de %s ha nacido el %s", getNombre(),
				getApellidos(), getNif(), getCurso(), getCicloFormativo(), getFechaNacimiento());
	}

}
