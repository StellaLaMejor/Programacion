package ejercicios01_05.ejecicio06_04;

public class Programa {

	public static void main(String[] args) {
		
//		Modifica la clase perro (haz una copia de todo el paquete y modifícalo):
//			•	Añade un atributo “posición”, que podrá tener tres valores:
//			o	De pie
//			o	Sentado
//			o	Tumbado.
//		Para estos tres valores, crea constantes públicas (tipo String) en la clase Perro.
//			•	El atributo “posición” no podrá cambiarse desde fuera de la clase, pero si podrá consultarse. Es decir, no 
//			podemos hacer que el perro cambie de posición, pero sí saber en qué posición está. ¿Cómo puedes conseguir esto?
//			•	Por defecto, cuando se cree un objeto Perro, su posición será “Sentado”. ¿Cómo puedes conseguir esto?

		
		Perro perro = new Perro();
		
		mostrarPerro(perro);
		
		perro.setNombre("Lassie");
		perro.setRaza("Rough Collie");
		perro.setPropietario("Martin Smith");
		perro.setEdadAnios(7);
		perro.setPesoKg(22.62);
		
		mostrarPerro(perro);
		
		perro.setPropietario("Mary Peterson");
		
		mostrarPerro(perro);
		
		System.out.printf("Peso del perro antes de empezar: %.4f\n", perro.getPesoKg());
		
		perro.comer(250);
		System.out.printf("Peso del perro: %.4f\n", perro.getPesoKg());
		
		perro.jugar(0);
		System.out.printf("Peso del perro: %.4f\n", perro.getPesoKg());
		
		perro.jugar(15);
		System.out.printf("Peso del perro: %.4f\n", perro.getPesoKg());
		
		perro.comer(100);
		System.out.printf("Peso del perro: %.4f\n", perro.getPesoKg());
		
		perro.comer(-5);
		System.out.printf("Peso del perro: %.4f\n", perro.getPesoKg());
		
		perro.jugar(8);
		System.out.printf("Peso del perro: %.4f\n", perro.getPesoKg());
		
		perro.comer(250);
		System.out.printf("Peso del perro al final: %.4f\n", perro.getPesoKg());
		
	}
	
	private static void mostrarPerro(Perro perro) 
	{
		System.out.printf("Referencia: %s\n", perro);
		System.out.printf("Nombre: %s\n", perro.getNombre());
		System.out.printf("Raza: %s\n", perro.getRaza());
		System.out.printf("Propietario; %s\n", perro.getPropietario());
		System.out.printf("Edad: %02d\n", perro.getEdadAnios());
		System.out.printf("Peso: %.2f\n", perro.getPesoKg());
		System.out.printf("Posicion: %s\n", perro.getPosicion());
	}
	}

