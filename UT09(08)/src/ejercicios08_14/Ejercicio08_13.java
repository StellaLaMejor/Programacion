package ejercicios08_14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio08_13 {
	
	te falta todo el problema amiga 
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Map<Integer, Integer> mapita = new HashMap<Integer, Integer>();
		
		boolean terminado=false;
		
		while (!terminado) {
		int personasQuierenFoto = sc.nextInt();
		String personaje =sc.next();
		
		if (personasQuierenFoto==0) {
			terminado=true;
		}else {
			if(personaje.equalsIgnoreCase("Mafalda")) {
				
			}
		}
		
		}
		
		

		
	}

}
