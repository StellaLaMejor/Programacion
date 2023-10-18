package ejercicios31_35;

public class Ejercicio04_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó
		 * 10 €, el segundo 20 €, el tercero 40 € y así sucesivamente (cada mes, el
		 * doble que el mes anterior). Realizar un algoritmo para determinar cuánto debe
		 * pagar mensualmente y el total de lo que pagará después de los 20 meses.
		 */
		
		int meses= 1;
		int dinero= 10;
		
		for(;meses<=20;meses++)
		{
			System.out.printf("El mes %d pagará: %d€\n",meses, dinero);
			dinero= dinero*2;
		}
		
		System.out.println("\nEn total pagará: "+ dinero+"€");
		
	}

}
