package ejercicos12_15.ejercicio12_14.dao;

import ejercicos12_15.ejercicio12_14.entities.ActorInFilm;
import ejercicos12_15.ejercicio12_14.entities.Film;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActorInFilmDao {

    private final String connectionString;
    private final String username;
    private final String password;
    private static final String SQL_QUERY = "select film_id , actor_id from film_actor";

    public ActorInFilmDao(String connectionString, String username, String password) {
        this.connectionString = connectionString;
        this.username = username;
        this.password = password;
    }

    public List<ActorInFilm> getAll() throws SQLException {

        List<ActorInFilm> actoresEnPelis = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(connectionString, username, password);
             PreparedStatement ps = connection.prepareStatement(SQL_QUERY);
             ResultSet resultSet = ps.executeQuery()) {

                while (resultSet.next()) {
                    int filmId = resultSet.getInt("film_id");
                    int actorId = resultSet.getInt("actor_id");


                    actoresEnPelis.add(new ActorInFilm(filmId, actorId));

                }


        }
        return actoresEnPelis;
    }

}
