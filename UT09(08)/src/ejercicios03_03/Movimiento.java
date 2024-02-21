package ejercicios03_03;

import java.time.LocalDateTime;

public class Movimiento {

	private Tipo tipoMovimiento;
	private LocalDateTime fechaHoraMovimiento;
	private double saldoInicial;
	private double importe;
	private double saldoFinal;
	private String concepto;

	public Movimiento(Tipo tipoMovimiento, double saldoInicial, double importe, String concepto) {
		this.tipoMovimiento = tipoMovimiento;
		this.saldoInicial = saldoInicial;
		if (importe >= 0 && tipoMovimiento == Tipo.RETIRADA) {
			throw new IllegalArgumentException("SI QUIERES RETIRAR DINERO, EL IMPORTE DEBE SER NEGATIVO.");
		}
		if (importe < 0 && tipoMovimiento == Tipo.INGRESO) {
			throw new IllegalArgumentException("SI QUIERES INGRESAR DINERO, EL IMPORTE DEBE SER POSITIVO.");
		} else {
			this.importe = importe;
		}
		this.concepto = concepto;
		this.fechaHoraMovimiento = LocalDateTime.now();
		this.saldoFinal = saldoInicial + importe;
	}

	public Tipo getTipoMovimiento() {
		return tipoMovimiento;
	}

	public LocalDateTime getFechaHoraMovimiento() {
		return fechaHoraMovimiento;
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public double getImporte() {
		return importe;
	}

	public double getSaldoFinal() {
		return saldoFinal;
	}

	public String getConcepto() {
		return concepto;
	}

	@Override
	public String toString() {
		return String.format("<%s> %s - %.2f - %.2f - %.2f", this.fechaHoraMovimiento, this.tipoMovimiento,
				this.saldoInicial, this.importe, this.saldoFinal);
	}

}
