package ejercicios08_10.ejercicio11_10;

import java.util.Random;

public class Programa {

	public static void main(String[] args) {

		Figura[] arrayFiguras = new Figura[15];

		for (int i = 0; i < arrayFiguras.length; i++) {
			arrayFiguras[i]= figuraAleatoria();
		}

		mostrarFiguras(arrayFiguras);

	}

	private static Figura figuraAleatoria() {
		Random rdm = new Random();
		int numeroRandom = rdm.nextInt(5);
		double lado1 = rdm.nextDouble(10) + 1;
		double lado2 = rdm.nextDouble(10) + 1;
		double lado3 = rdm.nextDouble(10) + 1;

		double valoresRandom = rdm.nextDouble(10) + 1;

		switch (numeroRandom) {
		case 1:
			return  new Circulo(valoresRandom);
		case 2:
			while ((lado3 >= (lado1 + lado2)) || (lado2 >= (lado1 + lado3)) || (lado1 >= (lado3 + lado2))) {
				lado3 = rdm.nextDouble(10) + 1;
				lado1 = rdm.nextDouble(10) + 1;
				lado2 = rdm.nextDouble(10) + 1;

			}
			return  new Triangulo(lado1, lado2, lado3);

		case 3:
			return  new Cuadrado(rdm.nextDouble(10) + 1);
		case 4:
			return new Rectangulo(rdm.nextDouble(10) + 1, rdm.nextDouble(10) + 1);
		default:
			return new Romboide(rdm.nextDouble(10) + 1, rdm.nextDouble(10) + 1,
					rdm.nextDouble(10) + 1);
		}

	}

	private static String getTipoFigura(Figura f) {
		if (f instanceof Circulo) {
			return "Circulo";
		}
		if (f instanceof Cuadrado) {
			return "Cuadrado";
		}
		if (f instanceof Rectangulo) {
			return "Rectángulo";
		}
		if (f instanceof Romboide) {
			return "Romboide";
		}
		return "Triángulo";
	}

	private static void mostrarFiguras(Figura[] figuras) {
		for (int i = 0; i < figuras.length; i++) {
			Figura figura = figuras[i];
			System.out.printf("La figura de la posición %d es un %s y su área es %.2f y su perímetro es %.2f\n", i + 1, getTipoFigura(figura), figura.area(), figura.perimetro());
		}
	}

}
