package ejercicios10_10;

import java.io.*;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaPrincipal {
//    Está todo mal xdddd
    private static final Path FICHERO_MEDIA= Path.of("Desktop","PruebasFicheros",  "Ejercicio12_10", "FicheroMedia.txt");
    private static final Path FICHERO_INFORME= Path.of("Desktop","PruebasFicheros",  "Ejercicio12_10", "FicheroMediaInforme.txt");

    private static final int CANTIDAD_MEDIA = 10;

    public static void main(String[] args) throws FileNotFoundException {

//        Media media = MediaUtilities();

        List<Media> mediaList= leerMediaDeFichero (FICHERO_MEDIA);

        if (!FICHERO_MEDIA.toFile().exists())
            FICHERO_MEDIA.toFile().getParentFile().mkdirs();

        for (int i = 0; i < CANTIDAD_MEDIA; i++) {

        }

//        System.out.println( newRandomMedia(5));

    }

    private static List<Media> leerMediaDeFichero(Path fichero) throws FileNotFoundException {
        List<Media> media = new ArrayList<>();
        try (Scanner sc = new Scanner(fichero.toFile())) {
            sc.useDelimiter("\\||\\n");
            sc.useLocale(Locale.US);
            while (sc.hasNext()){
                int id= sc.nextInt();
                String title = sc.next();
                String actor = sc.next();
                String productora = sc.next();
                String fecha = sc.next();
                String tipo = sc.next();
                Media mediaItem = new Media (id, title, actor, productora, LocalDate.parse(fecha), TipoMedio.valueOf(tipo));

            }
        }
        return media;
    }


   private static void escribirListaEnFichero (List<Media> mediaList, Path filePath) throws IOException {

       try (PrintWriter writer = new PrintWriter((new FileWriter(filePath.toFile())))) {
           for (Media media: mediaList){
               writer.printf(Locale.US,"%2d %-30s %-15.15s %40.40s %s\n", media.getiD(), media.getTitulo(),
                                                                media.getArtistaPrincipal(), media.getProductora(),
                                                                media.getFechaPublicacion(), media.getTipo());

           }
       }
   }
   private static void generarInforme (List<Media> mediaList, Path filePath){
       filePath.toFile().getParentFile().mkdirs();


   }



}