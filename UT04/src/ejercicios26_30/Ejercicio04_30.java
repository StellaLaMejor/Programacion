package ejercicios26_30;

public class Ejercicio04_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Haz un programa que muestre la tabla de multiplicar de los números 1,2,3,4 y 5.
//		Hazlo usando un bucle anidado, un bucle dentro de otro.

		int num = 1;
		while (num < 6) {
			for (int n2 = 1; n2 <= 10; n2++) {
				System.out.printf("%d X %d = %d\n", num, n2, num * n2);
			}
			System.out.println("\n");
			num++;
		}

	}

}
