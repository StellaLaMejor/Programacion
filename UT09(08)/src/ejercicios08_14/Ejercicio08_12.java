package ejercicios08_14;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Ejercicio08_12 {

	private static final int MAX_RANDOM = 10;
	private static final int CANTIDAD_NUMEROS = 100;
	

	public static void main(String[] args) {

		Random rdm = new Random();
		List<Integer> lista = new LinkedList<>();

		for (int i = 0; i < CANTIDAD_NUMEROS; i++) {

			lista.add(rdm.nextInt(1, MAX_RANDOM + 1));
		}

		System.out.println(lista);

		Map<Integer, List<Integer>> mapita = new TreeMap<>();


		for (Integer numero : lista) {
			if(numero % 2==0) {
				if(mapita.containsKey(2)) {
					List<Integer> a = mapita.get(2);
					a.add(numero);
				}
				else {
					mapita.put(2, new LinkedList<Integer>(List.of(numero)));
				}
			}
		}
		
		for (Map.Entry<Integer, List<Integer>> entry : mapita.entrySet()) {
			Integer key = entry.getKey();
			List<Integer> listaDivisibles = entry.getValue();
			
			System.out.printf("Divisibles por %s: %s\n", key, listaDivisibles);
		}

	}

}
