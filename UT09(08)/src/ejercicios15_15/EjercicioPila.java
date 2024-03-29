package ejercicios15_15;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class EjercicioPila {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un texto: ");
		String texto = sc.nextLine();
		System.out.println(comprobarParentesis(texto));


	}

	private static boolean comprobarParentesis(String entrada) {
		Deque<Character> pila = new LinkedList<>();
		
		if(entrada==null) {
			throw new IllegalArgumentException("La entrada no puede estar vacía.");
		}
		for (char caracter : entrada.toCharArray()) {

			if (esApertura(caracter)) {
				pila.push(caracter);
			} else if (esCierre(caracter)) {
				if(pila.isEmpty()) {
					return false;
				}
				char caracterApertura = pila.pop();
				if (!sonCoincidentes(caracterApertura, caracter)) {
					return false;
				}
			}
		}
		if(!pila.isEmpty()) {
			return false;
		}
		return true;
	}

	private static boolean sonCoincidentes(char caracterApertura, char caracterCierre) {
		return (caracterApertura == '{' && caracterCierre == '}') || (caracterApertura == '(' && caracterCierre == ')')
				|| (caracterApertura == '[' && caracterCierre == ']');
	}

	private static boolean esApertura(char caracter) {
		return caracter == '(' || caracter == '{' || caracter == '[';
	}

	private static boolean esCierre(char caracter) {
		return caracter == ')' || caracter == '}' || caracter == ']';

	}

}
