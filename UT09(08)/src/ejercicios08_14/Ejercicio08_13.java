package ejercicios08_14;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio08_13 {
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner ("5 "
				+ " Manolito Mafalda Susanita Miguelito\r\n"
				+ "4 Mafalda Susanita Miguelito Felipe\r\n"
				+ "10 Felipe Felipe Felipe Susanita Miguelito Libertad Guille Mafalda Mafalda Susanita\r\n"
				+ "0");
		
		Map<Integer, Integer> mapita = new HashMap<Integer, Integer>();
		Deque<String> personaje = new LinkedList<String>();
		Set<String> sin terminarrrr y tienes que hacer el 14 también
		boolean terminado=false;
		
		while (!terminado) {
		int personasQuierenFoto = sc.nextInt();
		personaje.add(sc.next());
		
		int seHanHechoFoto=0;
		boolean mafaldaCogida= false;
		
		if (personasQuierenFoto==0) {
			terminado=true;
		}else {
			if(personaje.contains("Mafalda")) {
				if (mafaldaCogida) {
					personasQuierenFoto--;
					seHanHechoFoto++;
				}else {
					mafaldaCogida=true;
				}
			}
		}
		
		}
		
		

		
	}

}
