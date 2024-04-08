package ejercicos12_15.ejercicio12_15.dao;

import ejercicos12_15.ejercicio12_15.entities.Film;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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

    public Map<Integer,Film> getAll() throws SQLException {

        Map<Integer, Film> filmMap= new TreeMap<>();
        try(Connection connection= DriverManager.getConnection(connectionString, username,password);
            PreparedStatement ps = connection.prepareStatement(SQL_QUERY);
            ResultSet resultSet= ps.getResultSet()){

            while (resultSet.next()) {
                int idFilm = resultSet.getInt("film_id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                int relaseYear = resultSet.getInt("release_year");
                int length = resultSet.getInt("length");
                String rating = resultSet.getString("rating");

                Film film = new Film(idFilm,title,description,relaseYear,length,rating);
                filmMap.put(idFilm, film);
            }
        }
        return filmMap;
    }

}
