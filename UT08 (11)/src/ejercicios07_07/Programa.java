package ejercicios07_07;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import ejercicios04_05.ejercicio11_04.Directivo;
import ejercicios04_05.ejercicio11_04.Empleado;
import ejercicios04_05.ejercicio11_04.Oficial;
import ejercicios04_05.ejercicio11_04.Operario;
import ejercicios04_05.ejercicio11_04.Tecnico;
import net.datafaker.Faker;

public class Programa {
	
	preguntar al profe por qué se me meten los oficiales en los operarios

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Faker fake = new Faker(new Locale("es"));
		

		System.out.print("Cuántos empleados quieres crear? ");
		int numeroEmpleados= Integer.parseInt(sc.nextLine());
		
		Empleado [] empleados = new Empleado [numeroEmpleados];
		
		 for (int i = 0; i < numeroEmpleados; i++) {
	            String nombre = fake.name().firstName();
	            empleados[i] = crearEmpleadoAleatorio(nombre);
		 }
		
		for (Empleado empleado : empleados) {

			System.out.println(empleado.toString());
		}
		System.out.println();

		System.out.println("DIRECTIVOS: ");
		for (Empleado empleado : empleados) {
			if (empleado instanceof Directivo)
			{
				System.out.println(empleado.toString());
			}
		}
		System.out.println();

		System.out.println("OPERARIOS: ");
		for (Empleado empleado : empleados) {
			if (empleado instanceof Operario)
			{
				System.out.println(empleado.toString());
			}
		}
		System.out.println();

		System.out.println("OFICIAL: ");
		for (Empleado empleado : empleados) {
			if (empleado instanceof Oficial )
			{
				System.out.println(empleado.toString());
			}
		}
		System.out.println();
		System.out.println("TÉCNICO: ");
		for (Empleado empleado : empleados) {
			if (empleado instanceof Tecnico)
			{
				System.out.println(empleado.toString());
			}
		}
		
		
	}
	
	private static Empleado crearEmpleadoAleatorio(String nombre)
	{
		Faker fake = new Faker(new Locale("es"));
		Random rdm = new Random();
        int numeroRdm= rdm.nextInt(1,6);
        
		Empleado empleadoNuevo= new Empleado();
		
		switch (numeroRdm) {
		case 1:
			empleadoNuevo =new Empleado(nombre);
			break;
		case 2:
			empleadoNuevo = new Directivo(nombre);
			break;
		case 3:
			empleadoNuevo = new Oficial(nombre);
			break;
		case 4:
			empleadoNuevo = new Operario(nombre);
			break;
		case 5:
			empleadoNuevo = new Tecnico(nombre);
			break;

		default:
			break;
			
		}
		
		return empleadoNuevo;
	}
	
}
