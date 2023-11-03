package examen1parcial;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Crea un programa Java que:
	• Pida al usuario un número entero A
	• Pida al usuario un segundo número entero B
	• Necesitamos que A sea menor que B. El programa tiene que preguntar de nuevo los dos números al
	  usuario mientras no se cumpla esta condición.
• Una vez que A sea menor que B, calcular:
	o La suma y la media de los números PARES entre A y B, pero SIN incluir A e incluyendo B
	o La suma y la media de los múltiplos de 3 entre A y B, pero SIN incluir A e incluyendo B.
A tener en cuenta:
	• Los números serán enteros positivos o negativos, o cero, pero nunca tendrán decimales. La media de
   	  los números sí puede tener decimales.
	• Las medias se tienen que representar con 2 decimales.
*/
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Introduce el número entero A: ");
		int a= sc.nextInt();
		System.out.print("Introduce el número entero B: ");
		int b= sc.nextInt();
		
		while(a>b)
		{
			System.out.println("El número A tiene que ser menor a el número B.");
			System.out.print("Introduce el número entero A: ");
			a= sc.nextInt();
			System.out.print("Introduce el número entero B: ");
			b= sc.nextInt();
		}
		
		int numerosPar=0;
		int numeros3=0;
		double mediaPar=0;
		double media3=0;
		int contadorP=0;
		int contador3=0;
		
		for (int i=a+1; i<b; i++)
		{
			if (i % 2 ==0 && i % 3 ==0)
			{
				numerosPar=numerosPar+i;
				numeros3=numeros3+i;
				contadorP++;
				contador3++;
			}
			else if (i % 2 ==0)
			{
				numerosPar=numerosPar+i;
				contadorP++;

			}
			else if (i % 3 ==0)
			{
				numeros3=numeros3+i;
				contador3++;			
			}
			//Es importante poner else if porque si no se pone, se cuenta el 1er if en el caso de que sea par y un múltiplo
			//de 3 y luego, también, se cuenta abajo también en el resto de los if
			
		}
		
		mediaPar= (double)numerosPar/contadorP;
		media3=(double)numeros3/contador3;
			
		System.out.printf("La suma de los números pares entre %d (no incluido) y %d (incluido) es %d\n", a, b, numerosPar );
		System.out.println("La media de estos números es "+ mediaPar);
		System.out.printf("La suma de los números múltiplos de 3 entre %d (no incluido) y %d (incluido) es %d\n", a, b, numeros3 );
		System.out.println("La media de estos números es "+ media3);
		
		sc.close();

	}

}
