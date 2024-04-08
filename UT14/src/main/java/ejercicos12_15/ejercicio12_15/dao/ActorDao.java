package ejercicos12_15.ejercicio12_15.dao;

import ejercicos12_15.ejercicio12_15.entities.Actor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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

    public Map<Integer, Actor> getAll() throws SQLException {

        Map<Integer, Actor> actorMap= new TreeMap<>();
        try(Connection connection= DriverManager.getConnection(connectionString, username,password);
            PreparedStatement ps = connection.prepareStatement(SQL_QUERY);
            ResultSet resultSet= ps.getResultSet()){

            while ((resultSet.next())){

                int idActor = resultSet.getInt("actor_id");
                String firstName= resultSet.getString("first_name");
                String lastName= resultSet.getString("last_name");

                Actor actor= new Actor(idActor, firstName, lastName);
                actorMap.put(idActor,actor);
            }
            return actorMap;
        }
    }

}
