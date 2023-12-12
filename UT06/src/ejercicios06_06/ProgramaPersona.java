package ejercicios06_06;

import java.util.Scanner;

public class ProgramaPersona {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Persona p1 = new Persona();
		
		System.out.print("Introduce el nombre: ");
		p1.setNombre(sc.nextLine());
		System.out.print("Introduce la edad: ");
		p1.setEdad(sc.nextInt());
		System.out.print("Introduce el sexo (M/H): ");
		p1.setSexo(Sexo.valueOf(sc.next()));
		System.out.print("Introduce el peso: ");
		p1.setPeso(sc.nextDouble());
		System.out.print("Introduce la altura: ");
		p1.setAltura(sc.nextInt());

		
		System.out.print("¿Es mayor de edad? "+ p1.esMayorDeEdad()+ "\n");
		p1.mensajeIMC();
		
		System.out.println(p1.toString());

		System.out.println();
		
		Persona p2 = new Persona ("Stella La Mejor", 20, "877857437A", Sexo.H);
		
		System.out.print("¿Es mayor de edad? "+ p2.esMayorDeEdad()+ "\n");
		p2.mensajeIMC();
		
		System.out.println(p2.toString());
		
		System.out.println();

		
		Persona p3 = new Persona();
		
		p3.setAltura(130);
		p3.setDni("834958L");
		p3.setEdad(13);
		p3.setNombre("Stella Mola");
		p3.setPeso(25);
		p3.setSexo(Sexo.M);

		
		System.out.print("¿Es mayor de edad? "+ p3.esMayorDeEdad()+ "\n");
		p3.mensajeIMC();
		
		System.out.println(p3.toString());


	}

}
