package ejercicos12_15.ejercicio12_15;

import ejercicos12_15.ejercicio12_15.dao.FilmDao;
import ejercicos12_15.ejercicio12_15.dao.ActorDao;
import ejercicos12_15.ejercicio12_15.dao.ActorInFilmDao;
import ejercicos12_15.ejercicio12_15.entities.Actor;
import ejercicos12_15.ejercicio12_15.entities.ActorInFilm;
import ejercicos12_15.ejercicio12_15.entities.Film;

import java.sql.SQLException;
import java.util.*;

public class Programa {
    private static final String CONNECTION_STRING = "jdbc:mariadb://localhost/sakila";
    private static final String USR = "sakilauser";
    private static final String PWD = "pwdsakilauser";

    private static final String SQL_QUERY="";

    public static void main(String[] args) throws SQLException {
        ActorDao actorDao = new ActorDao(CONNECTION_STRING, USR, PWD);
        ActorInFilmDao actorInFilmDao = new ActorInFilmDao(CONNECTION_STRING, USR, PWD);
        FilmDao filmDao = new FilmDao(CONNECTION_STRING, USR, PWD);


        List<ActorInFilm> actoresInFilms = actorInFilmDao.getAll();
        List<Film> films = filmDao.getAll();


        for (Actor actor : actores) {
            System.out.printf("%s, %s (%d)\n", actor.getFirstName(), actor.getLastName(), actor.getActorId());
        }

       for (ActorInFilm actorInFilm : actoresInFilms) {
            System.out.printf("ID PELÍCULA = %d | ID ACTOR = %d\n", actorInFilm.getFilmId(), actorInFilm.getActorId());
       }



    }
    private static Map<Film, Set<Actor>> createFilmActorReport(List<Film> films, List<Actor> actors, List<ActorInFilm> actorsInFilms) {
        Map<Film, Set<Actor>> mapa= new HashMap<>();

        for(Film film: films) {
            Set<Actor> actorSet = createActorsSet(film.getFilmId(), actors, actorsInFilms);
            mapa.put(film, null);
        }

        return mapa;
//        Cosas de iterators ahora mismo no necesarias. Sólo para borrar y actualizar.
//        Iterator iterator= mapa.entrySet().iterator();
//        while (films.iterator().hasNext()) {
//            Object next =  films.iterator().next();
//        }
    }
    private static Set<Actor> createActorsSet(int filmId, List<Actor> actors, List<ActorInFilm> actorInFilms) {
        Set<Actor> actorSet = new TreeSet<>(Comparator.comparing(Actor::getFirstName).thenComparing(Actor::getLastName));
        for(ActorInFilm actorInFilm: actorInFilms){
            if(actorInFilm.getFilmId() == filmId){
                actorSet.add(findActor(actorInFilm.getActorId(), actors));
            }
        }
      return actorSet;
    }

    private static Actor findActor(int actorId, List<Actor> actors) {
        int position = actors.indexOf(new Actor(actorId));
        if(position>=0)
            return actors.get(position);

        throw new RuntimeException("No se ha encontrado el actor con el id: " + actorId);
    }
}