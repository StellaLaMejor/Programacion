package ejercicios08_14;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Ejercicio08_12 {

	
	private static final int [] NUMEROS_DIVISIBLESS= {2,3,5,7};
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
			for (int i = 0; i < NUMEROS_DIVISIBLESS.length; i++) {

				if(numero % NUMEROS_DIVISIBLESS[i] ==0) {
					if(mapita.containsKey(NUMEROS_DIVISIBLESS[i])) {
						List<Integer> a = mapita.get(NUMEROS_DIVISIBLESS[i]);
						if(!a.contains(numero))
							a.add(numero);
					}
					else {
						mapita.put(NUMEROS_DIVISIBLESS[i], new LinkedList<Integer>(List.of(numero)));
					}
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
