package ejercicios_repasacion.ejercicios05_09;

import java.io.*;
import java.nio.file.Path;

public class Ejercicio08 {
    private static final Path FICHERO_PARRAFO_F1 = Path.of("Ficheros", "FicherosRepasacion", "Ejercicios05_09", "Ejercicio07", "f1.txt");
    private static final Path FICHERO_PARRAFO_F2 = Path.of("Ficheros", "FicherosRepasacion", "Ejercicios05_09", "Ejercicio07", "f2.txt");
    private static final Path FICHERO_PARRAFO_F3 = Path.of("Ficheros", "FicherosRepasacion", "Ejercicios05_09", "Ejercicio08", "f3.txt");

    public static void main(String[] args) throws IOException {

        if (!FICHERO_PARRAFO_F3.toFile().exists())
            FICHERO_PARRAFO_F3.toFile().getParentFile().mkdirs();

        try (BufferedReader readerf1 = new BufferedReader(new FileReader(FICHERO_PARRAFO_F1.toFile()));
             BufferedReader readerf2 = new BufferedReader(new FileReader(FICHERO_PARRAFO_F2.toFile()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(FICHERO_PARRAFO_F3.toFile()))) {

            int f1 = readerf1.read();
            int f2 = readerf2.read();

            while (f1 != -1 && f2 != -1) {
                if (f1 <= f2) {
                    writer.write(f1);
                    f1 = readerf1.read();
                } else {
                    writer.write(f2);
                    f2 = readerf2.read();
                }
                if (f1 == -1) {
                    while ((f2 = readerf2.read()) != -1) {
                        writer.write(f2);
                    }
                }
                if (f2 == -1) {
                    while ((f1 = readerf1.read()) != -1) {
                        writer.write(f1);
                    }
                }
            }


        }


    }

}
