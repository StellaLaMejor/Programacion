package ejercicios01_05.ejecicio06_02;

public class Programa {

	public static void main(String[] args) {
		
		
//Modifica el programa anterior (haz una copia de todo el paquete y modifícalo) para que:
//	•	Muestre el objeto creado (lo mismo que hacía el programa anterior), para que se muestren los valores por defecto de los atributos.
//	•	Modifique los atributos del objeto creado (usando los setters), con los siguientes valores:
//	o	Nombre del perro: Lassie
//	o	Raza: Rough Collie
//	o	Nombre del propietario: Martin Smith
//	o	Edad: 7 años.
//	o	Peso: 22,62 Kg
//	•	Muestre de nuevo el objeto perro, con los nuevos valores.
//	•	Modifique el propietario del perro, a “Mary Peterson”.
//	•	Muestre de nuevo el objeto.
//	Fíjate como al cambiar atributos cambia el estado 


		
		Perro perrito1 = new Perro ();


		perrito1.setNombrePerro("Lassie");
		perrito1.setRaza("Rough Collie");
		perrito1.setNombreDueño("Martín Smith");
		perrito1.setEdad(7);
		perrito1.setPeso(22.62);
		
		System.out.println(mostrarPerro(perrito1));

		perrito1.setNombreDueño("Mary Peterson");
		
		System.out.println("El nombre del dueño corregido es: "+ perrito1.getNombreDueño());
		
	}
	
	
	
	private static String mostrarPerro (Perro perrito)
	{

		StringBuilder sb = new StringBuilder();
		
		sb.append("El nombre del perro es: ");
		sb.append(perrito.getNombrePerro()+ "\n");
		
		sb.append("La raza del perro es: ");
		sb.append(perrito.getRaza()+ "\n");
		
		sb.append("El nombre del propietario es: ");
		sb.append(perrito.getNombreDueño()+ "\n");
		
		sb.append("La edad del perro es: ");
		sb.append(perrito.getEdad()+ "\n");
		
		sb.append("El peso del perro es: ");
		sb.append(perrito.getPeso()+ "\n");

		String cadenaCompleta= sb.toString();

		return cadenaCompleta;

	}
}
