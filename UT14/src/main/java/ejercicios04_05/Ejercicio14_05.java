package ejercicios04_05;

import java.sql.*;

public class Ejercicio14_05 {
    public static final String CADENA_CONEXION = "jdbc:mariadb://localhost/sakila";
    public static final String USUARIO =  "sakilauser";
    public static final String PASSWORD = "pwdsakilauser";
    private static final String SQL_QUERY_01 ="update language set name=left(name, length(name)-1) where name like '%X'";

    public static void main(String[] args) throws SQLException {
        try (Connection connection= DriverManager.getConnection(CADENA_CONEXION, USUARIO,PASSWORD);

        Statement statement = connection.createStatement();
        ResultSet resultSet= statement.executeQuery(SQL_QUERY_01)){

            int numFilasAfectadas= statement.executeUpdate(SQL_QUERY_01);


            System.out.printf("Se han modificado %d filas",numFilasAfectadas);

        }
    }
}
