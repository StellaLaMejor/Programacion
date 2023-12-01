package ejercicios01_04.ejecicio06_01;

public class Programa {

	public static void main(String[] args) {
		
		
//		Crea un paquete para el ejercicio. En los ejercicios de clases necesitamos paquetes porque siempre crearemos al menos dos clases.
//		Crea una clase Perro que tenga los siguientes atributos:
//		•	Nombre del perro
//		•	Raza
//		•	Nombre del propietario.
//		•	Edad (años)
//		•	Peso en kg (puede tener decimales)
//		Crea getters y setters para todos los atributos.
//		Crea ahora una clase “Programa”, con el programa principal que:
//		•	Tenga un método “mostrarPerro”. Este método recibe un objeto de la clase Perro y muestra en consola sus atributos. Para hacerlo, tendrás 
//			que acceder a ellos a través de los getters. Debe mostrar un atributo por líneaperrito
//		•	Tenga un método main en el que:
//			o	Cree un objeto de la clase Perro.
//			o	Llame al método mostrarPerro, para que se muestren los atributos con su valor por defecto.
//			Fíjate en qué valores tienen los atributos. Serán sus valores por defecto cada vez que se creen objetos Perro.

		
		Perro perrito1 = new Perro ();

		System.out.println(mostrarPerro(perrito1));

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
