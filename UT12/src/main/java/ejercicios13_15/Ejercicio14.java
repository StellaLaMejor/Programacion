package ejercicios13_15;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Ejercicio14 {
    private static final Scanner sc = new Scanner(System.in);
    private static final Path FICHERO = Path.of("Desktop", "PruebasFicheros", "Ejercicio12_14", "datosbeca.bin");

    public static void main(String[] args) {
        if (!FICHERO.toFile().exists()) {
            FICHERO.toFile().getParentFile().mkdirs();
        }
        System.out.print("Nombre y apellidos del becario: ");
        String nombreApellidos = sc.nextLine();

        System.out.print("Edad (20-60): ");
        int edad = Integer.parseInt(sc.nextLine());

        System.out.print("Nº suspensos (0-4): ");
        int suspensos = Integer.parseInt(sc.nextLine());

        System.out.print("¿Vive con la familia? ");
        String residencia = sc.nextLine();
        residencia.toLowerCase();

        while (!residencia.equals("si") && !residencia.equals("sí") && !residencia.equals("no")) {
            System.out.println("Eso no es una respuesta válida.");
            System.out.print("Indica si vive o no con la familia: ");
            residencia = sc.nextLine();
            residencia.toLowerCase();
        }
        boolean residenciaBool;
        if (residencia.equals("si") || residencia.equals("sí"))
            residenciaBool = true;
        else {
            residenciaBool = false;
        }
        System.out.printf("Ingresos anuales de la familia: ");
        double ingresosAnuales = Double.parseDouble(sc.nextLine());

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FICHERO.toFile()))) {
            dos.writeUTF(nombreApellidos);
            dos.writeByte(edad);
            dos.writeByte(suspensos);
            dos.writeBoolean(residenciaBool);
            dos.writeDouble(ingresosAnuales);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {

        }



    }

}
