package ejercicios11_11;

import java.util.Random;

public class Agricultor {

	private String nombre;
	private String producto;
	private static int totalKg;
	
	public Agricultor(String nombre, String producto) {
		this.nombre = nombre;
		this.producto = producto;
	}
	
	public void recolectar() {
		Random rdm= new Random ();
		int kilos= rdm.nextInt(100,200 +1);
		System.out.printf("%s ha recolectado %d kilos de %s", this.nombre,kilos, this.producto);
		this.totalKg += kilos;
		
		
	}
	public static int getTotalKg() {
		return totalKg;
}
	
	

	
}

