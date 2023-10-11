package ejercicios01_05;

import java.util.Scanner;

public class Ejercicio04_05 {
	public static final String NOMBRE_USUARIO = "pepe";
	public static final String CONTRASEÑA_USUARIO = "asdasd";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);

	System.out.print("Indique el nombre de usuario: ");
		String a= sc.nextLine();
	System.out.print("Indica la contraseña: ");
		String b= sc.nextLine();
	if (a.equals(NOMBRE_USUARIO) && b.equals(CONTRASEÑA_USUARIO)) {
		System.out.println("Has entrado al sistema");
	} else {
		System.out.println("ERROR");
	}
	
	//Si quiero que ignore las mayúsculas se pone equals.IgnoreCase
	}

}
