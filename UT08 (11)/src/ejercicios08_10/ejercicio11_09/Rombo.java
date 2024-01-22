package ejercicios08_10.ejercicio11_09;

public class Rombo extends Figura{

	
	private double diagonalMayor;
	private double diagonalMenor;
	
	
	
	
	public Rombo(double diagonalMayor, double diagonalMenor) {
		this.diagonalMayor = diagonalMayor;
		this.diagonalMenor = diagonalMenor;
	}

	@Override
	public double perimetro() {
		return 2* Math.sqrt((this.diagonalMayor*this.diagonalMayor)+ (this.diagonalMenor*this.diagonalMenor));
	}

	@Override
	public double area() {
		return (diagonalMayor*diagonalMenor)/2;
	}

}
