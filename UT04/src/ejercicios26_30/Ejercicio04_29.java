package ejercicios26_30;

import java.util.Scanner;

public class Ejercicio04_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Crea un programa que pida números enteros positivos hasta que se introduzca un cero. Debe calcular la suma y la media de todos los números introducidos. 
//		Si el usuario introduce un número menor que cero, debe mostrar un mensaje indicando que no es válido y no tenerlo en cuenta para el cálculo.

		Scanner sc = new Scanner(System.in);
		int num;
		int suma=0;
		double media;
		int veces = 0;

		do {
			System.out.println("Intrduce un número entero (0 para terminar): ");
			num = sc.nextInt();

			if (num < 0) {
				System.out.println("El número introducido no es válido.");
			} else if (num>0)
			{
				suma = suma + num;
				veces++;
			}
		} while (num != 0);

			media = suma / veces;
		

		if (num == 0) {
			System.out.printf("La suma de los números es: %d\nLa media de los números introducidos es: %.2f\n", suma,
					media);

			System.out.println("Fin del programa.");
		}

	}

}
