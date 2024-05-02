package ejercicios_repasacion.ejercicios01_04;

import java.io.File;
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Indica la ruta donde quieres crear el nuevo fichero: ");
        String rutaUsuario= sc.nextLine();
        File rutaUsuarioFile = new File(rutaUsuario);

        if(!rutaUsuarioFile.exists()){
            System.out.println("La ruta indicada no existe.");
        } else if (rutaUsuarioFile.isFile()) {
            System.out.println("La ruta no es de un directorio, si no de un fichero.");
        } else if (rutaUsuarioFile.isDirectory()) {
            String nombreRuta= rutaUsuarioFile.getName();
            String ficheroOdirectorio= ()
        }

    }
}
