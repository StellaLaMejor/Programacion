package ejercicios19_20.ejercicio19;

import java.io.*;
import java.nio.file.Path;
import java.sql.*;
import java.time.LocalDate;
import java.util.*;

public class Programa {
    private static final String CONNECTION = "jdbc:mariadb://localhost/sakila";
    private static final String USR = "sakilauser";
    private static final String PWD = "pwdsakilauser";
    private static final String SQL = """
            SELECT customer.customer_id,
            customer.store_id,
            customer.first_name,
            customer.last_name,
            customer.email,
            customer.address_id,
            customer.active,
            create_date,
            customer.last_update
            FROM customer""";
    private static final Path RUTA_FICHERO= Path.of("EJERCICIO19", "ficheroClientes.txt");

    public static void main(String[] args) throws SQLException, IOException {

        List <Customer> listaClientes = crearListaClientes();
        crearFicheroClientes(listaClientes,RUTA_FICHERO);

    }

    private static List<Customer> crearListaClientes() throws SQLException {
        List<Customer> listaClientes = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(CONNECTION, USR, PWD);
             PreparedStatement ps = connection.prepareStatement(SQL);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int idCliente = rs.getInt("customer_id");
                int idStore = rs.getInt("store_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String email = rs.getString("email");
                int addressId = rs.getInt("address_id");
                int active = rs.getInt("active");
                LocalDate fechaCreacion = rs.getTimestamp("create_date").toLocalDateTime().toLocalDate();
                LocalDate fechaActualizacion = rs.getTimestamp("last_update").toLocalDateTime().toLocalDate();

                listaClientes.add(new Customer(idCliente, idStore, firstName, lastName, email, addressId, active, fechaCreacion, fechaActualizacion));
            }
           Comparator<Customer>comparador= Comparator.comparing(Customer::getFirstName).thenComparing(Customer::getLastName);
            Collections.sort(listaClientes,comparador);
           }
        return listaClientes;
    }

    private static void crearFicheroClientes (List<Customer> listaClientes, Path fichero) throws IOException {
        if(!fichero.toFile().exists()) {
            fichero.toFile().getParentFile().mkdirs();
        }

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(fichero.toFile()))){
            for(Customer cliente : listaClientes){
                dos.writeByte(cliente.getCustomerId());
                dos.writeByte(cliente.getStoreId());
                dos.writeUTF(cliente.getFirstName());
                dos.writeUTF(cliente.getLastName());
                dos.writeUTF(cliente.getEmail());
                dos.writeByte(cliente.getAddressId());
                dos.writeByte(cliente.getActive());
                dos.writeLong((cliente.getFechaCreacion()).toEpochDay());
                dos.writeLong((cliente.getFechaActualizacion()).toEpochDay());
            }
        }
    }

}
