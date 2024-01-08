package ejercicios_string01_08;

public class EjercicioS_03 {

	public static void main(String[] args) {
		/*Crea un método invertirCadena que:
•	Recibe una cadena como parámetro
•	Devuelve una cadena que es igual que la recibida, pero escrita a la inversa.
•	Para hacerlo, no uses arrays, hazlo sólo con tipos primitivos y Strings.
•	Si la cadena es null, devuelve null.

Ejemplo:
	invertirCadena(“murciélago”) devolvería “ogaléicrum”.
*/

		System.out.println(invertirCadena(null));
	}
	private static String invertirCadena (String cadena)
	{
		if (cadena== null)
		{
			return "null";
		}
		String cadenaAlReves= "";
		for (int i = cadena.length()-1; i >= 0; i--) 
		{
			cadenaAlReves= cadenaAlReves + String.valueOf(cadena.charAt(i));
		}
		
		return cadenaAlReves;
	}

}
