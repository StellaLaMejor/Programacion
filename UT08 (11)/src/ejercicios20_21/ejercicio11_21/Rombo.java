package ejercicios20_21.ejercicio11_21;

public class Rombo extends Figura{

	private static final int NUM_LADOS=4;

	
	private double diagonalMayor;
	private double diagonalMenor;
	
	
	
	
	public Rombo(double diagonalMayor, double diagonalMenor) {
		super(NUM_LADOS);
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

	@Override
	public void escalar(double factor) {
		this.diagonalMayor*=factor;
		this.diagonalMenor*=factor;
		
	}

}
