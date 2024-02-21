package ejercicios01_02.ejercicio08_02;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import net.datafaker.Faker;

public class Programa {

	private static final int NUMERO_ALUMNOS = 2;

	public static void main(String[] args) {
		
		Faker fake = new Faker(new Locale("es"));
		ArrayList<Alumno> alumnos = new ArrayList<>();
		
		for (int i = 0; i < NUMERO_ALUMNOS; i++) {
			alumnos.add(new Alumno(String.valueOf(i+2), fake.name().firstName(), fake.name().lastName(), "Grado superior" , fake.random().nextInt(1,2), fake.date().birthdayLocalDate()));
		}
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		System.out.println("-".repeat(100));
		Alumno alumno1= new Alumno (String.valueOf(1), fake.name().firstName(), fake.name().lastName(), "Grado superior" , fake.random().nextInt(1,3), fake.date().birthdayLocalDate());
	
		if(!alumnos.contains(alumno1))
		{
			alumnos.add(alumno1);
		}
		else {
			System.out.println("El alumno no se puede añadir porque ya existe.");
		}

		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		
		System.out.println("-".repeat(100));
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("indica el NIF del alumno que quieres eliminar: ");
		String respuesta= sc.nextLine();
		
		if(alumnos.contains(new Alumno(respuesta))) {
			alumnos.remove(new Alumno(respuesta));
		}
		else {
			System.out.println("El alumno no existe.");
		}
		
		System.out.println("-".repeat(100));
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		
	}

}
