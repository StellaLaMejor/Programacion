package ejercicios51_53;

import java.util.Scanner;

public class Ejercicio04_53 {

	public static void main(String[] args) {

/*Crea un método “mostrarTablaMultiplicar” que:
•	Recibe un parámetro “número”.
•	No devuelve ningún valor.
Mostrará en la consola la tabla de multiplicar del número (multiplicado del 1 al 10)
Utilizando este método y el método del ejercicio 51, crea un programa principal que:
•	Pida al usuario que introduzca valores entre 0 y 10, ambos incluidos, usando el método del ejercicio 51.
•	Si el valor es mayor que cero, muestra la tabla de multiplicar (usando el método previamente descrito) y vuelve
a preguntar.
•	Cuando el usuario introduzca un cero, el programa termina
*/
	Scanner sc =new Scanner (System.in);
	
	int a=Ejercicio04_51.pedirNumero(sc, "Introduce unos valores entre el 0 y el 10: ", 0, 11);
	
	while(a!=0)
	{
		if(a>0)
		{
			mostrarTablaMultiplicar(a);
			a=Ejercicio04_51.pedirNumero(sc, "Introduce unos valores entre el 0 y el 10: ", 0, 11);
			a=sc.nextInt();
		}
	}
	
	if(a==0)
	{
		System.out.println("Fin del programa.");
	}
	
}

	private static void mostrarTablaMultiplicar(int numero)
	{
		for (int i=1; i<=10; i++)
		{
			System.out.printf("%d X %d = %d\n", numero, i, numero*i);
		}
	}
}
