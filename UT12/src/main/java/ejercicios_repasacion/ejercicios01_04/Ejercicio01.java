package ejercicios_repasacion.ejercicios01_04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Ejercicio01 {
    private static Path FICHERO_BORRAR = Path.of("Ficheros", "FicherosRepasacion", "Ejercicios01_04", "Ejercicio01.txt");

    public static void main(String[] args) throws IOException {

        File ficherosDePruebaBorrar = new File(String.valueOf(FICHERO_BORRAR.toFile()));
        if (!ficherosDePruebaBorrar.mkdirs()) {
            ficherosDePruebaBorrar.createNewFile();

        }
       ficherosDePruebaBorrar.delete();

//  así se saca la ruta del escritorio.
        String s = System.getProperty("user.home") + File.separator + "Desktop";
        System.out.println(s);
    }
}
