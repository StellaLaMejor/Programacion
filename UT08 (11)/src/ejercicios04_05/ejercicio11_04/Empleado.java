package ejercicios04_05.ejercicio11_04;
//Superclase
public class Empleado {
	
	private String nombre;

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public Empleado ()
	{
		this.nombre="";
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String toString() {

		return String.format("Empleado %s", this.nombre );
	}
	
	

}
