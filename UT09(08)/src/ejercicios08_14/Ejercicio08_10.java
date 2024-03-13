package ejercicios08_14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class Ejercicio08_10 {

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
		
        List<Map.Entry<Integer, Integer>> listaEntradas = new LinkedList<>(mapita.entrySet());

		Collections.sort(listaEntradas, new Comparator<Map.Entry<Integer,Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		System.out.println(listaEntradas);
	}

}