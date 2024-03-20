package ejercicios08_08;

import java.sql.*;
import java.util.Scanner;

public class Ejercicio14_08 {

//    este deberías hacerlo tú solita también

    public static final String CADENA_CONEXION = "jdbc:mariadb://localhost/sakila";
    public static final String USUARIO =  "sakilauser";
    public static final String PWD = "pwdsakilauser";
    private static final String QUERY ="SELECT customer_id FROM customer WHERE customer_id = ?";

    private static final String QUERY_UPDATE_EMAIL = " UPDATE customer set email = ? WHERE customer_id = ? ";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Dime el ID del cliente: ");
        int idCliente = Integer.parseInt(sc.nextLine());
        System.out.println(clienteExiste(idCliente));

        if(!clienteExiste(idCliente)) {
            System.out.printf("No se ha encontrado un cliente con el id %d\n", idCliente);
        }
        else {
            System.out.print("Introduce el nuevo correo electrónico: ");
            String nuevoMail = sc.nextLine();

            if(!modificarCorreoCliente (idCliente, nuevoMail)){
                System.out.println("Cliente no se ha modificado");
            }
            else {
                System.out.println("Cliente Modificado con éxito");
            }

        }


    }

    private static boolean modificarCorreoCliente(int idCliente, String nuevoMail) {
        try(Connection connection = DriverManager.getConnection(CADENA_CONEXION, USUARIO, PWD)){
            try(PreparedStatement ps = connection.prepareStatement(QUERY)){
                ps.setInt(2,idCliente);
                ps.setString(1, nuevoMail);

                return ps.executeUpdate() >0;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean clienteExiste (int idCliente){
        try(Connection connection = DriverManager.getConnection(CADENA_CONEXION, USUARIO, PWD)){
            try(PreparedStatement ps = connection.prepareStatement(QUERY)){
                ps.setInt(1,idCliente);
                try(ResultSet resultSet = ps.executeQuery()){
                    return  resultSet.isBeforeFirst();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
