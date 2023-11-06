package examen1parcial_b;

import java.util.Scanner;

public class Ejercicio1B {

	public static void main(String[] args) {
		
//		ESTÁ SIN TERMINARRRR AAAAAA
		 
/*Crea un programa Java que:
• Pida al usuario un número entero A
• Pida al usuario un segundo número entero B
• Necesitamos que A sea menor que B. El programa tiene que preguntar de nuevo los dos números al
usuario mientras no se cumpla esta condición.
• Una vez que A sea menor que B, calcular la suma y la media de los números IMPARES entre A y B,
pero SIN incluir A e incluyendo B
A tener en cuenta:
• Los números serán enteros positivos o negativos, o cero, pero nunca tendrán decimales. La media de
los números sí puede tener decimales.
• La media se tiene que representar con 2 decimales.*/

	Scanner sc= new Scanner (System.in);
	
	System.out.print("Intruduce un número entero A: ");
	int a= sc.nextInt();
	System.out.print("Introduce un número entero B: ");
	int b= sc.nextInt();
	
	while (a>b)
	{
		System.out.println("Números incorrectos. \nEl número A tiene que ser menor que el B.");
		System.out.print("Intruduce un número entero A: ");
		a= sc.nextInt();
		System.out.print("Introduce un número entero B: ");
		b= sc.nextInt();
	}
	
	int contador=0;
	int veces=0;
	
	for(int i= a++;a<b;i++)
	{
		if(i%2!=0)
		{
			contador=contador+i;
			veces++;
		}
	}
	
	int media= contador/veces;
	
	System.out.printf("La suma de los números impares entre %d (no incluido) y %d (incluido) es: %d",a, b, contador);
	System.out.printf("La media de estos números es: %f.2", media);
	
	}

}
