package ejercicios46_50;

import java.util.Scanner;

public class Ejercicio04_50 {
	
	/*Crea una aplicación que nos calcule el área de un círculo, cuadrado o un triángulo. Esta aplicación:
•	Mostrará un menú con cuatro opciones:
o	1 – Círculo
o	2 – Cuadrado
o	3 – Triángulo 
o	0 – Salir
•	Si se elige 0, el programa terminará.
•	Si se elige 1, el programa pedirá al usuario el radio del círculo, calculará su área y mostrará el resultado.
•	Si se elige 2, el programa pedirá al usuario el lado del cuadrado, calculará su área y mostrará el resultado.
•	Si se elige 3, el programa pedirá al usuario la base y la altura del triángulo, calculará su área y mostrará el resultado.
•	Seguirá preguntando hasta que el usuario introduzca un cero.
Hay que tener en cuenta que:
•	Deben utilizarse métodos. Como mínimo (pueden crearse más):
o	Método para mostrar el menú
o	Método para calcular el área de un círculo: A = (R^2)*PI
o	Método para calcular el área de un cuadrado: A = L^2;
o	Método para calcular el área de un triángulo: A = (BxH)/2
*/
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);  

		menuArea();
		int respuesta= sc.nextInt();
		
		switch (respuesta) 
		{
		case 0: 
			System.out.println("Fin del programa.");
			break;
		case 1:
			System.out.print("Indica el radio del círculo: ");
			int radio=sc.nextInt();
			
			System.out.println("El área del círuclo es: "+ areaCirculo(radio));
			break;
		case 2:
			System.out.print("Indica el lado del cuadrado: ");
			int lado=sc.nextInt();
			
			System.out.println("El área del cuadrado es: "+ areaCuadrado(lado));
			break;
		case 3:
			System.out.print("Indica la base del triángulo: ");
			int base=sc.nextInt();
			System.out.print("Indica la altura del triángulo: ");
			int altura=sc.nextInt();
			
			System.out.println("El área del triángulo es: "+ areaTriangulo(base, altura));
			break;
		}
		
		if (respuesta != 0 && respuesta != 1 && respuesta != 2 && respuesta != 3)
		{
		System.out.println("La opción escogida no es correcta.");
		}
		
	}

	private static void menuArea ()
	{
		System.out.println("Elige la opción de la que quieres calcular el área:\n"
				+ "1 – Círculo\r\n"
				+ "2 – Cuadrado\r\n"
				+ "3 – Triángulo \r\n"
				+ "0 – Salir");
	}
	
	private static double areaCirculo(int radio)
	{
		return (radio^2)*3.14;
	}
	private static int areaCuadrado(int lado)
	{
		return lado^2;
	}
	private static int areaTriangulo(int base, int altura)
	{
		return (base*altura)/2;
	}

}
