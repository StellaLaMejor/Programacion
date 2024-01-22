package ejercicios08_10.ejercicio11_09;

public class Elipse extends Figura{
	private double semiEjeMenor;
	private double semiEjeMayor;
	
	@Override
	public double perimetro() {
		return 2* Math.PI* Math.sqrt(((semiEjeMayor*semiEjeMayor)+ (semiEjeMenor*semiEjeMenor))/2) ;
	}
	@Override
	public double area() {
		return Math.PI*semiEjeMayor*semiEjeMenor;
	}

}
