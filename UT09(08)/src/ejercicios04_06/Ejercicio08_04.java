package ejercicios04_06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

import net.datafaker.Faker;

public class Ejercicio08_04 {

	private static final int LIMITE_NUMEROS = 10;
	private static final int CANTIDAD_NUMEROS = 10;

	public static void main(String[] args) {
		Faker fake = new Faker(new Locale("es"));
		ArrayList<Integer> numeros = new ArrayList<>();

		for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
			numeros.add(fake.random().nextInt(LIMITE_NUMEROS + 1));
		}
		System.out.println(numeros);
		List<Integer> copiaLista = new ArrayList<Integer>(numeros);
		
		eliminarDupliadosAlFinal(copiaLista);
		System.out.println(copiaLista);
		List<Integer> copiaLista2 = new ArrayList<Integer>(numeros);
		eliminarDupliadosAlPrincipio(copiaLista2);
		System.out.println(copiaLista2);

		
	}

	private static void  eliminarDupliadosAlFinal(List<Integer> lista) {

		List<Integer> yaAparecidos = new ArrayList<Integer>();
		
		Iterator<Integer> iterador = lista.iterator();

		while (iterador.hasNext()) {
			Integer numero = iterador.next();
			
			if(yaAparecidos.contains(numero))
			{
				iterador.remove();
			}
			else {
				yaAparecidos.add(numero);
			}
		}
		}

		private static void  eliminarDupliadosAlPrincipio(List<Integer> lista) {

			List<Integer> yaAparecidos = new ArrayList<Integer>();
			
			ListIterator<Integer> iterador = lista.listIterator(lista.size());

			while (iterador.hasPrevious()) {
				Integer numero = iterador.previous();
				
				if(yaAparecidos.contains(numero))
				{
					iterador.remove();
				}
				else {
					yaAparecidos.add(numero);
				}
				

			}

	}

}
