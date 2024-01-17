package ejercicios06_06;

import java.util.Random;

import javax.naming.ldap.Rdn;

import net.datafaker.Faker;

public class Programa {
	
	private static final int TAMANIO_ARRAY=2;

	public static void main(String[] args) {
		Electrodomestico [] electrodomesticos1 = new Electrodomestico[10];
		
		electrodomesticos1[0]= new Lavadora();
		electrodomesticos1[1]= new Television();
		electrodomesticos1[2]= new Electrodomestico();
		electrodomesticos1[3]= new Lavadora();
		electrodomesticos1[4]= new Television();
		electrodomesticos1[5]= new Electrodomestico();
		electrodomesticos1[6]= new Lavadora();
		electrodomesticos1[7]= new Television();
		electrodomesticos1[8]= new Electrodomestico();
		electrodomesticos1[9]= new Lavadora();

		mostrarTodosLosPrecios(electrodomesticos1);

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

	  private static void mostrarTodosLosPrecios(Electrodomestico[] electrodomesticos1) {
		for (Electrodomestico electrodomestico : electrodomesticos1) {
			System.out.println(electrodomestico.getPrecioFinal());
		}
		System.out.println();
	}

	private static double precioMedioL(Lavadora[] lavadoras) {
		  double suma= 0;
		  for (int i = 0; i < lavadoras.length; i++) {
			Lavadora lavadora = lavadoras[i];
			suma= lavadora.getPrecioFinal()+ suma;
		}
		  double precioMedio= suma /lavadoras.length;
		return precioMedio;
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
	  public static double precioMedio(Television [] tele)
	  {
		  double suma= 0;
		  for (int i = 0; i < tele.length; i++) {
			Television television = tele[i];
			suma= television.getPrecioFinal()+ suma;
		}
		  double precioMedio= suma /tele.length;
		return precioMedio;
		  
	  }
	  
}
