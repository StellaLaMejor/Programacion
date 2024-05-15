package ejercicios_repasacion.ejercicios01_04;

import java.io.File;
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Indica la ruta donde quieres crear el nuevo fichero: ");
        String rutaUsuario = sc.nextLine();
        File rutaUsuarioFile = new File(rutaUsuario);

        if (!rutaUsuarioFile.exists()) {
            System.out.println("La ruta indicada no existe.");
            return;
        }
        if (!rutaUsuarioFile.isDirectory()) {
            System.out.println("La ruta no es de un directorio, si no de un fichero.");
            return;
        }

            mostrarDirectorios(rutaUsuarioFile,0);

    }

    private static void mostrarDirectorios(File directorio, int nivel) {

        File[] contenidoDirectorio = directorio.listFiles();
        for (File ficheroOdirectorio : contenidoDirectorio){
            System.out.println("\t".repeat(nivel));
            System.out.printf("%10s - %30s - %d\n", ficheroOdirectorio.isDirectory()?"Directorio":"Fichero", ficheroOdirectorio.getName(), ficheroOdirectorio.length());

            if(ficheroOdirectorio.isDirectory())
               mostrarDirectorios(ficheroOdirectorio, nivel+1);
        }



    }
}
