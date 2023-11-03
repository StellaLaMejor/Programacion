package ejercicios51_53;

import java.util.Scanner;

public class Ejercicio04_51 {
	
 	public static void main(String[] args) {
/*Crea un método “pedirNumero” que:
•	Recibe cuatro parámetros:
o	Un objeto Scanner, para poder interactuar con el usuario.
o	Un mensaje, que será la pregunta que se hará al usuario cada vez que tenga que introducir el número.
o	Un entero, límite superior inclusivo.
o	Un entero, límite superior exclusivo.
•	Devuelve un número entero, que siempre estará entre el límite inferior (incluido) y el límite superior (excluido).

Este método realizará el siguiente proceso:
•	Si los valores de los límites no son correctos (está mal si el inferior es mayor o igual al superior), 
	muestra un mensaje de error y devuelve cero.
•	Pedirá al usuario, usando el mensaje que ha recibido como parámetro, que introduzca un número.
•	Si el número no está entre el límite inferior (incluido) y el exterior (excluido), mostrará un mensaje de error 
	del tipo “El número introducido no está entre xxx (incluido) y zzz (excluido), y volverá a preguntar, hasta que el 
	usuario introduzca le valor correcto.
•	Devolverá el valor correcto introducido por el usuario.
Haz un pequeño programa principal con pruebas para el caso en que los límites sean incorrectos y para el 
caso en que sean correctos.
*/
	Scanner sc= new Scanner (System.in);
	
 		int numero1= pedirNumero(sc, "Introduce un número entre los límites establecidos", 5, 10);
 		
 		System.out.println("Número ingresado: " + numero1);
    sc.close();
 	}

 	public static int pedirNumero(Scanner sc, String texto, int limiteInferiorInclusivo, int limiteSuperiorExclusivo)
 	{
 		if(limiteInferiorInclusivo>= limiteSuperiorExclusivo || limiteSuperiorExclusivo<= limiteInferiorInclusivo)
 		{
 			System.out.println("Error");
 			return 0;
 		}
 		else
 		{
 			System.out.println(texto);
 			int numero=sc.nextInt();
 			
 			while (!(numero>=limiteInferiorInclusivo) || !(numero< limiteSuperiorExclusivo))
 			{
 				System.out.printf("El número introducido no está entre %d (incluido) y %d (excluido)\n", limiteInferiorInclusivo, limiteSuperiorExclusivo);
 				System.out.println(texto);
 				numero=sc.nextInt();
 			}
 			return numero;
 		}
 	}
 	
}
