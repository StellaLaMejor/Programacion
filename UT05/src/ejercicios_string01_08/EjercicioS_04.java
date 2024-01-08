package ejercicios_string01_08;

public class EjercicioS_04 {

	public static void main(String[] args) {
		/*Crea un método invertirCadena2 que haga lo mismo que el ejercicio 04, pero que internamente:
•	Convierte el parámetro a un array de caracteres
•	Manipula el array de caracteres para invertir el orden de los caracteres
•	Vuelve a convertir el array en cadena (String) antes de devolverlo
*/

		System.out.println(invertirCadena("Hola"));
		
	}
	private static String invertirCadena (String cadena)
	{
		char [] arrayCadena = new char [cadena.length()];
		String cadenaInvertida="";
		
		for (int i = 0; i < cadena.length(); i++) 
		{
			arrayCadena[i]= cadena.charAt(i);
		}
		for (int i = arrayCadena.length -1 ; i >= 0; i--) 
		{
			cadenaInvertida= cadenaInvertida + arrayCadena[i];
		}
		return cadenaInvertida;
	}
}
