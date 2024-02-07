package ejercicios22_22;

import java.util.Locale;

import net.datafaker.Faker;

public class Programa {
	public static void main(String[] args) {
		
		Faker fake = new Faker (new Locale ("es"));
		
		Vehiculo t1= new Camion(fake.name().firstName(), fake.random().nextInt(100000)+fake.random().hex(4),String.valueOf(fake.random().nextInt(1000000)),6, 100);
		Vehiculo a1= new Ultraligero(fake.name().firstName(), fake.random().nextInt(100000)+fake.random().hex(4),String.valueOf(fake.random().nextInt(1000000)),500, 10);
		
+
System.out.println(t1);
		System.out.println(a1);
		
		
	}

}
