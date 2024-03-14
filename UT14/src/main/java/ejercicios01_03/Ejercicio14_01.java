package ejercicios01_03;

import java.sql.*;

public class Ejercicio14_01 {
    public static final String CADENA_CONEXION = "jdbc:mariadb://localhost/sakila";
    public static final String USUARIO =  "sakilauser";
    public static final String PASSWORD = "pwdsakilauser";
    private static final String SQL_QUERY_01 = "select title, release_year,language_id, original_language_id, rating, description from film order by title asc";


    public static void main(String[] args) throws SQLException {

        try(Connection connection = DriverManager.getConnection(CADENA_CONEXION, USUARIO, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery(SQL_QUERY_01)) {

            while(resultado.next()){
                String title = resultado.getString("title");
                int release_year = resultado.getInt("release_year");
                int language_id = resultado.getInt("language_id");
                int  original_language_id = resultado.getInt("original_language_id");
                String  rating = resultado.getString("rating");
                String description = resultado.getString("description");

                System.out.printf("%s - %d - %d - %d - %s\n%s\n", title, release_year,language_id,original_language_id,rating, description);
                System.out.println(("-").repeat(100));
            }


        }

    }
}
