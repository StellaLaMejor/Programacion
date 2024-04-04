package ejercicios09_09;

import java.sql.*;
import java.util.Scanner;


public class Ejercicio14_09 {
    public static final String CONNECTION_STRING = "jdbc:mariadb://localhost/sakila";
    public static final String USR =  "sakilauser";
    public static final String PWD = "pwdsakilauser";
    private static final String SQL_CHECK_CITY ="select city_id, city from city where city = ?";
    private static final String SQL_CHECK_COUNTRY ="select country_id, country from country where country = ?";
    private static final String DML_CREATE_COUNTRY ="insert into country(country) values(?)";
    private static final String DML_CREATE_CITY ="insert into city(city, city_id) values(?,?)";

  //  faltan cosas

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try(Connection connection = DriverManager.getConnection(CONNECTION_STRING, USR, PWD)){

            System.out.print("Introduce el nombre de la nueva ciudad: ");
            String ciudadNueva= sc.nextLine();

                String nombrePais ="";

                if (!existeCiudad(ciudadNueva,connection)) {
                    System.out.print("Introduce el nombre del país: ");
                    nombrePais = sc.nextLine();

                    if (existePais(nombrePais, connection)) {
                        System.out.printf("El país %s ya existe así que se utilizará el país existente.\n", nombrePais);
                    } else {
                        //se crean ambos valores
                    }
                    int idPais= getIdPais(nombrePais, connection);
                } else {
                    if (!existePais(nombrePais, connection)) {
                        //se crean sólo el país porque la ciudad ya existe;
                    }
                }

        } catch (SQLException e){
            String.format("Error en la conexión.");
        }

    }

    private static int getIdPais(String nombrePais, Connection connection) {
        try (PreparedStatement ps= connection.prepareStatement(SQL_CHECK_COUNTRY)){
            ps.setString(1,nombrePais);
            try(ResultSet resultSet= ps.executeQuery()){
                if(resultSet.isBeforeFirst()){
                    resultSet.next();
                    return resultSet.getInt("country_id");
                }else {
                    throw new RuntimeException("No se ha encontrado el país en la BBDD.");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean existeCiudad (String nombre,Connection connection){
        try(PreparedStatement ps = connection.prepareStatement (SQL_CHECK_CITY)) {
            ps.setString(1,nombre);
            try(ResultSet resultSet = ps.executeQuery()){
                return resultSet.isBeforeFirst();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private static boolean existePais (String nombre,Connection connection){
        try(PreparedStatement ps = connection.prepareStatement (SQL_CHECK_COUNTRY)) {
            ps.setString(1,nombre);
            try(ResultSet resultSet = ps.executeQuery()){
                return resultSet.isBeforeFirst();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void createCity (String ciudadNueva,int idPais, Connection connection){
        try(PreparedStatement ps = connection.prepareStatement(DML_CREATE_CITY)){
            ps.setString(1,ciudadNueva);
            ps.setInt(2,idPais);
            try {

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void createCountry (String nombrePais, Connection connection){
        try(PreparedStatement ps = connection.prepareStatement(DML_CREATE_COUNTRY)){
            ps.setString(1,nombrePais);
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
