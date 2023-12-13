package ejercicios07_09.ejercicio06_09;

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
	private double dinero;
	private boolean admiteDescubiertos;
	
	


	public CuentaBancaria(String nif, String nombre, String apellido, boolean admiteDescubiertos) 
	{
		this(nif, nombre, apellido, SALDO_DEFECTO, admiteDescubiertos);
	}
	
	public CuentaBancaria(String nif, String nombre, String apellido, double dinero, boolean admiteDescubiertos) 
	{
		this.nif = nif;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dinero = dinero;
		this.admiteDescubiertos= admiteDescubiertos;
		
	}
	
	
	
	public boolean getAdmiteDescubiertos() {
		return admiteDescubiertos;
	}

	public void setAdmiteDescubiertos(boolean admiteDescubiertos) {
		this.admiteDescubiertos = admiteDescubiertos;
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
	
	
	
	public void reembolsar(double cantidad)
	{
		if (cantidad<=0)
		{
			System.err.println("No se ha podido efectuar la operación.");
		}
		else
		{

			double nuevoSaldo =this.dinero-cantidad;
			if(nuevoSaldo<0 && !admiteDescubiertos)
			{
				System.err.println("No se ha podido efectuar la operación.");
			}
			else
			{
				this.dinero-=cantidad;
			}
		}
	}
	
	public void ingresar (double cantidad)
	{
		if (cantidad<=0)
		{
			System.err.println("No se ha podido efectuar la operación.");
		}
		else
		{
			double nuevoSaldo =this.dinero-cantidad;
			if(nuevoSaldo<0 && !admiteDescubiertos)
			{
				System.err.println("No se ha podido efectuar la operación.");
			}
			else
			{
				this.dinero+=cantidad;
			}
		}
	}
	
	public boolean estaEnNumerosRojos ()
	{
		return this.dinero < 0;
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
