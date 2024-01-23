package ejercicios08_11;

import java.util.ArrayList;
import java.util.Locale;

import net.datafaker.Faker;

public class Programa {
	
	public static final int CANTIDAD_AGRICULTORES=1500000;

	public static void main(String[] args) {
		
		Faker fake = new Faker(new Locale("es"));

		ArrayList <Agricultor> agricultores = new ArrayList<>();
		
		for (int i = 0; i < CANTIDAD_AGRICULTORES; i++) {
			agricultores.add (i, new Agricultor (fake.name().firstName(),fake.commerce().productName()));
		}
		
		for (Agricultor agricultor : agricultores) {
			agricultor.recolectar();
			System.out.println();
		}
		
	System.out.printf("El total de kg que se han recolectado es: %d\n",Agricultor.getTotalKg());
		
		
	}

}
