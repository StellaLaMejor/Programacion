package ejercicios07_08;

import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio08_07 {

	public static void main(String[] args) {
		
		LinkedList<String> nombres = new LinkedList<String>();
		
		nombres.add("hola");
		nombres.add("qué tal");
		System.out.println(nombres);
		nombres.remove();
		nombres.add("lululu");
		nombres.add("kjdsfj");
		System.out.println(nombres);
		nombres.remove();
		System.out.println(nombres);
		nombres.removeAll(nombres);
		System.out.println(nombres);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Cuál es tu nombre?");
		String respuesta= sc.nextLine();
		
		nombres.add(respuesta);
		nombres.add(respuesta+ " 2");
		
		System.out.println(nombres);
		nombres.remove(respuesta);
		
		System.out.println(nombres);
				

	}

}
