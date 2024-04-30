package ejercicios16_18.ejercicio17;

import java.io.*;
import java.nio.file.Path;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Informe {

    private static final Path FICHERO = Path.of("Desktop", "PruebasFicheros", "Ejercicio12_17", "customers.dat");
    private static final Path FICHERO_INFORME = Path.of("Desktop", "PruebasFicheros", "Ejercicio12_17", "customersInforme.txt");

    public static void main(String[] args) throws SQLException, IOException {

        List<Customer> customers = leerCustomersFichero(FICHERO);
        Collections.sort(customers, Comparator.comparing(Customer::getLastName).thenComparing(Customer::getFirstName));
        generarInformeTexto(customers, FICHERO_INFORME);

    }

    private static void generarInformeTexto(List<Customer> customers, Path ficheroInforme) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter(new File(String.valueOf(ficheroInforme.toFile())))) {
            pw.printf("| %5.5s | %-20.20s | %-20.20s | %-10.10s |  %s  |%s | %s | %s |", "ID","APELLIDOS", "NOMBRE", "EMAIL", "ACT", "CREADO", "ACTUALIZADO");

            for (Customer customer : customers) {
//                pw.println(customer);
                pw.println("-".repeat(104));
                pw.printf("| %5d | %-20.20s | %-20.20s | %-10.10s |  %s  |%s | %s | %s |", customer.getCustomerId(), customer.getLastName(), customer.getFirstName(), customer.getEmail(), customer.getActive() ? "Sí" : "No", customer.getFechaCreacion(), customer.getFechaActualizacion());

            }
        }
    }


    private static List<Customer> leerCustomersFichero(Path ficheroDatos) throws IOException {
        List<Customer> custumers = new ArrayList<>();
        if (!ficheroDatos.toFile().exists()) {
            throw new RuntimeException("No existe el fichero de datos");
        }
        try (ObjectInputStream stream = new ObjectInputStream(new ObjectInputStream(new BufferedInputStream(new FileInputStream(ficheroDatos.toFile()))))) {
            while (true) {
                Customer customer = (Customer) stream.readObject();
                custumers.add(customer);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
