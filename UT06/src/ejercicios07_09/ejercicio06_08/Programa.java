package ejercicios07_09.ejercicio06_08;

public class Programa {

	public static void main(String[] args) {
		
		CuentaBancaria cuenta = new CuentaBancaria("A45838547983", "Stella", "Calderón", 3.54);

		System.out.println(cuenta);
		System.out.println();
		
		cuenta.reembolsar(150);
		System.out.println(cuenta);
		System.out.println(cuenta.consultarCuenta());
		System.out.println();

		cuenta.ingresar(1000);
		cuenta.consultarCuenta();
		System.out.println(cuenta);
		System.out.println(cuenta.consultarCuenta());
		

	}

}
