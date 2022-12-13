package com.ifsc.tds.samara.leticia;

public class Endereco {
	private String rua;
	private String cep;
	private String cidade;
	private String estado;
	
	public Endereco(){}
	

	public String toString() {
		String string;
    	string = "Rua = " + this.rua + "Cep = " + this.cep + "cidade = " + this.cidade + "Estado = " + this.estado;
    	return string;
	}
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
