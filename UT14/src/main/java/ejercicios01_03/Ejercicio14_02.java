package ejercicios01_03;

import java.sql.*;

public class Ejercicio14_02 {
    public static final String CADENA_CONEXION = "jdbc:mariadb://localhost/sakila";
    public static final String USUARIO =  "sakilauser";
    public static final String PASSWORD = "pwdsakilauser";
    private static final String SQL_QUERY_01 = """
select
    title, release_year,l.name as language, f.name as original_language, rating, description
from film
    inner join sakila.language l on film.language_id = l.language_id
    left join sakila.language f on film.original_language_id = f.language_id
order by title asc;""";


    public static void main(String[] args) throws SQLException {

        try(Connection connection = DriverManager.getConnection(CADENA_CONEXION, USUARIO, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery(SQL_QUERY_01)) {

            while(resultado.next()){
                String title = resultado.getString("title");
                int release_year = resultado.getInt("release_year");
                String language = resultado.getString("language");
                String original_language = resultado.getString("original_language");
                String  rating = resultado.getString("rating");
                String description = resultado.getString("description");

                if(original_language==null){
                    original_language= "Desconocido";
                }

                System.out.printf("%s - %d - %s - %s - %s\n%s\n", title, release_year,language,original_language,rating, description);
                System.out.println(("-").repeat(100));
            }


        }

    }
}
