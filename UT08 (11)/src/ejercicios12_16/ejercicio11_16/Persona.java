package ejercicios12_16.ejercicio11_16;

public class Persona implements Comparable {

	private String nombre;
	private String apellido;
	
	public String getApellido() {
		return apellido;
	}

	public Persona(String nombre, String apellido) {

		this.nombre = nombre;
		this.apellido = apellido;

	}

	@Override
	public String toString() {
		return String.format("%s %s", nombre, apellido);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int compareTo(Object o) {
		
		return this.apellido.compareTo(((Persona) o).getApellido());
	}

}
