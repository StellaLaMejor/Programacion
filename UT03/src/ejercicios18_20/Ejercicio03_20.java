package ejercicios18_20;

public class Ejercicio03_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String cadenaLarga = "la veldadera vuelta, la veldadera vuelta beibi, beibi, tú me etá entiendo lo que te etamos queliendo decil";
int largo= cadenaLarga.length();
int mitad= largo/2;
char a= cadenaLarga.charAt(mitad);
System.out.println(a);
System.out.println(mitad);
System.out.println(cadenaLarga.substring(0, 53));
System.out.println(cadenaLarga.substring(53));	
	}

}
