package ejercicios16_20;

import java.util.Scanner;

public class Ejercicio04_19 {
	
	public static final int ZONA_1 = 24;
	public static final int ZONA_2 = 20;
	public static final int ZONA_3 = 21;
	public static final int ZONA_4 = 10;
	public static final int ZONA_5 = 18;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);

		System.out.print("Indica el peso en gramos del paquete: ");
		int peso= sc.nextInt();
		
		System.out.println("Zonas a las que puede ser enviado el paquete: "
							+ "\n \t ZONA 1 - AMÉRICA DEL NORTE"
							+ "\n \t ZONA 2 - AMÉRICA CENTRAL"
							+ "\n \t ZONA 3 - AMÉRICA DEL SUR"
							+ "\n \t ZONA 4 - EUROPA"
							+ "\n \t ZONA 5 - ASIA");
		
		System.out.print("\nZona a la que se enviará el paquete (1-5): ");
		int zona= sc.nextInt();
		
		
		if (peso > 5000)
		{
			System.out.println("\nEl peso del paquete no es correcto, no puede ser mayor de 5 kg.");
		} 
		else
		{
		
		switch (zona)
		{
		case 1:
			int resultado = peso* ZONA_1;
			System.out.println("\nEl coste del envío es de: "+ resultado+ "€");
			
			break;
			
		case 2:
			resultado = peso* ZONA_2;
			System.out.println("\nEl coste del envío es de: "+ resultado + "€");
			
			break;
			
		case 3:
			resultado = peso* ZONA_3;
			System.out.println("\nEl coste del envío es de: "+ resultado+ "€");
			
			break;
			
		case 4:
			resultado = peso* ZONA_4;
			System.out.println("\nEl coste del envío es de: "+ resultado+ "€");
			
			break;
			
		case 5:
			resultado = peso* ZONA_5;
			System.out.println("\nEl coste del envío es de: "+ resultado+ "€");
			
			break;
			
		default:
			System.out.println("La zona no es válida");
		}
		
		}
		
	}

}
