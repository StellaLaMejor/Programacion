package ejercicios10_10;

import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class MediaUtilities {

    private static Faker faker = new Faker();
    private static int currentId= 1;
    private MediaUtilities(){

    }
    public static Media newRandomMedia(){
        return new Media(currentId++, "Título de la película", faker.name().fullName(), faker.company().name(), faker.date().birthdayLocalDate(),TipoMedio.values()[faker.random().nextInt(TipoMedio.values().length)]);
    }
    public static List<Media> newRandomMedia(int count){
        List<Media> media= new ArrayList<>();
        while(count-- > 0){
            media.add(newRandomMedia());
        }
        return media;
    }
}
