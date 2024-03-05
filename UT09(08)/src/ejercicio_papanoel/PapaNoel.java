package ejercicio_papanoel;

import java.util.LinkedList;
import java.util.Scanner;

public class PapaNoel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("¿Cuántos niños hay en la cola? ");
		int cantidadNinios = Integer.parseInt(sc.nextLine());

		LinkedList<Integer> regalosNinios = new LinkedList<Integer>();

		int contador = 1;
		do {
			System.out.printf("¿Cuántos regalos quiere pedir el niño %d? ", contador);
			regalosNinios.add(Integer.parseInt(sc.nextLine()));

			contador++;
		} while (contador < cantidadNinios + 1);

		System.out.println("¿En qué posición está el niño que quieres controlar? ");
		int posicionNinio = Integer.parseInt(sc.nextLine()) - 1;

		int contadorPapaNoel = 0;
		boolean terminado = false;

		while (regalosNinios.isEmpty() && !terminado) {
			Integer numRegalosPrimero = regalosNinios.poll();
			contadorPapaNoel++;

			if (posicionNinio == 0) {
				if (numRegalosPrimero == 0) {
					terminado = true;
				} else {
					regalosNinios.offer(numRegalosPrimero);
					posicionNinio = regalosNinios.size() - 1;
				}
			}

			else {
				posicionNinio--;
				if (numRegalosPrimero > 0) {

					regalosNinios.offer(numRegalosPrimero);
				}

			}
		}

//		for (int i = 0; i < cantidadNinios; i++) {
//
//			tiempoPorNinio.add(regalosNinios.get(i) * 2);
//		}
//
//		int tiempoTotal = 0;
//
//		for (Integer tiempo : tiempoPorNinio) {
//			tiempoTotal += tiempo;
//		}
//
//		System.out.println("Tiempo total de la espera: "+ tiempoTotal);
//		
	}

}
