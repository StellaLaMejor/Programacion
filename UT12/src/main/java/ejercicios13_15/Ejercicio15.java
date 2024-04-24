package ejercicios13_15;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class Ejercicio15 {
    private static final Scanner sc = new Scanner(System.in);
    private static final Path FICHERO = Path.of("Desktop", "PruebasFicheros", "Ejercicio12_14", "datosbeca.bin");
    private static final Double BASE_FIJA_BECA = 1500.0;

    public static void main(String[] args)  {
//sin terminar

        try (DataInputStream dis = new DataInputStream(new FileInputStream(FICHERO.toFile()))) {

            while (true){
                String nombreApellidos= dis.readUTF();
                int edad= dis.readByte();
                System.out.printf("%d\n",edad);
                int suspensos = dis.readByte();
                System.out.printf("%d\n",suspensos);
            }
           // double becaDelAlumno = BASE_FIJA_BECA;

//            if (ingresosAnuales <= 12000)
//                becaDelAlumno += 500;
//            if (edad < 23)
//                becaDelAlumno += 200;
//
//            if (suspensos == 0)
//                becaDelAlumno += 500;
//            if (suspensos == 1)
//                becaDelAlumno += 200;
//
//            if (!residenciaBool)
//                becaDelAlumno += 1000;
//
//

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {

        }


    }

}
