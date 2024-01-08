package ejercicios03_03;

import java.util.Scanner;

public class ProgramaCoche {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		Coche coche1 = new Coche (120, 22);
		
		
		String respuestaString = "";
		int respuestaFinal= -1;
		
		while (respuestaFinal!=0)
		{
			respuestaString = mostrarOpciones(sc);
			respuestaFinal= comprobarInt(sc, respuestaString);
			
			if (respuestaFinal == 5)
			{
				System.out.println("¿Cuántos km quieres acelerar?");
				String kmAcelerarString= sc.nextLine();
				int kmAcelerar = comprobarNumero(sc, kmAcelerarString);
				coche1.acelerar(kmAcelerar);
				System.out.println(coche1.toString());
			}
			else if (respuestaFinal== 6 )
			{
				System.out.println("¿Cuántos km quieres fenar?");
				String kmFrenarString= sc.nextLine();
				int kmFrenar = comprobarNumero(sc, kmFrenarString);
				coche1.frenar(kmFrenar);
				System.out.println(coche1.toString());
			}
			else if(respuestaFinal==1)
			{
				coche1.arrancar();
				System.out.println(coche1.toString());
			}
			else if(respuestaFinal==2)
			{
				coche1.detener();
				System.out.println(coche1.toString());
			}
			else if (respuestaFinal==3)
			{
				coche1.ponerMarchaAtrás();
				System.out.println(coche1.toString());
			}
			else if (respuestaFinal==4)
			{
				coche1.quitarMarchaAtrás();
				System.out.println(coche1.toString());
			}
		}
		
		coche1.toString();
		
		if (respuestaFinal==0)
		{
			System.out.println("Fin del programa.");
		}

	}

	public static String mostrarOpciones(Scanner sc)
	{
		System.out.println("Elija una de las siguientes opciones:");
		 System.out.println("1 – Arrancar\n"
		            + "2 – Detener\n"
		            + "3 – Poner marcha atrás\n"
		            + "4 – Quitar marcha atrás\n"
		            + "5 – Acelerar\n"
		            + "6 – Frenar \n"
		            + "0 – Fin \n");
		
		String respuesta= sc.nextLine();
		
		return respuesta;
	}
	
	public static int comprobarInt (Scanner sc, String respuesta)
	{
		int respuestaInt =-1;
		do {
			try {
				respuestaInt = Integer.parseInt(respuesta);
			}
			catch(Exception e)
			{
				System.out.println("El número introducido no es correcto.");
				System.out.print("Vuelve a intentarlo: ");
				respuesta= sc.nextLine();
				
			}
		} while (respuestaInt == -1 || respuestaInt < 0 || respuestaInt > 6);
	
		return respuestaInt;
	}
	
	public static int comprobarNumero (Scanner sc, String numero)
	{
		int num=0;
        boolean numeroValido = false;
        
        while (!numeroValido)
        {
			try
			{
				num= Integer.parseInt(numero);
				numeroValido=true;
			}
			catch (Exception e) 
			{
				System.out.println("El número introducido no es un número válido.");
				System.out.println("Vuelve a intentarlo: ");
				numero= sc.nextLine();
			}
        }
        return num;
	}
	
}
