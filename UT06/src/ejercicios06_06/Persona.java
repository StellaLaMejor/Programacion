package ejercicios06_06;

import java.util.Random;

public class Persona {
	
	Random rdm = new Random ();
	

	
	private static final double PESO_DEFECTO = 0;
	private static final int ALTURA_DEFECTO = 0;
	private static final int EDAD_DEFECTO = 0;
	private static final Sexo SEXO_DEFECTO = Sexo.M;
	
	private static final int DEBAJO_PESO_IDEAL= -1;
	private static final int PESO_IDEAL= 0;
	private static final int ENCIMA_PESO_IDEAL= 1;

	
	
	private String nombre;
	private int edad;
	private String dni= generaDNI();
	private Sexo sexo;
	private double peso;
	private int altura;
	
	public Persona() {
		
	}
	public Persona(String nombre, String dni) 
	{
		this(nombre, EDAD_DEFECTO, dni, SEXO_DEFECTO);
	}

	
	public Persona(String nombre, int edad, String dni, Sexo sexo) 
	{
		this(dni, edad, dni, sexo, PESO_DEFECTO, ALTURA_DEFECTO);
	}
	
	
	public Persona(String nombre, int edad, String dni, Sexo sexo, double peso, int altura) 
	{
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	
	private int calcularIMC ()
	{
		double alturaMetros= this.altura/100;
		double pesoIdeal= this.peso/(Math.pow(alturaMetros, 2));
		
		if (pesoIdeal<20)
		{
			return DEBAJO_PESO_IDEAL;
		}
		if(pesoIdeal>=20 && pesoIdeal<=25)
		{
			return PESO_IDEAL;
		}
		else 
		{
		return ENCIMA_PESO_IDEAL;	
		}
	}
	
	public void mensajeIMC ()
	{
		 int resultadoIMC = calcularIMC();

		if (resultadoIMC== DEBAJO_PESO_IDEAL)
		{
			System.out.printf("El peso indicado (%.2f) está por debajo del peso ideal.\n",this.peso );
		}
		else if (resultadoIMC==PESO_IDEAL)
		{
			System.out.printf("El peso indicado (%.2f) está en el peso ideal.\n",this.peso );
		}
		else 
		{
			System.out.printf("El peso indicado (%.2f) está por encima del peso ideal.\n",this.peso );
		}
	}
	
	
	public boolean esMayorDeEdad()
	{
		if (this.edad >= 18)
		{
			return true;
		}
		return false;
	}
	
	
	private String generaDNI() 
	{
		int numeroRdm= rdm.nextInt(0, 100_000_000);
		char letraRdm= (char) rdm.nextInt((int)'A', (int) 'Z');
		
		return String.format("%08d%s", numeroRdm, letraRdm);
		
	}
	
	
	
	
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", DNI=");
		builder.append(dni);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", altura=");
		builder.append(altura);
		builder.append("]");
		return builder.toString();
	}
	

}
