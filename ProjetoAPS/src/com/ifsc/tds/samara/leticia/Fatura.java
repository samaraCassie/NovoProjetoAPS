package com.ifsc.tds.samara.leticia;

public class Fatura {
	private int faturaId;
	private int mesAno;
	private int consumo;
	private boolean pago;
	private UC unidadeConsumidora;
	private Fatura vetor[] = new Fatura[10];;
	
	public Fatura() {}
	
	public double calcularValorFatura() {
		return 0;
	}

	public void imprimirFatura(Fatura vetor[]) {
	}
	
	public String toString() {
		return null;
	}

	public int getFaturaId() {
		return faturaId;
	}

	public void setFaturaId(int faturaId) {
		this.faturaId = faturaId;
	}

	public int getMesAno() {
		return mesAno;
	}

	public void setMesAno(int mesAno) {
		this.mesAno = mesAno;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public UC getUnidadeConsumidora() {
		return unidadeConsumidora;
	}

	public void setUnidadeConsumidora(UC unidadeConsumidora) {
		this.unidadeConsumidora = unidadeConsumidora;
	}

	public Fatura[] getVetor() {
		return vetor;
	}

	public void setVetor(Fatura[] vetor) {
		this.vetor = vetor;
	}

}
