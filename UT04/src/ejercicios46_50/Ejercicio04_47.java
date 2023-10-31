package ejercicios46_50;

public class Ejercicio04_47 {
	/*
	 * Repite el ejercicio anterior, pero esta vez no uses la clase String en el
	 * método. Usa divisiones enteras para saber cuántas veces puedes dividir un
	 * número por 10.
	 */
	
	private static int numerito (int numeroUsuario)
	{
		int veces=0;
		
		if(numeroUsuario==0)
		{
			return 0;
		}
		while(numeroUsuario>0)
		{
			numeroUsuario= numeroUsuario/10;
			veces++;
		}
		return veces;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(numerito(456));	
	}

}
