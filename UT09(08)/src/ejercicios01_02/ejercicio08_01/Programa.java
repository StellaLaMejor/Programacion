package ejercicios01_02.ejercicio08_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import net.datafaker.Faker;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		leerValoresUsuario(sc, numeros);
		System.out.println(numeros);
		System.out.printf("Se han cargado %d números en la colección\n", numeros.size());
		System.out.printf("La media de los valores es %.2f\n", calcularMedia(numeros));
		int minimo= obtenerMinimo(numeros);
		System.out.printf("El número más pequeño es %d\n", minimo);
		System.out.printf("Está en la posición %d\n", numeros.indexOf(minimo));
		int maximo= obtenerMaximo(numeros);
		System.out.printf("El número más mayor es %d\n",maximo );
		System.out.printf("Está en la posición %d\n", numeros.indexOf(maximo));



	}

	private static void leerValoresUsuario(Scanner sc, Collection<Integer> numeros) {

		int respuestaInt = 0;
		do {
			System.out.printf("Introduce un número para llenar el array (-9999 para termiar): ");
			respuestaInt = sc.nextInt();
			if (respuestaInt != -9999)
				numeros.add(respuestaInt);
		} while (respuestaInt != -9999);

	}

	private static double calcularMedia(Collection<Integer> numeros) {
		int suma = 0;
		for (Integer numero : numeros) {
			suma += numero;
		}
		return suma / numeros.size();
	}

	private static int obtenerMaximo(Collection<Integer> numeros) {
		int numMayor= Integer.MIN_VALUE;
		
		for (Integer numero : numeros) {
			if(numero>numMayor)
				numMayor= numero;
		}
		return numMayor;
	}
	private static int obtenerMinimo(Collection<Integer> numeros) {
		int numMenor= Integer.MAX_VALUE;
		
		for (Integer numero : numeros) {
			if(numero<numMenor)
				numMenor= numero;
		}
		return numMenor;
	}

}
