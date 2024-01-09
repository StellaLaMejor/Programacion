package ejercicios01_02.ejercicio11_01;

public class Programa {

	public static void main(String[] args) {

		Fecha f = new Fecha (29,2, 2004);
		Fecha b = new Fecha(1,2,3);
		
		System.out.println(f);
		f.diaSiguiente();
		System.out.println(f);
		
		f.setMes(4);
		f.setDia(20);
		System.out.println(f);
		f.diaSiguiente();
		System.out.println(f);
		
		f.setAnio(2003);
		f.setMes(12);
		f.setDia(31);
		System.out.println(f);
		f.diaSiguiente();
		System.out.println(f);
		
		Fecha f2 = new Fecha (10,1,2024);
		
		
		System.out.println(f.esMayorQue(f2));
		System.out.println(f2.esMayorQue(f));

	}

	
}
