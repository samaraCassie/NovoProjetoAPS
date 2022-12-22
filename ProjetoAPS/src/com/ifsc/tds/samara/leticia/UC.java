package com.ifsc.tds.samara.leticia;

public class UC {
	private int ucId;
	private int leituraAnterior;
	private int leituraAtual;
	private Cliente cliente;
	private Endereco endereco;
	
	public UC(int id, int atual, Cliente cliente, Endereco endereco) {
		setUcId(id);
		setLeituraAtual(atual);
		setCliente(cliente);
		setEndereco(endereco);
	}

	public String toString() {
		String string;
    	string = "ID = " + this.ucId + "\nLeitura Anterior = " + this.leituraAnterior + "\nLeitura Atual = " + this.leituraAtual + "\nCliente = " + this.cliente + "\nEndereco = " + this.endereco;
    	return string;
	}
	
	public int faturar(int leituraCorrente) {
		this.leituraAnterior=this.leituraAtual;
		this.leituraAtual=leituraCorrente;
		int consumo=pegarConsumo();
		return consumo;
	}
	
	public int pegarConsumo() {
		int consumo;
		consumo=this.leituraAtual-this.leituraAnterior;
		return consumo;
	}
	
	public int getUcId() {
		return ucId;
	}
	public void setUcId(int ucId) {
		this.ucId = ucId;
	}
	public int getLeituraAnterior() {
		return leituraAnterior;
	}
	public void setLeituraAnterior(int leituraAnterior) {
		this.leituraAnterior = leituraAnterior;
	}
	public int getLeituraAtual() {
		return leituraAtual;
	}
	public void setLeituraAtual(int leituraAtual) {
		this.leituraAtual = leituraAtual;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}