package ejercicios11_15;

import java.util.Scanner;

public class Ejercicio04_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc= new Scanner (System.in);
		
		System.out.println("Indica la duración de la llamada: ");
		int llamada= sc.nextInt();
		
		System.out.println("¿La llamada fue hecha en Domingo?");
		String domingo = sc.next();
		
		System.out.println("¿La llamada fue hecha por la mañana?");
		String mañana = sc.next();
		
		System.out.println("¿La llamada fue hecha por la tarde?");
		String tarde = sc.next();
		
		double precio = 0;
		
		if (domingo.equalsIgnoreCase("si"))
		{
			precio=llamada*1.03;
		}
		else 
		if (mañana.equalsIgnoreCase("si"))
		{
			precio=llamada*1.15;
		}
		
		else if (tarde.equalsIgnoreCase("si"))
		{
			precio=llamada*1.1;
		}
		else
		{
			System.out.println("El dato es incorrecto");
		}
		
		
		if (llamada <= 5) 
		{
			precio= llamada;
		}
		else if (llamada >5 && llamada <=8)
		{
			precio= 5 + (llamada-5)* 0.8;
		} 
		else if (llamada >8 && llamada <=10)
		{
			precio= 5 + (llamada-5)* 0.8 + (llamada-8)*0.7;
		}
		else if (llamada>10)
		{
			precio=  5 + (llamada-5)* 0.8 + (llamada-8)*0.7 + (llamada - 10)*0.5;
		}
		
		
        System.out.println("El precio de la llamada es: " + precio + "€");

		
		
	}

}
