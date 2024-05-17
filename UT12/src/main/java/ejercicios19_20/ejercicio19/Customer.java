package ejercicios19_20.ejercicio19;

import java.io.Serializable;
import java.time.LocalDate;

public class Customer implements Serializable {
    private int customerId;
    private int storeId;
    private String firstName;
    private String lastName;
    private String email;
    private int addressId;
    private int active;
    private LocalDate fechaCreacion;
    private LocalDate fechaActualizacion;

    public Customer(int customerId, int storeId, String firstName, String lastName, String email, int addressId, int active, LocalDate fechaCreacion, LocalDate fechaActualizacion) {
        this.customerId = customerId;
        this.storeId = storeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.addressId = addressId;
        this.active = active;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getStoreId() {
        return storeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAddressId() {
        return addressId;
    }

    public int getActive() {
        return active;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaActualizacion() {
        return fechaActualizacion;
    }
}
