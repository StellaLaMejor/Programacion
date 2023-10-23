package ejercicios36_40;

import java.util.Scanner;

public class Ejercicio04_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Escribe un programa que pida el límite inferior y superior de un intervalo (números enteros). Si el límite inferior es mayor
//		que el superior lo tiene que volver a pedir, y seguir haciéndolo hasta que el usuario lo haga correctamente. A continuación, se 
//		van introduciendo números enteros hasta que introduzcamos el 0. Entonces, el programa dará las siguientes informaciones:
//			•	La suma de los números que están dentro del intervalo. Intervalo abierto, no incluye los límites.
//			•	Cuántos números están fuera del intervalo. Como el intervalo es abierto, los números fuera del intervalo incluyen los límites. 
//			•	Informa si hemos introducido algún número igual a los límites del intervalo (solo si ha habido alguno o no).

		Scanner sc= new Scanner (System.in);
		
		System.out.print("Indica un límite inferior de un intervalo: ");
		int inferior= sc.nextInt();
		
		System.out.print("Indica un límite superior de un intervalo: ");
		int superior= sc.nextInt();
		
		while(superior<inferior)
		{
			System.out.print("\nLos límites están mal establecidos.\nIndica un límite inferior de un intervalo: ");
			inferior= sc.nextInt();
			
			System.out.print("Indica un límite superior de un intervalo: ");
			superior= sc.nextInt();
		}
		while
			
		
	}

}
