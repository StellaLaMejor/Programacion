package ejercicios16_16;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;

public class Estacionamiento {

	private String matricula;
	private int numPlaza;
	private int numPlazasCola;
	private int tiempoCortesia;
	private int precioSegundoCentimos;

	private Map<String, LocalDateTime> estacionados;
	private Queue<String> esperando;

	public Estacionamiento(String matricula, int numPlaza, int numPlazasCola, int tiempoCortesia,
			int precioSegundoCentimos) {
		this.matricula = matricula;
		this.numPlaza = numPlaza;
		this.numPlazasCola = numPlazasCola;
		this.tiempoCortesia = tiempoCortesia;
		this.precioSegundoCentimos = precioSegundoCentimos;
		this.estacionados = new HashMap<>();
		this.esperando = new LinkedList<String>();
	}

	public ResultadoEstacionamiento estacionarVehiculo(String matricula) {
		if (estacionados.containsKey(matricula)) {
			throw new IllegalArgumentException(
					String.format("El vehículo con la matrícula <%s> ya está estacionado", this.matricula));
		}
		if (esperando.contains(matricula)) {
			throw new IllegalStateException(
					String.format("El vehículo con la matrícula <%s>está esperando en la cola", this.matricula));
		}
		if (estacionados.size() < numPlaza) {
			estacionados.put(matricula, LocalDateTime.now());
			return ResultadoEstacionamiento.ESTACIONADO;
		}
		if (esperando.contains(matricula)) {
			esperando.add(matricula);
			return ResultadoEstacionamiento.ESPERANDO;
		}
		return ResultadoEstacionamiento.RECHAZADO;

	}

	public double retirarVehiculo(String matricula) {
		if (!estacionados.containsKey(matricula) && !esperando.contains(matricula)) {
			throw new IllegalArgumentException(
					String.format("El vehículo con la matrícula <%s> no está en el estacionamiento.", this.matricula));
		}
		if (!estacionados.containsKey(matricula) && esperando.contains(matricula)) {
			throw new IllegalArgumentException(String.format(
					"No se puede retirar el vehículo con matrícula <%s> porque no ha accedido aún al estacionamiento. Está esperando para acceder.”",
					this.matricula));
		}
		
		LocalDateTime fechaEstacionamiento = estacionados.get(matricula);
		
		long tiempoEstacionadoSg = ChronoUnit.SECONDS.between(fechaEstacionamiento, LocalDateTime.now());
		
		double importe = 0;
		
		if(tiempoEstacionadoSg > tiempoCortesia) {
			importe = tiempoEstacionadoSg * this.precioSegundoCentimos;
			importe= importe/100;
	
		}
		estacionados.remove(matricula);
		
		if(!esperando.isEmpty()) {
			String matruculaNuevoAcceso = esperando.remove();
			estacionados.put(matruculaNuevoAcceso, fechaEstacionamiento);
		}
		
		return importe;
	}
	
//	public boolean hayPlazasLibres() {
//		hay métodos que faltan 
//	}
	
	public Collection<String> getMatriculasEstacionados(){
		return Collections.unmodifiableCollection(new TreeSet<>(estacionados.keySet()));
	}

}
