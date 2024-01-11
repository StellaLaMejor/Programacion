package ejercicios04_05.ejercicio11_04;
//Subclase Operario
public class Oficial extends Operario {

	public Oficial(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		return String.format("Empleado %s", this.getNombre()+ " -> Operario -> Oficial");
	}
}
