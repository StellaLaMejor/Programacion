package ejercicios01_04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Ejercicio_01 {
    private static final Path FICHEROS_DE_PRUEBA_BORRAR = Path.of(System.getProperty("user.home"), "Desktop","ficherosDePruebaBorrar");
    private static final Path FICHEROS_DE_PRUEBA = Path.of(System.getProperty("user.home"), "Desktop","Ficheros de prueba");


    public static void main(String[] args) throws IOException {
//    String stringPathEscritorio = System.getProperty("user.home") + File.separator+ "Desktop";
//        System.out.println(stringPathEscritorio);
//
//        Path pathEscritorio = Path.of(System.getProperty("user.home"), "Desktop");

    File ficherosDePruebaBorrar = new File(FICHEROS_DE_PRUEBA_BORRAR.toString());

    if(!ficherosDePruebaBorrar.mkdir()){
        System.out.println("Existe ficherosDePruebaBorrar y lo voy a borrar :)");
        ficherosDePruebaBorrar.delete();
    }

    File ficheroPrueba = new File (FICHEROS_DE_PRUEBA.toString());

        if(!ficheroPrueba.mkdir()){
            System.out.println("Existe 'Ficheros de prueba' y lo voy a borrar :)");
            ficheroPrueba.delete();
        }

        Path ficheroTxt = Path.of(System.getProperty("user.home"), "Desktop","Ficheros de prueba", "fichero1.txt");

        File ficheroTxtString = new File(ficheroTxt.toString());


        if(!ficheroTxtString.createNewFile()){
            System.out.println("Existe 'fichero1.txt' y lo voy a borrar :)");
            ficheroTxtString.delete();
        }
    }
}
