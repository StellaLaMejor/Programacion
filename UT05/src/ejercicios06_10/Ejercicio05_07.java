package ejercicios06_10;

import java.util.Random;

public class Ejercicio05_07 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 99 y
		 * los almacene en un array. Luego mostrará los números primos que hay en el
		 * array, junto a la posición que ocupan en el mismo. Utiliza, al menos, un
		 * método estático, que crearás dentro de la clase del programa principal, para
		 * determinar si un número es primo o no. Puedes usar también un método para
		 * llenar el array con números aleatorios.
		 */

		Random rdm = new Random();
		
		int [] numerosRandom= new int[20];
		int a ;
		for (int i = 0; i < numerosRandom.length; i++) 
		{
			numerosRandom[i]=rdm.nextInt(100);
			System.out.println("El número "+ numerosRandom[i]+ esPrimo(numerosRandom[i]));
		}
	}
	
	private static String esPrimo (int numero)
	{
		boolean primo= false;
		int noPrimo=0;
		int siPrimo=0;
		
		for (int i = 0; i < numero; i++) 
		{
			double raiz= Math.sqrt(numero);
			
			if(numero % 2 == 0 || numero % raiz == 0 ||numero <=1)
			{
				primo=false;
				noPrimo++;
			}
			else
			{
				primo= true;
				siPrimo++;
			}
		}
		
		if(primo==true)
		{
			String sSiPrimo= String.valueOf(siPrimo);
			return " el número es primo y está en la posición: "+sSiPrimo;
		}
		else
		{
			String nNoPrimo= String.valueOf(noPrimo);
			return " el número no es primo y está en la posición: "+ nNoPrimo;
		}
	}

}
