package ejercicios04_06;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Ejercicio08_05 {

	public static void main(String[] args) {

		List<Integer> numeros1 = new ArrayList<>();
		llenarArrayRandom(numeros1, 10, 15);
		System.out.println(numeros1);
		
		List<Integer> numeros2 = new ArrayList<>();
		llenarArrayRandom(numeros2, 10, 15);
		System.out.println(numeros2);
		
		List<Integer> resultado = new ArrayList<>();
		resultado= restar(numeros1, numeros2);
		System.out.println(resultado);

	}

	private static void llenarArrayRandom(List<Integer> numeros, int cantidad, int numeroMax) {

		Random rdm = new Random();

		ListIterator<Integer> numeros1 = numeros.listIterator();

		for (int i = 0; i < cantidad; i++) {
			numeros1.add(rdm.nextInt(numeroMax + 1));
		}
	}
	
	private static List<Integer> restar (List <Integer> minuendo, List <Integer> sustraendo)
	{
		if(minuendo == null)
			throw new IllegalArgumentException("El minuendo no puede ser nulo.");
		if(sustraendo == null)
			throw new IllegalArgumentException("El sustraendo no puede ser nulo.");
		
		List <Integer> resultado = new ArrayList<Integer>();
		
		for (Integer numero : minuendo) {
			if(!sustraendo.contains(numero)){	
					resultado.add(numero);
			}	
		}
		return resultado;
		
	}

}
