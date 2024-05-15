package ejercicios_repasacion.ejercicios10_10;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    private static final Path FICHERO = Path.of("Ficheros", "FicherosRepasacion", "Ejercicios10_10", "ficheroMedia.txt");
    private static final Path FICHERO_INFORME = Path.of("Ficheros", "FicherosRepasacion", "Ejercicios10_10", "ficheroMediaInforme.txt");


    public static void main(String[] args) throws IOException {

        List<Media> medias = MediaUtilities.newRandomMedia(10);

        escribirListaEnFichero(FICHERO, medias);
        List<Media> mediaLeida = leerFicheroMedia(FICHERO);

        mediaLeida.forEach(System.out::println);
        generarInforme(mediaLeida, FICHERO_INFORME);


    }

    private static void generarInforme(List<Media> mediaLeida, Path ficheroInforme) throws IOException {
        if (!ficheroInforme.toFile().exists())
            ficheroInforme.toFile().getParentFile().mkdirs();

        try (PrintWriter writer = new PrintWriter(new FileWriter(ficheroInforme.toFile()))) {
            Locale locale = new Locale("ES");
            writer.printf(locale, "%2s %-30s %-15.15s %-50.50s %9s %s\n", "ID", "TÍTULO", "ACTOR", "PRODUCTOR", "FECHA", "TIPO");

            for(Media media: mediaLeida){

                writer.printf(locale,"%2s %-30s %-15.15s %-50.50s %9s %s\n",
                        media.getId(),
                        media.getTitulo(),
                        media.getArtistaPrincipal(),
                        media.getProductora(),
                        media.getFechaPublicacion(),
                        media.getTipo());
            }

        }
    }

    private static List<Media> leerFicheroMedia(Path fichero) throws FileNotFoundException {
        List<Media> mediaList = new ArrayList<>();
        try (Scanner sc = new Scanner(fichero.toFile())) {
            sc.useDelimiter("\\||\n");
            sc.useLocale(Locale.US);

            while (sc.hasNext()) {
                int id = sc.nextInt();
                String title = sc.next();
                String actor = sc.next();
                String productora = sc.next();
                String fecha = sc.next();
                String tipo = sc.next();

                Media media = new Media(id, title, actor, productora, LocalDate.parse(fecha), TipoMedio.valueOf(tipo));
                mediaList.add(media);

            }
            return mediaList;
        }

    }

    private static void escribirListaEnFichero(Path fichero, List<Media> medias) throws IOException {

        if (!fichero.toFile().exists())
            fichero.toFile().getParentFile().mkdirs();

        try (PrintWriter writer = new PrintWriter(new FileWriter(FICHERO.toFile()))) {
            for (Media media : medias) {
                writer.printf(Locale.US,"%d|%s|%s|%s|%s|%s\n",
                        media.getId(),
                        media.getTitulo(),
                        media.getArtistaPrincipal(),
                        media.getProductora(),
                        media.getFechaPublicacion(),
                        media.getTipo());
            }
        }


    }
}
