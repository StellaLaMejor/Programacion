package ejercicios06_07;

import java.sql.*;
import java.util.Scanner;

public class Ejercicio14_07 {
    public static final String CADENA_CONEXION = "jdbc:mariadb://localhost/sakila";
    public static final String USUARIO =  "sakilauser";
    public static final String PASSWORD = "pwdsakilauser";
    private static final String SQL_QUERY_01 ="update language set name=left(name, length(name)-1) where name like '%X'";

    public static void main(String[] args) throws SQLException {

//        Está copiado y sin hacer la parte nueva,hazlo entero

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el ID del cliente: ");
        int idCliente = Integer.parseInt(sc.nextLine());

        // 1.- Obtener conexión. Hay que poner el catch porque lanza checked exception
        try (Connection connection = DriverManager.getConnection(CADENA_CONEXION, USUARIO, PASSWORD)) {
            // 2.- Preparar sentencia SQL. Recibe la query con las interrogaciones
            try (PreparedStatement ps = connection.prepareStatement(SQL_QUERY_01)) {
                // 3.- Parametrizar sentencia (cambiar las ? por valores)
                ps.setInt(1, idCliente);

                // 4.- Obtener resultados
                try (ResultSet datos = ps.executeQuery()) {
                    // 5.- Recorrer resultados
                    // 5.1.- Mirar si hay resultados. next() devuelve true si hay datos.
                    if (!datos.next()) {
                        System.out.printf("No se ha encontrado el cliente con id %d \n", idCliente);
                    } else {
                        // 5.2. - Mostrar datos
                        System.out.printf("Nombre: %s %s\n", datos.getString("first_name"), datos.getString("last_name"));
                    }
                    // 5.1.B Otra forma de ver si hay datos
//                    if (datos.isBeforeFirst()){
//                        // True si hay datos.isBeforeFirst
//                    }
                }
                try (PreparedStatement ps2 = connection.prepareStatement(SQL_QUERY_01)) {
                    ps.setInt(1, idCliente);

//                    if (!resultSet.isBeforeFirst()) {
//                        System.out.println("El cliente no tiene alquileres");
//                    }
                }

            }
        }
    }
}
