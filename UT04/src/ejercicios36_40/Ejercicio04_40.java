package ejercicios36_40;

public class Ejercicio04_40 {
	/*
	 * Realizar un programa que muestre todos los números del 1 al 120, en filas de
	 * 10 números. Algo parecido a esto:
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numeros(1, 120);
	}

	private static void numeros(int numeroinicio, int numerofinal) 
	{
		for (int i = numeroinicio; i <= numerofinal; i++) 
		{
			System.out.print(i+" ");
			
			if (i % 10==0)
			{
				System.out.println();
			}
		}

	}

}
