package ejercicios01_05.ejecicio06_03;

public class Programa {

	public static void main(String[] args) {
		
//	Modifica la clase perro (haz una copia de todo el paquete y modifícalo) para añadir dos métodos:
//		•	Método “comer”, que:
//			o	Recibe un entero que es la cantidad de comida que come el perro. En gramos. Esta cantidad:
//				Si es mayor de 200, se considerará que es 200.
//				Si es menor que cero, se considerará que es cero.
//			o	Mostrará en la consola un mensaje: “Soy <nombre del perro> y estoy comiendo <cantidad de comida (ya ajustada)> gr de comida”.
//			o	Al comer el perro aumenta su peso. Para calcular el aumento:
//				Aumento de peso = cantidad de comida / 10 (división entera)
//		•	Método “jugar”, que:
//			o	Recibe un entero que es el tiempo en minutos que el perro va a jugar. Esta cantidad:
//				Si es mayor de 10, se considerará que es 10.
//				Si es menor que cero, se considerará que es cero.
//			o	Mostrará en la consola un mensaje: “Soy <nombre del perro> y estoy jugando <tiempo de juego (ya ajustado)> minutos”.
//			o	Al jugar el perro pierde peso. Para calcular la pérdida:
//				Pérdida de peso = tiempo de juego / 7 (división entera)
//	En el programa principal, añade llamadas a jugar y a comer, para comprobar que aparecen los mensajes adecuados. También
//	añade sentencias para mostrar el peso del perro cada vez que hace algunas de las dos cosas.
		

		
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

	}
	}