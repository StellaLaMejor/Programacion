package ejercicios17_19.ejercicio11_19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

import ejercicios17_19.ejercicio11_19.cuerda.Cuerda;
import ejercicios17_19.ejercicio11_19.cuerda.tipos.frotada.Violin;
import ejercicios17_19.ejercicio11_19.cuerda.tipos.frotada.Violonchelo;
import ejercicios17_19.ejercicio11_19.cuerda.tipos.percutida.Piano;
import ejercicios17_19.ejercicio11_19.cuerda.tipos.pulsada.Arpa;
import ejercicios17_19.ejercicio11_19.cuerda.tipos.pulsada.Guitarra;
import ejercicios17_19.ejercicio11_19.percusion.Pandereta;
import ejercicios17_19.ejercicio11_19.percusion.Timbales;
import ejercicios17_19.ejercicio11_19.percusion.Xilofono;
import ejercicios17_19.ejercicio11_19.viento.tipos.Clarinete;
import ejercicios17_19.ejercicio11_19.viento.tipos.Flauta;
import ejercicios17_19.ejercicio11_19.viento.tipos.Trompeta;
import ejercicios17_19.ejercicio11_19.viento.tipos.Tuba;
import net.datafaker.Faker;

public class Programa {
	
 
	public static void main(String[] args) {

		Instrumento[] instrumentos = crearInstrumentos(5);
		
        Arrays.sort(instrumentos, Comparator.comparing(Instrumento::getPropietario));

		tocarInstrumentos(instrumentos);
		System.out.println();
		mostrarInstrumentos(instrumentos);
		System.out.println();
		System.out.println("El/la que tiene un instrumento con mayor dificultad es: "+ buscarMasDificil(instrumentos));
		dejarDeTocarInstrumentos(instrumentos);
		System.out.println();
		Arrays.sort(instrumentos, Comparator.comparing(Instrumento::getNombreInstrumento)); 
		afinarInstrumentos(instrumentos);
		System.out.println();
		tocarInstrumentos(instrumentos);
		System.out.println();
		Arrays.sort(instrumentos);
		mostrarInstrumentos(instrumentos);
		
	}

	private static Instrumento[] crearInstrumentos(int numInstrumentos) {
		Faker fake = new Faker(new Locale("es"));
		Instrumento[] instrumentos = new Instrumento[numInstrumentos];

		for (int i = 0; i < numInstrumentos; i++) {
			int numRandom = fake.random().nextInt(12);
			String nombre = fake.name().firstName();
			switch (numRandom) {
			case 1: {
				instrumentos[i] = new Violin(nombre);
				break;
			}
			case 2: {
				instrumentos[i] = new Violonchelo(nombre);
				break;
			}
			case 3: {
				instrumentos[i] = new Piano(nombre);
				break;
			}
			case 4: {
				instrumentos[i] = new Arpa(nombre);
				break;
			}
			case 5: {
				instrumentos[i] = new Guitarra(nombre);
				break;
			}
			case 6: {
				instrumentos[i] = new Flauta(nombre);
				break;
			}
			case 7: {
				instrumentos[i] = new Clarinete(nombre);
				break;
			}
			case 8: {
				instrumentos[i] = new Trompeta(nombre);
				break;
			}
			case 9: {
				instrumentos[i] = new Tuba(nombre);
				break;
			}
			case 10: {
				instrumentos[i] = new Xilofono(nombre);
				break;
			}
			case 11: {
				instrumentos[i] = new Timbales(nombre);
				break;
			}
			default:
				instrumentos[i] = new Pandereta(nombre);
				break;
			}
		}
		return instrumentos;

	}

	private static void tocarInstrumentos(Instrumento[] instrumentos) {

		for (Instrumento instrumento : instrumentos) {
			instrumento.tocar();
		}

	}
	private static void dejarDeTocarInstrumentos (Instrumento[] instrumentos) {

	
		System.out.println();
		for (Instrumento instrumento : instrumentos) {
			instrumento.parar();
		}
	}

	private static Instrumento buscarMasDificil(Instrumento[] instrumentos) {
		Instrumento masDificil = instrumentos[0];
		for (int i = 0; i < instrumentos.length; i++) {
			if (instrumentos[i].esMasDificil(masDificil)) {
				masDificil = instrumentos[i];
			}
		}
		return masDificil;
	}

	private static void mostrarInstrumentos(Instrumento[] instrumentos) {
		for (int i = 0; i < instrumentos.length; i++) {
			System.out.println(instrumentos[i].toString());
		}
	}
	private static void afinarInstrumentos(Instrumento [] instrumentos)
	{
		for (Instrumento instrumento : instrumentos) {
			if (instrumento instanceof Afinable)
				((Afinable) instrumento).afinar();
		}
	}
}

