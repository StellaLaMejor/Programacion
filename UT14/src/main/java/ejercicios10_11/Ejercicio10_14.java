package ejercicios10_11;

import java.sql.*;
import java.util.Scanner;

public class Ejercicio10_14 {
    public static final String CONNECTION_STRING = "jdbc:mariadb://localhost/sakila";
    public static final String USR ="sakilauser";
    public static final String PWD= "pwdsakilauser";
    public static final String QUERY= "select country_id, country from country where country ='?'";
    private static final String UPDATE_PAIS = "update country set country='?' where country = '?'";
HAY ALGO QUE ESTÁ MAL, ME PONE QUE NO EXISTE NINGÚN PAÍS
    public static void main(String[] args) throws SQLException {

        Scanner sc= new Scanner(System.in);
    try(Connection connection= DriverManager.getConnection(CONNECTION_STRING,USR,PWD)) {
        System.out.print("Introduce el nombre de un país que exista en la BBDD: ");
        String nombrePais = sc.nextLine();

            if (paisExiste(nombrePais, connection)) {

                System.out.println("Introduce el nombre nuevo del país ya existente:");
                String nuevoNombrePais= sc.nextLine();

                cambiarNombrePais(nombrePais, nuevoNombrePais, connection);
            }
            else if(!paisExiste(nombrePais, connection)) {
                System.out.printf("No se ha encontrado el país %s en la BBDD.\n", nombrePais);
                return;
            }

        }
    }

    private static void cambiarNombrePais(String nombrePais, String nuevoNombrePais, Connection connection) throws SQLException {
        try(PreparedStatement ps= connection.prepareStatement(UPDATE_PAIS,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs =ps.executeQuery()){
            ps.setString(1,nuevoNombrePais);
            ps.setString(2,nombrePais);

            rs.updateString("country", nuevoNombrePais);
            rs.updateRow();
        }
    }

    private static boolean paisExiste(String nombrePais, Connection connection) throws SQLException {
        try(PreparedStatement ps= connection.prepareStatement(QUERY);
            ResultSet rs= ps.executeQuery()){
            //Aquí lo que se hace es editar la consulta cambiando el '?' por el nombre del país que se quiere buscar
            ps.setString(1,nombrePais);
            //Aquí se comprueba si la tabla, después de la consulta, está vacía (true si no está vacía)
            return rs.isBeforeFirst();
        }
    }


}
