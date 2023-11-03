package examen1parcial;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
	Scanner sc =new Scanner (System.in);
	
	
	int opcion= pedirOpcionUsuario(sc);
	realizarOperacion(sc, opcion);

	}

	private static void mostrarMenu ()
	{
		System.out.print(" MENÚ DE OPCIONES:\n"
							+ "  1.- Sumar (A+B)\n"
							+ "  2.- Restar (A-B)\n"
							+ "  3.- Multiplicar (A*B)\n"
							+ "  4.- Dividir (A/B)\n"
							+ "  5.- Potencia (A elevado a B)\n"
							+ "  0.- Salir\n");
	}
	
	private static int pedirOpcionUsuario (Scanner sc)
	{
		mostrarMenu();
		int opcionElegida= sc.nextInt();
				
		switch (opcionElegida) 
		{
			case 1:
				return opcionElegida;
			case 2:
				return opcionElegida;
			case 3:
				return opcionElegida;
			case 4:
				return opcionElegida;
			case 5:
				return opcionElegida;
			case 0:
				return opcionElegida;
			default:
				while(opcionElegida<0 || opcionElegida>5)
				{
					System.out.println("El valor introducido no es correcto.");
					mostrarMenu();
					System.out.print("Elige una nueva opción: ");
					opcionElegida=sc.nextInt();
					
				}
			return opcionElegida;
		}
	}
	
	private static double realizarOperacion (Scanner sc, int opcion)
	{
		while (opcion != 0)
		{
			System.out.print("Indica el primer número: ");
			int primerNumero= sc.nextInt();
			System.out.print("Indica el segundo número: ");
			int segundoNumero= sc.nextInt();
			
			int suma= primerNumero+ segundoNumero;
			int restar= primerNumero-segundoNumero;
			int multiplicar = primerNumero*segundoNumero;
			double division = 1;
			double potencia= Math.pow(primerNumero, segundoNumero);
			
			switch (opcion)
			{
			case 1:
				System.out.println(primerNumero+ " + "+ segundoNumero+ " = "+ suma);
				break;
			case 2:
				System.out.println(primerNumero+ " - "+ segundoNumero+ " = "+ restar);
				break;
			case 3:
				System.out.println(primerNumero+ " X "+ segundoNumero+ " = "+ multiplicar);
				break;
			case 4:
				if (segundoNumero!=0)
				{
				division=primerNumero/segundoNumero;
				System.out.println(primerNumero+ " : "+ segundoNumero+ " = "+ division);
				break;
				}
				else 
				{
					System.out.println("Esta operación es ilegal.");
					break;	
				}
			case 5:
				System.out.println(primerNumero+ " ^ "+ segundoNumero+ " = "+ potencia);
				break;
			
			}
			
			opcion= pedirOpcionUsuario(sc);
		}
		System.out.println("Gracias por usar la calculadora.");
		return 0;
	}
}
