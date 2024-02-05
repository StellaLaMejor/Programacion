package ejercicios20_21.ejercicio11_21;

import java.util.Random;

public class Programa {

	public static void main(String[] args) {
		Random rdm = new Random();
		Escalable [] escalable =new Escalable [3];
		
		for (int i = 0; i < escalable.length; i++) {
			
			escalable[i]= figuraAleatoria();
		}
		mostrarEscalable(escalable);
		System.out.println();
		
		for (int i = 0; i < escalable.length; i++) {
			escalable[i].escalar(rdm.nextDouble(3));
		}
		mostrarEscalable(escalable);
		
		Imagen [] imagenes = new Imagen[10];jfgdl.r

	}

	private static Figura figuraAleatoria() {
		Random rdm = new Random();
		int numeroRandom = rdm.nextInt(8);
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
		case 5:
			return new Rombo(rdm.nextDouble(10) + 1, rdm.nextDouble(10) + 1);
		case 6:
			return new PoligonoRegular(rdm.nextInt(5),rdm.nextDouble(10) + 1, rdm.nextDouble(10) + 1);
		case 7:
			return new Elipse(rdm.nextDouble(5) + 1, rdm.nextDouble(10) + 1);

		default:
			return new Romboide(rdm.nextDouble(10) + 1, rdm.nextDouble(10) + 1,
					rdm.nextDouble(10) + 1);
		}

	}

	private static String getTipoFigura(Escalable f) {
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
		if (f instanceof Rombo) {
			return "Rombo";
		}
		if (f instanceof Elipse) {
			return "Elipse";
		}
		if (f instanceof PoligonoRegular) {
			return "Polígono Regular";
		}
		return "Triángulo";
	}

	private static void mostrarFiguras(Figura[] figuras) {
		for (int i = 0; i < figuras.length; i++) {
			Figura figura = figuras[i];
			System.out.printf("La figura de la posición %d es un %s y su área es %.2f y su perímetro es %.2f\n", i + 1, getTipoFigura(figura), figura.area(), figura.perimetro());
		}
	}
	
	private static void mostrarEscalable(Escalable[] figuras) {
		for (int i = 0; i < figuras.length; i++) {
			Escalable figura = figuras[i];
			System.out.printf("La figura de la posición %d es un %s y su área es %.2f y su perímetro es %.2f\n", i + 1, getTipoFigura(figura), ((Figura) figura).area(), ((Figura) figura).perimetro());
		}
	}

}
