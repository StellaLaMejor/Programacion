package ejercicios01_04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Ejercicio_01 {
    private static final Path FICHEROS_DE_PRUEBA_BORRAR = Path.of("/","C", "Users","Vespertino","Desktop");
    private static String pathEscritorio;

    public static void main(String[] args) throws IOException {
    String stringPathEscritorio = System.getProperty("user.home") + File.separator+ "Desktop";
        System.out.println(stringPathEscritorio);
        
        Path pathEscritorio = Path.of(System.getProperty("user.home"), "Desktop");

    File ficherosDePruebaBorrar = new File(FICHEROS_DE_PRUEBA_BORRAR);
    ficherosDePruebaBorrar.createNewFile();

    if(ficherosDePruebaBorrar.exists()){
        System.out.println("Existe ficherosDePruebaBorrar y lo voy a borrar :)");
        ficherosDePruebaBorrar.delete();
    }

    }
}
