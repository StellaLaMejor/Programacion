package ejercicios01_03;

import java.sql.*;

public class Ejercicio14_03 {
    public static final String USUARIO = "sakilauser";
    public static final String PASSWORD = "pwdsakilauser";
    public static final String SQL_QUERY ="select date(payment_date) as payment_sum_date, SUM(amount) total from payment group by payment_sum_date order by payment_sum_date desc";
    private static final String CADENA_CONEXION = "jdbc:mariadb://localhost/sakila";

    public static void main(String[] args) throws SQLException {

        try(Connection connection = DriverManager.getConnection(CADENA_CONEXION, USUARIO,PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet= statement.executeQuery(SQL_QUERY)) {

            while(resultSet.next()){
                Timestamp fecha = resultSet.getTimestamp("payment_sum_date");
                double importe = resultSet.getDouble("total");

                System.out.printf("%s - %.2f\n", fecha.toLocalDateTime().toLocalDate(), importe);
            }

        }

    }
}
