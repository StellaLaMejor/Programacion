package ejercicios20_21.ejercicio11_21;

import java.util.Iterator;

public class Imagen implements Escalable{

	int alto;
	int ancho;
	
	
	@Override
	public String toString() {
		String an = "";
		String blanco=" ";
		for (int i = 0; i < this.ancho; i++) {
			an+= "-";
			blanco+=blanco;
		}
		String al = "";
		for (int i = 0; i < this.alto; i++) {
			al+="|\n";
		}
		return String.format("%s\n%s %s %s\n %s",an, al, blanco, al, an );
	}


	@Override
	public void escalar(double factor) {
		int factor2=((int) factor);
		this.alto*=factor2;
		this.ancho*=factor2;

	}
}
