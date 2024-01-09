package ejercicios01_02.ejercicio11_01;

public class Fecha {
	
	private int dia;
	private int mes;
	private int anio;
	
	
	
	public Fecha() {
		this(1, 1, 1970);
	}

	public Fecha(int dia, int mes, int anio) {
		
		if (anio <= 0)
		{
			throw new IllegalArgumentException("El año tiene que ser mayor que 0.");
		}
		if(mes < 1 || mes > 12)
		{
			throw new IllegalArgumentException("El mes tiene que quer un número entre 1 y 12 (ambos incluidos).");
		}
		
		if (dia <1)
		{
			throw new IllegalArgumentException("El día no puede ser menor que uno.");

		}
		switch (mes) {
		case 1,3,5,7,8,10,12:
			if( dia >31)
			{
				throw new IllegalArgumentException("El día no puede ser que 31.");
			}
			break;
		case 4,6,9,11:
			if( dia >30)
			{
				throw new IllegalArgumentException("El día no puede ser que 30.");
			}
			break;
			
		default:
			int ultimoDiaFebrero = esBisiesto(anio)?29 :28;
			if (dia > ultimoDiaFebrero)
			{
				throw new IllegalArgumentException(String.format("El día no puede ser mayor %d. ", ultimoDiaFebrero));
			}
		}
		
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	private boolean esBisiesto(int anioAComprobar) {
		return ((anioAComprobar %4 == 0) &&  (anioAComprobar %100 != 0)) ||  (anioAComprobar %400 == 0);
	}
	
	public String toString() {
		
		return String.format("%02d-%02d-%02d", this.dia, this.mes,this.anio);
	}
	
	public void diaSiguiente() {
		int ultimoDiaFebrero = esBisiesto(anio)?29 :28;

		if(ultimoDiaAnio())
		{
			this.dia=1;
			this.mes =1;
			this.anio++;
		}
		else
		{
			if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10
					|| this.mes == 12) {
				
				if (this.dia >= 31) {
					this.dia = 1;
					this.mes ++;
				} else {
					this.dia ++;
				}
			} else if (this.mes == 2)
			{
				if (this.dia >= ultimoDiaFebrero) {
					this.dia = 1;
					this.mes ++;
				} else {
					this.dia ++;
				}
				
			} else {
				
				if (this.dia >= 30) {
					this.dia = 1;
					this.mes ++;
				} else {
					this.dia ++;
				}
			}
		}
	}
	
	private boolean ultimoDiaAnio() {
		return this.dia==31 && this.mes==12;
	}

	public boolean esMayorQue(Fecha f) 
	{
		if ( f == null) {
			return true;
		}
		if (this.anio > f.anio) {
			return true;
		}
		if (this.anio < f.anio) {
			return false;
		} 
		if (this.mes > f.mes) {
			return true;
		}
		if (this.mes< f.mes) {
			return false;
			
		} else {
			if (this.dia > f.dia) {
				return true;
			} 
			
		return false;
			
		}
		
	}
		
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		
	
		this.anio = anio;
	}
	
	

	
	
	

}
