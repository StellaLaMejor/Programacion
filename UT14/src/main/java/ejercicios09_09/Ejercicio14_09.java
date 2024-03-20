package ejercicios09_09;

import java.util.Scanner;

public class Ejercicio14_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre de la nueva ciudad: ");
        String ciudadNueva= sc.nextLine();

        if(!ciudadExiste(ciudadNueva)){
            System.out.print("Introduce el nombre del país: ");
            String nombrePais= sc.nextLine();

            if(paisExiste(nombrePais)){
                System.out.printf("El país %s ya existe así que se utilizará el país existente.\n", nombrePais);
            }else{
                //se crean ambos valores
            }
        }else{
            if(!paisExiste(nombrePais)){
                //se crean sólo el país porque la ciudad ya existe;
            }
        }

    }
}
