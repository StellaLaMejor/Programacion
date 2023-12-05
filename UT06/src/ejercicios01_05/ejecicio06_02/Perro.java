package ejercicios01_05.ejecicio06_02;

public class Perro {

	private String nombrePerro;
	private String raza;
	private String nombreDueño;
	private int edad;
	private double peso;

	public String getNombrePerro ()
	{
		return nombrePerro;
	}
	public String getRaza ()
	{
		return raza;
	}	
	public String getNombreDueño ()
	{
		return nombreDueño;
	}
	public int getEdad ()
	{
		return edad;
	}
	public double getPeso ()
	{
		return peso;
	}
	
	
	public void setNombrePerro (String nombrePerro)
	{
		this.nombrePerro= nombrePerro;
	}
	public void setRaza (String raza)
	{
		this.raza= raza;
	}
	public void setNombreDueño (String nombreDueño)
	{
		this.nombreDueño= nombreDueño;
	}
	public void setEdad (int edad)
	{
		this.edad= edad;
	}
	public void setPeso (double peso)
	{
		this.peso= peso;
	}

}
