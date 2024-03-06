package ejercicios08_14;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Ejercicio08_09 {

	private static final int CANTIDAD_NUM = 1000;
	private static final int NUM_MIN = 1;
	private static final int NUM_MAX = 50;

	public static void main(String[] args) {

		Random rdm = new Random();
		List<Integer> numRandom = new LinkedList<>();
		Map<Integer, Integer> mapita = new HashMap<>();

		int a = 0;

		for (int i = 0; i < CANTIDAD_NUM; i++) {
			int numero = rdm.nextInt(NUM_MIN, NUM_MAX + 1);
			numRandom.add(numero);
		}

		for (Integer numero : numRandom) {

			if (mapita.containsKey(numero)) {
				mapita.put(numero, mapita.get(numero) + 1);
			} else {
				mapita.put(numero, 1);
			}
		}
		System.out.println(mapita);

	}

}
