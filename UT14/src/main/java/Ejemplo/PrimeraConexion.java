package Ejemplo;

import com.sun.jna.platform.win32.WinNT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PrimeraConexion {
    private static final String CADENA_CONEXION = "jdbc:mariadb://localhost/sakila";
    private static final String USUARIO = "sakilauser";
    private static final String PASSWORD = "pwdsakilauser";

    public static void main(String[] args) throws SQLException {
        System.out.println("Son las %s y este es el primer programa en ");

        try (Connection connection = DriverManager.getConnection(CADENA_CONEXION, USUARIO, PASSWORD)) {



        }

        System.out.println("Fin del programa");


    }
}
