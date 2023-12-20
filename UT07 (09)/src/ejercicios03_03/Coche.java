package ejercicios03_03;

public class Coche {
	private boolean arrancado;
	private boolean marchaAtras;
	final private int velocidadMax;
	final private int velocidadMaxAtras;
	private int velocidad;
	
	sin terminar
	
	
	public Coche(int velocidadMax, int velocidadMaxAtras) {
		this(false, false, velocidadMax, velocidadMaxAtras, 0);
	}

	public Coche(boolean arrancado, boolean marchaAtras, int velocidadMax, int velocidadMaxAtras, int velocidad) {
		this.arrancado = arrancado;
		this.marchaAtras = marchaAtras;
		this.velocidadMax = velocidadMax;
		this.velocidadMaxAtras = velocidadMaxAtras;
		this.velocidad = velocidad;
	}
	
	public boolean getArrancado() {
		return arrancado;
	}
	public boolean getMarchaAtras() {
		return marchaAtras;
	}
	public int getVelocidadMax() {
		return velocidadMax;
	}
	public int getVelocidadMaxAtras() {
		return velocidadMaxAtras;
	}
	public int getVelocidad() {
		return velocidad;
	}
	
	public void arrancar () {
		
		if(this.arrancado == true)
		{
			throw new IllegalStateException ("El coche ya está arrancado");
		}
		this.arrancado= true; 
	}
	
	public void detener() {
		
		if(this.arrancado == false)
		{
			throw new IllegalStateException ("El coche ya está detenido");
		}
		this.arrancado= false; 
	}
	
}
