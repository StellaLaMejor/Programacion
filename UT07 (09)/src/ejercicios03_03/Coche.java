package ejercicios03_03;

public class Coche {
	private boolean arrancado;
	private boolean marchaAtras;
	final private int velocidadMax;
	final private int velocidadMaxAtras;
	private int velocidad;
	

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
		
		if(this.arrancado)
		{
			throw new IllegalStateException ("El coche ya está arrancado");
		}
		else {
		this.arrancado= true; 
		} 
	}
	
	public void detener() {
		
		if(!this.arrancado)
		{
			throw new IllegalStateException ("El coche ya está detenido");
		}
		if(this.velocidad!=0)
		{
			throw new IllegalStateException("La velocidad actual del coche es distinta de 0");
		}
		if (this.velocidad!=0 && this.arrancado)
		{
			this.arrancado = false;
			this.marchaAtras = false;
		}
	}
	
	public void ponerMarchaAtrás()
	{
		if(this.velocidad==0 )
		{
			this.marchaAtras=true;
		}
		else if(this.marchaAtras)
		{
			throw new IllegalStateException("El coche ya está yendo marcha atrás.");
		}
		if (this.velocidad!=0)
		{
			throw new IllegalStateException("La velocidad actual del coche es distinta de 0");
		}
	}
	
	public void quitarMarchaAtrás ()
	{
		if(this.velocidad==0)
		{
			this.marchaAtras=false;        
		}
		if(this.marchaAtras==false)
		{
			throw new IllegalStateException("El coche ya tiene quitada la marcha atrás.");
		}
		if (this.velocidad!=0)
		{
			throw new IllegalStateException("La velocidad debe ser distinta a 0.");
		}
	}
	public void acelerar(int kmAcelerar )
	{
		  if (kmAcelerar <= 0) 
		  {
		       throw new IllegalArgumentException("Debe ser mayor a 0.");     
		  }
		  if (this.arrancado==true) 
		  {
			  if (!this.marchaAtras && kmAcelerar>0) {
			        int velocidadSumada = this.velocidad + kmAcelerar;
			        if (velocidadSumada <= this.velocidadMax) {
			            this.velocidad = velocidadSumada;
			        }
			    }  
			   if (this.marchaAtras && kmAcelerar>0) 
			   { 
			        int velocidadRestada = this.velocidad - kmAcelerar;
			        if (velocidadRestada >= this.velocidadMaxAtras) 
			        {
			            this.velocidad = velocidadRestada;
			        }
			   }
		    }
		  else if (this.arrancado==false)
		  {
		       throw new IllegalArgumentException("El coche debe estar arrancado.");     
		  }
	}
	
	public void frenar(int kmFrenar) 
	{
		if (kmFrenar <= 0) {
	        throw new IllegalArgumentException("Debe ser mayor a 0.");
	    }
		if (!this.marchaAtras && kmFrenar<0) {
	        int velocidadNoAtras = this.velocidad - kmFrenar;
	        if (velocidadNoAtras > 0) {
	            this.velocidad = velocidadNoAtras;
	        } else {
	            this.velocidad = 0;
	        }
	    } else if (this.marchaAtras && kmFrenar<0){ 
	        int velocidadAtras = this.velocidad + kmFrenar;
	        if (velocidadAtras < 0) {
	            this.velocidad = velocidadAtras;
	        } else {
	            this.velocidad = 0;
	        }
	    }
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [arrancado=");
		builder.append(arrancado);
		builder.append(", marchaAtras=");
		builder.append(marchaAtras);
		builder.append(", velocidad=");
		builder.append(velocidad);
		builder.append("]");
		return builder.toString();
	}
	
	
}
