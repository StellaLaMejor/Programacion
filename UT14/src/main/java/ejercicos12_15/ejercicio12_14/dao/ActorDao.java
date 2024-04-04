package ejercicos12_15.ejercicio12_14.dao;

import ejercicos12_15.ejercicio12_14.entities.Actor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActorDao {

    private final String connectionString;
    private final String username;
    private final String password;
    private static final String SQL_QUERY = "select actor_id,first_name, last_name from actor";

    public ActorDao(String connectionString, String username, String password) {
        this.connectionString = connectionString;
        this.username = username;
        this.password = password;
    }

    public List<Actor> getAll() throws SQLException {

        List<Actor> actores = new ArrayList<Actor>();
        try (Connection connection = DriverManager.getConnection(connectionString, username, password)) {
            try (PreparedStatement ps = connection.prepareStatement(SQL_QUERY)) {
                try (ResultSet resultSet = ps.executeQuery()) {
                    while (resultSet.next()) {
                        int actorId = resultSet.getInt("actor_id");
                        String firstName = resultSet.getString("first_name");
                        String lastName = resultSet.getString("last_name");
                        actores.add(new Actor(actorId, firstName, lastName));

                    }
                }
            }
        }
        return actores;
    }

}
