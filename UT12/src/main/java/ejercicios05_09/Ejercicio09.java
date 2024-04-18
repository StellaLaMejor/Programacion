package ejercicios05_09;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class Ejercicio09 {

    private static final Path FICHERO_ORIGINAL= Path.of("Desktop","PruebasFicheros",  "Ejercicio12_09", "FicheroOriginal.txt");
    private static final Path FICHERO_CIFRADO = Path.of("Desktop","PruebasFicheros",  "Ejercicio12_09", "FicheroCifrado.txt");
    private static final Path FICHERO_DESCIFRADO = Path.of("Desktop","PruebasFicheros",  "Ejercicio12_09", "FicheroDesifrado.txt");
    private static final int LIMITE_INFERIOR= 0x20;
    private static final int LIMITE_SUPERIOR=0x7E;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        if(!(FICHERO_ORIGINAL.toFile().exists())){
            throw new IllegalArgumentException("El fichero original no existe.");
        }

        int claveCifrado=10;
        cifrar(FICHERO_ORIGINAL.toFile(), FICHERO_CIFRADO.toFile(), claveCifrado);


        desCifrar(FICHERO_CIFRADO.toFile(), FICHERO_DESCIFRADO.toFile(), claveCifrado);


    }

    private static void cifrar (File ficheroOriginal, File ficheroCifrado, int claveCifrado) throws IOException {

        if(claveCifrado>(LIMITE_SUPERIOR- LIMITE_INFERIOR)){
            throw new IllegalArgumentException(String.format("La clave de cifrado no puede ser mayor que %d",(LIMITE_SUPERIOR-LIMITE_INFERIOR)));
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(ficheroOriginal));
             BufferedWriter writer = new BufferedWriter((new FileWriter(ficheroCifrado)))) {

            int charOriginal;
            int charCifrado;
            while ((charOriginal= reader.read())!=-1){

                if(charOriginal< LIMITE_INFERIOR || charOriginal> LIMITE_SUPERIOR){
                    writer.write(charOriginal);
                }else{
                    charCifrado = charOriginal+claveCifrado;
                    if(charCifrado>LIMITE_SUPERIOR){
                        charCifrado= (charCifrado%(LIMITE_SUPERIOR+1)) + LIMITE_INFERIOR;
                    }
                    writer.write(charCifrado);
                }

            }
        }
    }

    private static void desCifrar(File ficheroCifrado, File ficheroDescifrado, int claveCifrado)  throws IOException{

        if(claveCifrado>(LIMITE_SUPERIOR- LIMITE_INFERIOR)){
            throw new IllegalArgumentException(String.format("La clave de cifrado no puede ser mayor que %d",(LIMITE_SUPERIOR-LIMITE_INFERIOR)));
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(ficheroCifrado));
             BufferedWriter writer = new BufferedWriter((new FileWriter(ficheroDescifrado)))) {

            int charCifrado;
            int charDescifrado = 0;
            while ((charCifrado= reader.read())!=-1){

                if(charCifrado< LIMITE_INFERIOR || charCifrado> LIMITE_SUPERIOR){
                    writer.write(charCifrado);
                }else{
                    charDescifrado = charCifrado - claveCifrado ;
                    if(charDescifrado<LIMITE_INFERIOR){
                        charDescifrado=LIMITE_SUPERIOR + (charDescifrado-LIMITE_INFERIOR)+1;
                    }
                    writer.write(charDescifrado);
                }

            }
        }
    }
}
