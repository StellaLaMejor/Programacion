package ejercicios12_16.ejercicio11_14;

import java.util.Arrays;
import java.util.Random;

public class Programa {
	public static void main(String[] args) {

		Random rdm = new Random();
		int[] arrayInt = new int[5];

		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i]= rdm.nextInt(20);
		}
		System.out.println("Números antes de ordenar: ");
		System.out.println(Arrays.toString(arrayInt));
		
		Arrays.sort(arrayInt);
		
		System.out.println("Números después de ordenar: ");
		System.out.println(Arrays.toString(arrayInt));
	}

}
