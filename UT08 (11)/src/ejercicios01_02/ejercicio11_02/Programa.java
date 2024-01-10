package ejercicios01_02.ejercicio11_02;

import java.time.LocalDate;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// se leen las personas y se introducen en el array
		Persona[] personas = leerPersonas(sc);

		if (numeroDePersonas(personas) > 0) {

			// se muestran todas las personas introducidas
			System.out.println("\\nPersonas introducidas: ");
			mostrarPersonas(personas);

			// se muestra la persona de mayor edad
			System.out.println("\\nPersona de mayor edad: ");
			System.out.println(personaMayorEdad(personas));

			// se muestran todas las personas que viven en Elche
			System.out.println("\\nNúmero de personas que viven en Elche: " + cuantasPersonasVivenEn("Elche", personas));

			// se muestra el número de personas mayores de edad
			System.out.println("\\nNúmero de personas mayores de edad : " + cuantasPersonasMayoresDeEdad(personas));
		}
		sc.close();
	}

	private static int cuantasPersonasMayoresDeEdad(Persona[] personas) {

		int cuantos=0;
		for (Persona persona : personas) {
			if (persona.esMayorDeEdad())
			{
				cuantos++;
			}
		}
		return cuantos;
	}

	private static int cuantasPersonasVivenEn(String string, Persona[] personas) {
		int cuantos = 0;
		
		for (Persona persona : personas) {
			if(persona.getLugar().trim().equalsIgnoreCase(string.trim()))
			{
				cuantos ++;
			}
		}
		return cuantos;
	}

	private static Persona personaMayorEdad(Persona[] personas) {
		Persona candidato = personas[0];
		
		for (Persona persona : personas) {
			if(candidato.getFechaNacimiento().isAfter(persona.getFechaNacimiento()))
			{
				candidato = persona;
			}
		}
		return candidato;
	}

	private static void mostrarPersonas(Persona[] personas) {
		for (Persona persona : personas) {
			System.out.println(persona);
		}
		
	}

	private static int numeroDePersonas(Persona[] personas) {
		return personas.length;
	}

	private static Persona[] leerPersonas(Scanner sc) {
		System.out.print("Cuántas personas quieres crear? ");
		Persona [] personas = new Persona [Integer.parseInt(sc.nextLine())];
		
		for (int i = 0; i < personas.length; i++) {
			personas[i]= crearPersona(sc);
		}

		return personas;
	}

	private static Persona crearPersona(Scanner sc) {
		
		System.out.print("Nombre: ");
		String nombre= sc.nextLine();
		System.out.print("Día de nacimiento:  ");
		int diaNacimiento = Integer.parseInt(sc.nextLine());
		System.out.print("Mes de nacimiento:  ");
		int mesNacimiento = Integer.parseInt(sc.nextLine());
		System.out.print("Año de nacimiento:  ");
		int anioNacimiento = Integer.parseInt(sc.nextLine());
		System.out.print("Dirección: ");
		String direccion= sc.nextLine();
		System.out.print("Ciudad: ");
		String ciudad= sc.nextLine();
		System.out.print("Código Postal: ");
		int codigoPostal=  Integer.parseInt(sc.nextLine());
		
		LocalDate fechaNacimiento= LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
		
		Persona nuevapersona = new Persona (nombre, fechaNacimiento, direccion, codigoPostal, ciudad );
		
		return nuevapersona;
	}


	

}
