package ejercicios16_18.ejercicio16;

import net.datafaker.Faker;

import java.io.*;
import java.nio.file.Path;

public class Ejecicio16 {
    private static final Path FICHERO = Path.of("Desktop", "PruebasFicheros", "Ejercicio12_16", "ObjetoAlumno");

    public static void main(String[] args) {
//        Faltan cosas, hay cosas mal y de todo, no sé míralo

        Faker fake = new Faker();

        Alumno alumno1 = new Alumno(fake.idNumber().invalid(), fake.name().firstName(),
                fake.name().lastName() + " " + fake.name().lastName(), fake.date().birthdayLocalDate(15, 60));

        if (!FICHERO.toFile().exists())
            FICHERO.toFile().getParentFile().mkdirs();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHERO.toFile()))) {

            oos.writeObject(alumno1);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static void aniadirAlumnoCopiado(Alumno alumno, Path fichero) throws FileNotFoundException {
        File ficheroAlumnos =fichero.toFile();

        try {
            File nuevoFicheroAlumnos = File.createTempFile("alumnos", null, ficheroAlumnos.getParentFile());
        } catch (IOException e) {
            throw new RuntimeException("No se ha podido crear el fichero temporal" , e);
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(ficheroAlumnos)))) {
            copiarALumnosExistentes(ficheroAlumnos,oos);
            oos.writeObject(alumno);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static void copiarALumnosExistentes(File ficheroAlumnos, ObjectOutputStream oos) {
        if(ficheroAlumnos.exists()&& ficheroAlumnos.isFile()){

            try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(ficheroAlumnos)))) {

                while (true){
                    Alumno alumno = (Alumno) ois.readObject();
                  oos.writeObject(alumno );
                }
            } catch (IOException e) {
                throw new RuntimeException("Error entrada/salida", e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void mostrarAlumnos (Path ficheroPath)  {
        File ficheroAlumnos = ficheroPath.toFile();

        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(ficheroAlumnos)))) {
            boolean esFinFichero= false;
            while (!esFinFichero){
                Alumno alumno = (Alumno) ois.readObject();
                System.out.println(alumno);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error entrada/salida", e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
