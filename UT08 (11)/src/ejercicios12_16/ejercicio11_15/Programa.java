package ejercicios12_16.ejercicio11_15;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

import net.datafaker.Faker;

public class Programa {

	public static void main(String[] args) {

		Faker fake = new Faker (new Locale ("es"));
		String [] arrayString = new String[5];

		for (int i = 0; i < arrayString.length; i++) {
			arrayString[i]= fake.name().firstName();
		}
		System.out.println("Números antes de ordenar: ");
		System.out.println(Arrays.toString(arrayString));
		
		Arrays.sort(arrayString);
		
		System.out.println("Números después de ordenar: ");
		System.out.println(Arrays.toString(arrayString));

	}

}
