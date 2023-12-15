
package ejercicios10_10;

import java.util.Scanner;

public class ProgramaRectangulo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Indica la base del rectángulo 1: ");
		int base1= sc.nextInt();
		System.out.print("Indica la altura del rectángulo 1: ");
		int altura1= sc.nextInt();

		Rectangulo rectangulo1 = new Rectangulo (base1, altura1);
		
		
		System.out.print("Indica la base del rectángulo 2: ");
		int base2= sc.nextInt();
		System.out.print("Indica la altura del rectángulo 2: ");
		int altura2= sc.nextInt();

		Rectangulo rectangulo2 = new Rectangulo (base2, altura2);
		
		System.out.println();
		
		System.out.println("Área del 1er rectángulo: "+ rectangulo1.calcularArea());
		System.out.println("Área del 2º rectángulo: "+ rectangulo2.calcularArea());
		
		System.out.println();
		
		if(rectangulo1.getAltura()==rectangulo2.getAltura())
		{
			System.out.println("El 1er y el 2º rectángulo son igual de altos.");
		}
		if(rectangulo1.esMasAlto(rectangulo2)) 
		{
			System.out.println("El 1er rectángulo es más alto que el 2º.");
		}
		else
		{
			System.out.println("El 2º rectángulo es más alto que el 1º.");
		}
		
		System.out.println();
		
		if(rectangulo1.getBase()==rectangulo2.getBase())
		{
			System.out.println("El 1er y el 2º rectángulo son igual de anchos.");
		}
		if(rectangulo1.esMasAncho(rectangulo2)) 
		{
			System.out.println("El 1er rectángulo es más ancho que el 2º.");
		}
		else
		{
			System.out.println("El 2º rectángulo es más ancho que el 1º.");
		}
		
		System.out.println();
		
		if(rectangulo1.compararArea(rectangulo2)== -1)
		{
			System.out.println("El 1er rectángulo tiene más área que el 2º.");
		}
		if(rectangulo1.compararArea(rectangulo2)== 1)
		{
			System.out.println("El 1er rectángulo tiene menos área que el 2º.");
		}
		else
		{
			System.out.println("El 1er rectángulo tiene área que el 2º.");
		}

		
		
	}

}
