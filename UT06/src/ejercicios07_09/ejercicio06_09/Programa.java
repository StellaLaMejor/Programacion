package ejercicios07_09.ejercicio06_09;

public class Programa {

	public static void main(String[] args) {
		
		CuentaBancaria cuenta = new CuentaBancaria("A45838547983", "Stella", "Calderón", 3.54, false);

		System.out.println(cuenta);
		System.out.println();
		
		cuenta.reembolsar(150);
		System.out.println(cuenta);
		System.out.println(cuenta.estaEnNumerosRojos());
		System.out.println();

		cuenta.ingresar(2);
		cuenta.estaEnNumerosRojos();
		System.out.println(cuenta);
		System.out.println(cuenta.estaEnNumerosRojos());
		

	}

}
