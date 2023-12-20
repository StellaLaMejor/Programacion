package ejercicios01_02;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio09_02 {

	
	private final static int LIMITE_MAX = 500;
	private static final int LIMITE_MIN = 0;

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Random rdm = new Random();

		System.out.print("Límite inferior A (no puede ser inferior a 0 ni superior a 500): ");
		String limiteA= sc.nextLine();
		int limiteAInt= comprobarLimite(sc, limiteA, LIMITE_MIN, LIMITE_MAX);
		

		System.out.print("Límite superior B (no puede ser inferior a 0 ni superior a 500): ");
		String limiteB= sc.nextLine();
		int limiteBInt= comprobarLimite(sc, limiteB, LIMITE_MIN, LIMITE_MAX);

		

		int contadorIntentos = -1;
		
		while (limiteAInt>=limiteBInt)
		{
            System.out.println("El límite superior debe ser mayor que el límite inferior.");

			System.out.printf("Introduce un nuevo límite inferior: ");
			limiteAInt= comprobarInt(sc.nextLine(),sc);
			
			System.out.printf("Introduce un nuevo límite superior: ");
			limiteBInt= comprobarInt(sc.nextLine(),sc);
		}

		int numeroRdm = rdm.nextInt(limiteAInt, limiteBInt + 1);

		System.out.printf("Introduce un número entre %d y %d: ", limiteAInt, limiteBInt);
		int adivinacion = -1;

        while (adivinacion != numeroRdm) {
			try {
				adivinacion = Integer.parseInt(sc.next());
                contadorIntentos++;

				if (adivinacion < limiteAInt || adivinacion > limiteBInt) {
					System.out.println("El número está fuera de los límites.");
				} else if (adivinacion < numeroRdm) {
					System.out.println("El número random es mayor.");
				} else if(adivinacion>numeroRdm) {
					System.out.println("El número random es menor.");
				}
			} catch (NumberFormatException f) {
				System.out.println("El número introducido no es un número válido");
				}
		}
		
		System.out.printf("El número %d es correcto.\n", adivinacion);
		System.out.printf("Te ha llevado %d intentos averiguarlo.", contadorIntentos);
	}
	
	public static int comprobarInt (String intA, Scanner sc)
	{	
		int limiteA=0;
		boolean correcto = false;
		
		while (!correcto) {
		    try {
		    	limiteA= Integer.parseInt(intA);
		        correcto = true;
		        
		    } catch (NumberFormatException a) {
		        System.out.println("El número introducido no es un número válido");
		        System.out.print("Introduce un número entero como límite inferior: ");
		        intA= sc.nextLine();
		        
		    } catch (Exception b) {
		        System.out.println("Error desconocido.");
		        System.out.print("Introduce un número entero como límite inferior: ");
		        intA= sc.nextLine();

		    }

		}
	    return limiteA;
	}
	
	public static int comprobarLimite (Scanner sc, String limiteString,  int LIMITE_MIN, int LIMITE_MAX)
	{
		int limiteInt= comprobarInt(limiteString,sc);

		while (!(limiteInt >= LIMITE_MIN && limiteInt <= LIMITE_MAX)) {
			System.out.println("El número introducido no es un número válido");
			System.out.print("Introduce un número mayor o igual a 0 y menor o igual a 500 como límite inferior: ");
			
			try {
				limiteInt = Integer.parseInt(sc.nextLine());
			}
			catch (Exception a)
			{
				limiteString=String.valueOf(limiteInt);
				limiteInt= comprobarInt(limiteString,sc);
			}
		}
		return limiteInt;
	}

}
