package ejercicios04_05.ejercicio11_04;
//Subclase
public class Operario extends Empleado{

	
	public Operario(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		return String.format("Empleado %s", this.getNombre() + " -> Operario");
	}

}
