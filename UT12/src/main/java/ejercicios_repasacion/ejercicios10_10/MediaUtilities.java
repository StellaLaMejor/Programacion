package ejercicios_repasacion.ejercicios10_10;

import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MediaUtilities {

    private static Faker faker = new Faker();
    private static int currentId = 1;

    public static Media newRandomMedia(){
        return new Media(
                currentId++,
                faker.oscarMovie().movieName(),
                faker.name().fullName(),
                faker.company().name(),
                faker.date().past(365*20, 365, TimeUnit.DAYS).toLocalDateTime().toLocalDate(),
                TipoMedio.values()[faker.random().nextInt(TipoMedio.values().length)]
        );
    }
    public static List<Media> newRandomMedia(int count){
        List<Media> listaMedia = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            listaMedia.add(newRandomMedia());
        }
        return listaMedia;
    }
}
