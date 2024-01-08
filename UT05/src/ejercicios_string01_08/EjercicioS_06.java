package ejercicios_string01_08;
import javax.imageio.ImageTypeSpecifier;

public class EjercicioS_06 {

	public static void main(String[] args) {
		/*Realiza un método espejo que:
•	Recibe una cadena de caracteres
•	Devuelve la cadena como si estuviera reflejada en un espejo. Esto es, la misma 
	cadena a la que se añade la misma cadena invertida, pero compartiendo una letra, 
	que será la última de la cadena original y la primera de la cadena invertida que se añade. Ver ejemplos.
•	Si la cadena es null, devuelve null
•	Este método crea palíndromos, y si usamos el método esPalindromo sobre el resultado de este método,
 	siempre devolverá true.
Ejemplos:
•	espejo(“año”) devuelve añoña
•	espejo(“bicicleta”) devuelve “bicicletatelcicib”.
•	esPalindromo(espejo(<cualquier cadena>)) siempre devolverá true, salvo si la cadena es null, en cuyo caso devolverá false.
*/

		String cadena = "año";
		boolean palidromo = esPalindromo(cadena);
		
		System.out.printf("La cadena '%s' es un palídromo: %s", cadena, palidromo);
		
		System.out.println(espejo(cadena));
		
	}
	private static boolean esPalindromo (String cadena)
	{
		if (cadena== null)
		{
			return false;
		}
		
		cadena = cadena.toLowerCase();
		cadena = cadena.replaceAll(" ", "");
		
		String cadenaInvertida= "";
		
		for (int i = cadena.length()-1; i >=0; i--) 
		{
			cadenaInvertida= cadenaInvertida + cadena.charAt(i);
		}

		if (cadena.equals(cadenaInvertida) )
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	private static boolean espejo (String cadena)
	{
		if (cadena== null)
		{
			return false;
		}
		
		cadena = cadena.toLowerCase();
		cadena = cadena.replaceAll(" ", "");
		
		String cadenaInvertida= "";
		
		for (int i = cadena.length()-1; i >=0; i--) 
		{
			cadenaInvertida= cadenaInvertida + cadena.charAt(i);
		}

		if (cadena.equals(cadenaInvertida) )
		{
			System.out.println();
			System.out.println(cadena);
			return true;
		}
		else
		{
			cadena= cadena + cadenaInvertida.substring(1);
			System.out.println();
			System.out.println(cadena);
			return true;
		}
		
	}

}
