package ejercicos12_15.ejercicio12_14.dao;

import ejercicos12_15.ejercicio12_14.entities.Actor;
import ejercicos12_15.ejercicio12_14.entities.Film;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FilmDao {

    private final String connectionString;
    private final String username;
    private final String password;
    private static final String SQL_QUERY = "select film_id ,title, description, release_year, length, rating from film";

    public FilmDao(String connectionString, String username, String password) {
        this.connectionString = connectionString;
        this.username = username;
        this.password = password;
    }

    public List<Film> getAll() throws SQLException {

        List<Film> peliculas = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(connectionString, username, password);
             PreparedStatement ps = connection.prepareStatement(SQL_QUERY);
             ResultSet resultSet = ps.executeQuery()) {

                while (resultSet.next()) {
                    int filmId = resultSet.getInt("film_id");
                    String title = resultSet.getString("title");
                    String description = resultSet.getString("description");
                    int releaseYear = resultSet.getInt("release_year");
                    int length = resultSet.getInt("length");
                    String rating = resultSet.getString("rating");

                    peliculas.add(new Film(filmId, title, description, releaseYear, length, rating));

                }


        }
        return peliculas;
    }

}
