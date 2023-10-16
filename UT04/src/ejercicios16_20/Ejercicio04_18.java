package ejercicios16_20;

import java.util.Scanner;

//TE FALTA HACER EL EJERCICIO 15 

public class Ejercicio04_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		
		System.out.println("Introduce un número del 1 al 12 para obtener un mes del año: ");
		int mes = sc.nextInt();
		
		System.out.println("Introduce un año: ");
		int anio = sc.nextInt();

		boolean bisiesto = ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0);
		
		
		if (anio>=0) 
		{
			switch (mes) {
			
			
			case 1:
				System.out.printf("Enero del año %d y tiene 31 días", anio);
				break;
			case 2:
				if (bisiesto==true)
				{
				System.out.printf("Febrero del año %d y tiene 29 días", anio);
				}
				else
				{
				System.out.printf("Febrero del año %d y tiene 28 días", anio);
				}
				break;
			case 3:
				System.out.printf("Marzo del año %d y tiene 31 días", anio);
				break;
			case 4:
				System.out.printf("Abril del año %d y tiene 30 días", anio);
				break;
			case 5:
				System.out.printf("Mayo del año %d y tiene 31 días", anio);
				break;
			case 6:
				System.out.printf("Junio del año %d y tiene 30 días", anio);
				break;
			case 7:
				System.out.printf("Julio del año %d y tiene 31 días", anio);
				break;
			case 8:
				System.out.printf("Agosto del año %d y tiene 31 días", anio);
				break;
			case 9:
				System.out.printf("Septiembre del año %d y tiene 30 días", anio);
				break;
			case 10:
				System.out.printf("Octubre del año %d y tiene 31 días", anio);
				break;
			case 11:
				System.out.printf("Noviembre del año %d y tiene 30 días", anio);
				break;	
			case 12:
				System.out.printf("Diciembre del año %d y tiene 31 días", anio);
				break;	
		
			default:
				System.out.printf("El mes del año no existe.");
				break;
				
				}
			}
		else 
		{ 
			System.out.println("El año es incorrecto");
		}
				
			
		
	}

}
