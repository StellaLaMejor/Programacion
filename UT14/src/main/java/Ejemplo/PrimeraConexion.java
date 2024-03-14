package Ejemplo;

import com.sun.jna.platform.win32.WinNT;

import java.sql.*;

public class PrimeraConexion {
    private static final String CADENA_CONEXION = "jdbc:mariadb://localhost/sakila";
    private static final String USUARIO = "sakilauser";
    private static final String PASSWORD = "pwdsakilauser";
    private static final String SQL_QUERY_01 = "select * from country ";

    public static void main(String[] args) throws SQLException {
        System.out.println("Son las %s y este es el primer programa en ");

        try (Connection connection = DriverManager.getConnection(CADENA_CONEXION, USUARIO, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultado = statement.executeQuery(SQL_QUERY_01)) {

            System.out.printf("El tipo dinámico de la conexión es %s\n", connection.getClass().getName());
            System.out.printf("El tipo dinámico de la conexión es %s\n", connection.getClass().getName());
            System.out.printf("El tipo dinámico de la Statement es %s\n", statement.getClass().getName());
            System.out.printf("El tipo dinámico de la ResultSet es %s\n", resultado.getClass().getName());

            int numFila = 1;
            while (resultado.next()) {
                System.out.printf("En registro %d\n", numFila++);
                String countryId = resultado.getString(1);
                String countryName = resultado.getString(2);
                String lastUpdate = resultado.getString(3);
                System.out.printf("%s - %s - %s\n", countryId, countryName, lastUpdate);
            }
        }


        System.out.println("Fin del programa");


    }
}
