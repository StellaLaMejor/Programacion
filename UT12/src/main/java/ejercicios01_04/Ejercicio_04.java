package ejercicios01_04;

import java.io.File;
import java.util.Scanner;

public class Ejercicio_04 {
    private static Scanner sc = new Scanner((System.in));

    public static void main(String[] args) {
        System.out.print("Introduce la ruta del disco del directorio: ");
        String rutaDirectorio=sc.nextLine();

        File directorio = new File(rutaDirectorio);

        if(!directorio.exists()){
            System.out.println("No existe el directorio");
        }
        else if (!directorio.isDirectory()) {
            System.out.println("La ruta especificada corresponde a un archivo, no a un directorio.");
        } else {

//            String[] nombresContenido = directorio.list();
//            List<File> listaContenido = Arrays.asList(contenidoDirectorio);
            mostrarDirectorio(directorio,0);

        }
    }

    private static void mostrarDirectorio ( File directorio, int nivel){
        File[] contenidoDirectorio = directorio.listFiles() ;
        System.out.print("\t".repeat(nivel));

//        •	Tamaño total de la partición / disco en la que se encuentra el home del usuario.
//        •	Tamaño disponible en la partición.
//        •	Tamaño disponible (usable) en la partición.


        for (File ficheroOdirectorio : contenidoDirectorio){

            System.out.printf("%s - %-40s - %d\n", ficheroOdirectorio.isDirectory()?"D":"F",
                     ficheroOdirectorio.getName(), ficheroOdirectorio.length());

            if(ficheroOdirectorio.isDirectory()){
                mostrarDirectorio(ficheroOdirectorio, nivel+1 );
            }

        }
    }

}
