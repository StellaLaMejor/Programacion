package ejercicios20_21.ejercicio11_21;

import java.util.Iterator;

public class Imagen implements Escalable{

	int alto;
	int ancho;
	
	
	public Imagen(int alto, int ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}


	@Override
	 public String toString() {
	    StringBuilder cuadradoString = new StringBuilder();

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i == 0 || i == alto - 1) {
                    cuadradoString.append("- ");
                } else if (j == 0 || j == ancho - 1) {
                    cuadradoString.append("| ");
                } else {
                    cuadradoString.append("  "); 
                }
            }
            cuadradoString.append("\n");
        }

        return cuadradoString.toString();
    }

	@Override
	public void escalar(double factor) {
		
		this.alto*=factor;
		this.ancho*=factor;

	}
}
