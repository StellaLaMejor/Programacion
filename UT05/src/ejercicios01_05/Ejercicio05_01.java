package ejercicios01_05;

public class Ejercicio05_01 {

	public static void main(String[] args) {
	/*Declara un array de números enteros. 
Créalo usando la palabra reservada new, de forma que tenga un tamaño de 5 posiciones.
Llena el array (las 5 posiciones) con números. Elige los números que quieras.
Muestra el valor de la tercera y cuarta posición del array. Recuerda que para acceder a la primera posición del array se accede a la posición 0.
*/

		int array[]= new int[5];
		
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		
		System.out.println(array[3]);
		System.out.println(array[4]);
		
	}

}
