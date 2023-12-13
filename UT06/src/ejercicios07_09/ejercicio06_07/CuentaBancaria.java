package ejercicios07_09.ejercicio06_07;

import java.util.Random;

public class CuentaBancaria {

	private static final double SALDO_DEFECTO = 0;

	Random rdm= new Random ();
	
	private final int MAXIMO_CUENTA= 9999999;
	private final int MINIMO_CUENTA= 1000000;
	
	private final int numeroCuenta= rdm.nextInt(MINIMO_CUENTA, MAXIMO_CUENTA+1);
	private final String nif;
	private final String nombre;
	private final String apellido;
	private final double dinero;
	
	
	
	public CuentaBancaria(String nif, String nombre, String apellido) 
	{
		this(nif, nombre, apellido, SALDO_DEFECTO);
	}
	
	public CuentaBancaria(String nif, String nombre, String apellido, double dinero) 
	{
		this.nif = nif;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dinero = dinero;
	}

	
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public String getNif() {
		return nif;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public double getDinero() {
		return dinero;
	}

	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaBancaria [numeroCuenta=");
		builder.append(numeroCuenta);
		builder.append(", dinero=");
		builder.append(dinero);
		builder.append("]\n");
		builder.append("nif=");
		builder.append(nif);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellido=");
		builder.append(apellido);

		return builder.toString();
	}

	
	
	
}
