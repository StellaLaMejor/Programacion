package ejercicios04_05.ejercicio11_05;

import java.time.LocalDate;

import net.datafaker.Faker;

public class Programa {

	public static void main(String[] args) {
		
		Faker fake = new Faker ();

		
		ProductoFresco pF= new ProductoFresco(LocalDate.of(2023, 04, 01), 54654564, LocalDate.of(2024, 01, 1), "ESPAÑA");
		System.out.println(pF.toString());
		
		Producto p= new Producto(LocalDate.of(2024, 04, 01), 54654564);
		System.out.println(p.toString());
		
		ProductoRefrigerado pR= new ProductoRefrigerado(LocalDate.of(2024, 04, 01), 54654564, 12345);
		System.out.println(pR.toString());
		
		ProductoCongelado pC= new ProductoCongelado(LocalDate.of(2024, 04, 01), 54654564, 1);
		System.out.println(pC.toString());
	}

}
