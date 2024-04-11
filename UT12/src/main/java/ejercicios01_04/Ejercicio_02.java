package ejercicios01_04;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_02 {
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
            File[] contenidoDirectorio = directorio.listFiles() ;
//            List<File> listaContenido = Arrays.asList(contenidoDirectorio);

            for (File fichero : contenidoDirectorio){
                System.out.printf("%s - %-40s - %d\n", fichero.isDirectory()?"D":"F", fichero.getName(), fichero.length());
            }
        }
    }

}
