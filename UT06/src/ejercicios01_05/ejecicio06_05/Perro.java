package ejercicios01_05.ejecicio06_05;


public class Perro {

	private static final int MAX_COMIDA_GR = 200;
	private static final int MIN_COMIDA_GR = 0;
	private static final int MAX_MINUTOS_JUEGO = 10;
	private static final int MIN_MINUTOS_JUEGO = 0;
	private String nombre;
	private String raza;
	private String propietario;
	private int edadAnios;
	private double pesoKg;
	private Posicion posicion = Posicion.SENTADO;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public int getEdadAnios() {
		return edadAnios;
	}
	public void setEdadAnios(int edadAnios) {
		this.edadAnios = edadAnios;
	}
	public double getPesoKg() {
		return pesoKg;
	}
	public void setPesoKg(double pesoKg) {
		this.pesoKg = pesoKg;
	}
	public Posicion getPosicion() {
		return posicion;
	}

	
	public void comer(int cantidadComidaGr) {
		if (cantidadComidaGr > MAX_COMIDA_GR) {
			cantidadComidaGr = MAX_COMIDA_GR;
		}
		if (cantidadComidaGr < MIN_COMIDA_GR) {
			cantidadComidaGr = MIN_COMIDA_GR;
		}
		System.out.printf("Soy %s y estoy comiendo %d gr de comida.\n", this.nombre, cantidadComidaGr);
		this.pesoKg += (cantidadComidaGr / 10) / 1000D;
	}
	public void jugar(int tiempoMinutos) {
		if (tiempoMinutos > MAX_MINUTOS_JUEGO) {
			tiempoMinutos = MAX_MINUTOS_JUEGO;
		}
		if (tiempoMinutos < MIN_MINUTOS_JUEGO) {
			tiempoMinutos = MIN_MINUTOS_JUEGO;
		}
		System.out.printf("Soy %s y estoy jugando %d minutos.\n", this.nombre, tiempoMinutos);
		this.pesoKg -= (tiempoMinutos / 7) / 1000D;
	}
	
	public void ponerseDePie ()
	{
		if (this.posicion == Posicion.SENTADO)
		{
			this.posicion= Posicion.DE_PIE;
		}
		else if (this.posicion == Posicion.TUMBADO)
		{
			System.out.printf("Soy %s y no puedo ponerme de pie porque estoy tumbado.\n", this.nombre);
		}
		else
		{
			System.out.println("Ya estoy de pie.");
		}
	}
	
	public void sentarse ()
	{
		if (this.posicion != Posicion.SENTADO) 
		{
			this.posicion = Posicion.SENTADO;
		}
		else
		{
			System.out.println("Ya estoy sentado.");
		}
	}
	
	public void tumbarse ()
	{
		{
			if (this.posicion == Posicion.SENTADO)
			{
				this.posicion= Posicion.TUMBADO;
			}
			else if (this.posicion == Posicion.TUMBADO)
			{
				System.out.println("Ya estoy tumbado.");
			}
			else
			{
				System.out.printf("Soy %s y no puedo tumbarme porque estoy de pie.\n", this.nombre);
			}
		}
	}

}
	