package ejercicios08_10.ejercicio11_08;

import java.util.Random;

public class Programa {

	public static void main(String[] args) {

		Figura [] arrayFiguras = new Figura [15];
		
		for (Figura figura : arrayFiguras) {
			figura = figuraAleatoria();
		
		}
		

		sin terminar
		

	}
	
	private static Figura figuraAleatoria()
	{
		Random rdm= new Random();
		Figura figuraAleatoria;
		int numeroRandom= rdm.nextInt(5);
		double lado1=rdm.nextDouble(10);
		double lado2=rdm.nextDouble(10);
		double lado3=rdm.nextDouble(10);

		double valoresRandom=rdm.nextDouble(10);
		
		switch (numeroRandom) {
		case 1:
			return figuraAleatoria= new Circulo(valoresRandom);
		case 2:
			while((lado1+lado2)< lado3)
			{
				lado3=rdm.nextDouble(10);
				lado1=rdm.nextDouble(10);
				lado2=rdm.nextDouble(10);

			}
			return figuraAleatoria= new Triangulo(lado1, lado2, lado3);

		case 3:
			return figuraAleatoria= new Cuadrado(rdm.nextDouble(10));
		case 4:
			return figuraAleatoria= new Rectangulo(rdm.nextDouble(10), rdm.nextDouble(10));
		default:
			return figuraAleatoria= new Romboide(rdm.nextDouble(10), rdm.nextDouble(10), rdm.nextDouble(10));
		}
		
	}

}
