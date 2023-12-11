package ejercicios06_06;

public class Persona {
	
	private static final double PESO_DEFECTO = 0;
	private static final int ALTURA_DEFECTO = 0;
	private static final int EDAD_DEFECTO = 0;
	private static final Sexo SEXO_DEFECTO = Sexo.M;
	
	private String nombre;
	private int edad;
	private String dni;
	private Sexo sexo;
	private double peso;
	private int altura;
	
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
	
	

}
