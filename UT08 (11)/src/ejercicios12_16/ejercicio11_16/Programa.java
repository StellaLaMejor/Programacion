package ejercicios12_16.ejercicio11_16;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

import net.datafaker.Faker;

public class Programa {

	public static void main(String[] args) {

		Faker fake = new Faker (new Locale ("es"));
		Persona [] personas = new Persona [10];
		
		for (int i = 0; i < personas.length; i++) {
			personas [i]= new Persona(fake.name().firstName(), fake.name().lastName());
		}
		for (Persona persona : personas) {
			System.out.print(persona);
			System.out.print(", ");
		}
		System.out.println();
		Arrays.sort(personas);
		for (Persona persona : personas) {
			System.out.print(persona);
			System.out.print(", ");
		}
	}

}
