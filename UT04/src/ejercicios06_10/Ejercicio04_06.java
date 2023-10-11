package ejercicios06_10;

import java.util.Scanner;

public class Ejercicio04_06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);

System.out.print("Introduce una letra mayúscula: ");
		String cadena= sc.nextLine();
//Comprobar la longitud de la cadena (tine que ser 1)
		if (cadena.length() != 1) {
			System.out.printf("Lo que has escrito tiene %d caracteres.\nEscribe sólo una letra en mayúscula.", cadena.length());
		} else {
			char primeraLetra= cadena.charAt(0);
			if (Character.isUpperCase(primeraLetra)) {
//Character.isUpperCase lo que hace es comprobar si la letra que 
//hemos convertido en char antes, es mayúscula o no
				System.out.println("Esta letra mayúscula es correcta");				
			} else {
				System.out.println("Esta letra mayúscula es no es correcta");
			}
			
			
		}
			
			
		
	}

}
