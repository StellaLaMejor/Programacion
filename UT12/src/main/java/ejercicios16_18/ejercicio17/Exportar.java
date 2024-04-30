package ejercicios16_18.ejercicio17;

import java.io.*;
import java.nio.file.Path;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exportar {
    private static final String CONNECTION_STRING = "jdbc:mariadb://localhost/sakila";
    private static final String USR = "sakilauser";
    private static final String PWD = "pwdsakilauser";
    private static final String QUERY = """ 
            SELECT customer_id, 
            store_id, 
            first_name,
            last_name,
            email,
            address_id,
            active,
            create_date,
            last_update FROM  customer WHERE customer_id>? AND customer_id<?""";

    private static final Path FICHERO = Path.of("Desktop", "PruebasFicheros", "Ejercicio12_17", "customers.dat");

    public static void main(String[] args) throws SQLException, IOException {
        List<Customer> customers = leerCustomersBd(20, 40);
        Collections.sort(customers, Comparator.comparing(Customer::getFirstName).thenComparing(Customer::getLastName));

        guardarCustomersEnFichero(customers, FICHERO);
    }

    private static void guardarCustomersEnFichero(List<Customer> customers, Path fichero) throws IOException {
        File ficheroDatos = new File(String.valueOf(FICHERO.toFile()));
        if (ficheroDatos.exists())
            throw new RuntimeException("El fichero ya existe.");

        ficheroDatos.getParentFile().mkdirs();

        try (ObjectOutputStream stream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(ficheroDatos)))) {
            for (Customer customer : customers){
                stream.writeObject(customer);
            }
        }

    }


    private static List<Customer> leerCustomersBd(int minId, int maxId) throws SQLException {
        List<Customer> customers = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(CONNECTION_STRING, USR, PWD);
             PreparedStatement ps = connection.prepareStatement(QUERY)) {
            ps.setInt(1, minId);
            ps.setInt(2, maxId);

            try (ResultSet rs = ps.executeQuery()) {
                if (!rs.isBeforeFirst()) {

                } else {
                    while (rs.next()) {
                        int customerId = rs.getInt("customer_id");
                        int storeId = rs.getInt("store_id");
                        String firstName = rs.getString("first_name");
                        String lastName = rs.getString("last_name");
                        String email = rs.getString("email");
                        int addressId = rs.getInt("address_id");
                        boolean active = rs.getBoolean("active");
                        LocalDate fechaCreacion = rs.getTimestamp("create_date").toLocalDateTime().toLocalDate();
                        LocalDate fechaActualizacion = rs.getTimestamp("last_update").toLocalDateTime().toLocalDate();

                        customers.add(new Customer(customerId, storeId, firstName, lastName, email, addressId, active, fechaCreacion, fechaActualizacion));
                    }
                }
            }
        }
        return customers;
    }

}
