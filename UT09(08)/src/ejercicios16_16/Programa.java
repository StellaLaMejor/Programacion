package ejercicios16_16;

public class Programa {

	public static void main(String[] args) {
		
		try {
			
			Estacionamiento estacionamiento = new Estacionamiento("54564", 5, 4, 10, 2);
			estacionamiento.estacionarVehiculo("54564");
			estacionamiento.estacionarVehiculo("54564");

		}catch(VehiculoYaEstacionado e) {
			 
			System.out.println("lalalala");
		}

	}

}
