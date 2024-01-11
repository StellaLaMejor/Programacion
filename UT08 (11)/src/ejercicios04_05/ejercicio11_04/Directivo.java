package ejercicios04_05.ejercicio11_04;
//Subclase
public class Directivo extends Empleado{
	
	public Directivo (String nombre)
	{
		super(nombre);
	}

	
	@Override
	public String toString() {
		return String.format("Empleado %s", this.getNombre()+ " -> Directivo");
	}
}
