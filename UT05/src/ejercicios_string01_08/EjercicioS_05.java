package ejercicios_string01_08;

public class EjercicioS_05 {

	public static void main(String[] args) {
		/*Realiza un método esPalindromo que
•	Recibe una cadena de caracteres
•	Devuelve true si la cadena es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda.
•	Devuelve false si la cadena es null o si no es un palíndromo.
•	Para hacerlo usa exclusivamente métodos de String, sin arrays.
Ejemplo:
•	esPalindromo(“cactus”) devuelve false
•	esPalindromo(null) devuelve false
•	esPalindromo(“arenera”) devuelve true
•	esPalindromo(“yo hago yoga hoy”) devuelve true
 */
		String cadena = "arenera";
		boolean palidromo = esPalindromo(cadena);
		
		System.out.printf("La cadena '%s' es un palídromo: %s", cadena, palidromo);

	}

	private static boolean esPalindromo (String cadena)
	{
		if (cadena== null)
		{
			return false;
		}
		
		cadena = cadena.toUpperCase();
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
	
}






