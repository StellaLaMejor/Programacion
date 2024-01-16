package ejercicios06_06;

import java.util.Random;

import javax.naming.ldap.Rdn;

import net.datafaker.Faker;

public class Programa {
	
	private static final int TAMANIO_ARRAY=2;

	public static void main(String[] args) {
me falta una parte 
		Electrodomestico [] electrodomesticos = new Electrodomestico[TAMANIO_ARRAY];
		
		for (int i=0; i<electrodomesticos.length;i++) {
			Electrodomestico electrodomestico= electrodomesticos[i];

			if(i>0)
			{
			Faker fake = new Faker();
			
			double precioBase= fake.number().randomDouble(2, 100, 300);
			double peso=fake.number().randomDouble(2, 0, 120);
			Color color = generarColorAleatorio();
			ConsumoEnergetico consumoEnergetico = generarConsumoEnergeticoAleatorio();
			
			electrodomestico= new Electrodomestico(precioBase, peso, color, consumoEnergetico);
			
			System.out.println("ELECTRODOMÉSTICO: ");
			System.out.println(electrodomestico.toString());
			
			}else {
				System.out.println("ELECTRODOMÉSTICO DEFECTO: ");
				electrodomestico= new Electrodomestico();
				System.out.println(electrodomestico.toString());
			}
			
			
		}

		Lavadora [] lavadoras = new Lavadora[TAMANIO_ARRAY];
		
		for (int i=0; i<lavadoras.length;i++) {
			Lavadora lavadora= lavadoras[i];

			if(i>0)
			{
			Faker fake = new Faker();

			double carga=fake.number().randomDouble(1, 1, 13);
			lavadora= new Lavadora (carga);
			System.out.println("LAVADORA: ");
			System.out.println(lavadora.toString());
			
			}else {
				System.out.println("LAVADORA DEFECTO: ");
				lavadora= new Lavadora();
				System.out.println(lavadora.toString());
			}
			
			
		}
		Television [] televisiones = new Television[TAMANIO_ARRAY];
		
		for (int i=0; i<televisiones.length;i++) {
			Television tele = televisiones[i];

			if(i>0)
			{
			Faker fake = new Faker();
			Random rdm = new Random ();
			double precioBase= fake.number().randomDouble(2, 100, 300);
			double peso=fake.number().randomDouble(2, 0, 120);
			Color color = generarColorAleatorio();
			ConsumoEnergetico consumoEnergetico = generarConsumoEnergeticoAleatorio();
			int resolucionPulgadas= rdm.nextInt(30, 120);
			boolean sintonizador = fake.bool().bool();
			
			tele= new Television (precioBase, peso, color, consumoEnergetico,resolucionPulgadas,sintonizador);
			System.out.println("TELEVISIÓN: ");
			System.out.println(tele.toString());
			
			}else {
				tele= new Television();
				System.out.println("TELEVISIÓN DEFECTO: ");
				System.out.println(tele.toString());
			}
			
			
		}

	}

	  public static Color generarColorAleatorio() {
	        Color[] colores = Color.values();
	        Random random = new Random();
	        int indiceAleatorio = random.nextInt(colores.length);
	        return colores[indiceAleatorio];
	    }
	  
	  public static ConsumoEnergetico generarConsumoEnergeticoAleatorio() {
	        ConsumoEnergetico[] consumos = ConsumoEnergetico.values();
	        Random random = new Random();
	        int indiceAleatorio = random.nextInt(consumos.length);
	        return consumos[indiceAleatorio];
	    }
	  
}
