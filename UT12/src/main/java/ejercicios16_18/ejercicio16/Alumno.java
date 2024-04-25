package ejercicios16_18.ejercicio16;

import java.io.Serializable;
import java.time.LocalDate;

public class Alumno implements Serializable {
    private String dni;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;

    public Alumno(String dni, String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad(){
        int tiempoPasado = getFechaNacimiento().compareTo(LocalDate.now());
        return tiempoPasado;
    }

    @Override
    public String toString() {
        return String.format("Alumno{ dni: %s, nombre: %s, apellidos: %s, fechaNacimiento: %s }", dni ,nombre, apellidos, fechaNacimiento);
    }
}
