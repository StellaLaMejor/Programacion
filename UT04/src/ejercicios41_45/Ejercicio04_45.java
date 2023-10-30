package ejercicios41_45;

public class Ejercicio04_45 {
	/*
	 * Crea un método “factorial” que reciba un número entero (n) y devuelva su
	 * factorial (n!). El método recibirá un int pero devolverá un long, porque los
	 * factoriales pueden ser números muy grandes. El factorial sólo se puede
	 * calcular para números negativos, y se define como la multiplicación de un
	 * número por todos los que son inferiores a él, excepto el cero. 3! = 3x2x1 = 6
	 * 5! = 5x4x3x2x1 = 120 10! = 10x9x…x2x1 = 3628800 El factorial de cero es 1.
	 */
	
	private static long factorial (int n)
	{
		if (n !=0 && n >0)
		{
			long result = 1;
			for (int i=1; i<=n; i++)
			{
				result= result*i;
			}
			 return result;
		}
		else if (n==0)
		{
			return 1;
		}
		else 
		{
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorial(10));
	}

}
