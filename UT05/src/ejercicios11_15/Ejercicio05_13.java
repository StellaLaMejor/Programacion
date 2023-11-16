package ejercicios11_15;

import java.util.Iterator;

public class Ejercicio05_13 {

	private static final int CANTIDAD_NUMEROS=10000;
	private static final int NUMERO_MAX=99;
	private static final int NUMERO_MIN=0;
	
	public static void main(String[] args) {
	/*Crea un programa que sirva para comprobar si los números generados con Math.random siguen una distribución 
	 * uniforme, es decir, que, si generamos muchos números, todos los números se generar más o menos las mismas veces. Para ello, vamos a:
	 * 
	•	Generar un número importante de números aleatorios, entre 0 y 99. Podemos empezar con 10000. 
		Usa una constante para este número, así podremos cambiarlo fácilmente, para probar con más o con menos.
	•	Contar cuantas veces aparece cada uno de los números. 
	•	Obtener qué número ha aparecido más veces.
	•	Obtener qué número ha aparecido menos veces.
	
	Para contar las apariciones usa un array de enteros de 100 posiciones, inicializado a cero (todas sus posiciones tienen valor cero). 
	Cada vez que se genera un número incrementamos la posición correspondiente del array en uno, para contar cuantas veces ha aparecido ese 
	número. Así, en la posición 0 tendremos cuantas veces ha aparecido el cero, en la uno, cuantas veces el uno, y así sucesivamente.
	Una vez generados y contabilizados, vamos a mostrar los valores del array, y contar cuántas veces aparece el que más veces aparece, y 
	cuantas el que menos. 
	
	¿Estos valores se separan mucho de lo esperado? Lo esperado sería que cada número apareciera la misma cantidad de veces, que se obtiene 
	al dividir la cantidad total de números generados por la cantidad de números diferentes que generamos.
	Ejemplo: generamos 50000 números aleatorios. Cada número está entre 0 y 99 ambos incluidos. En total tenemos 
	100 números distintos. Si todos aparecen la misma cantidad de veces cada uno debería aparecer 50000/100 veces = 500 veces.
*/
		
//		Sin terminarrr
		vecesRepetidas(CANTIDAD_NUMEROS);
		
	}
	
	private static int [] crearNumerosRandom (int cantidad)
	{
		int [] arrayRandom= new int[cantidad];
		
		for (int i = 0; i < arrayRandom.length; i++) 
		{
			arrayRandom[i]= (int) (Math.random()* (NUMERO_MAX-NUMERO_MIN)+NUMERO_MIN);;
			System.out.print(arrayRandom[i]+ " ");
		}
		System.out.println("\n");
		
		return arrayRandom;
	}
	
	private static int [] vecesRepetidas (int cantidad)
	{
		int [] contador= new int[NUMERO_MAX+1];
		int [] numeroRandom=crearNumerosRandom(cantidad);
	
		for (int i = 0; i < numeroRandom.length; i++) 
		{
			int numAleatorioActual=numeroRandom[i];
			
				contador[numAleatorioActual]++;
			
		}
		for (int i = 0; i < contador.length; i++) 
		{
			System.out.println("El número= "+i+ " aparece= "+ contador[i]);
		}
		return contador;
	}

}
