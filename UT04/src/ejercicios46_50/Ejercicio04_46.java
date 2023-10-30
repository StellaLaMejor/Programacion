package ejercicios46_50;

public class Ejercicio04_46 {
	/*
	 * Crea un método que devuelva el número de cifras que tiene un número entero
	 * positivo, teniendo en cuenta los siguientes requisitos: • El método recibe un
	 * int y devuelve también un int. • El método tiene que controlar si el número
	 * es positivo. Si no lo es devolverá cero. • Para calcular el número de cifras
	 * tiene que, obligatoriamente, convertir el número recibido a un objeto de tipo
	 * String y usar métodos del objeto String para calcular el número de dígitos.
	 * En el método main, haz un programa que pida un número al usuario y, usando
	 * este método muestre el número de dígitos, o un mensaje de error si el número
	 * es negativo. Ojo, no se puede hacer comparación del número pedido con cero en
	 * main, tenemos que evaluar lo que devuelve el método creado para controlar el
	 * posible error.
	 */
	
	private static int numeroCifras (int numero)
	{
		String numeroSt= "";
		numeroSt= String.valueOf(numero);
		
		return numeroSt.length();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("El número insertado tiene "+ numeroCifras(5464654)+ " cifras.");
	}

}
