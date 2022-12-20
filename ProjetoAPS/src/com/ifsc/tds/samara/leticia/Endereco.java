package com.ifsc.tds.samara.leticia;

public class Endereco {
	private int EnderecoID;
	private String rua;
	private int numero;
	private String cep;
	private String cidade;
	private String estado;
	
	public Endereco(int id, String rua, int num, String cep, String cid, String est){
		setEnderecoId(id);
		setRua(rua);
		setNumero(num);
		setCep(cep);
		setCidade(cid);
		setEstado(est);
	}
	
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

	public int getNumero(){
		return numero;
	}

	public void setNumero(int num){
		this.numero = num;
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

	public void setEnderecoId(int id){
		this.EnderecoID = id;
	}

	public int getEnderecoId(){
		return EnderecoID;
	}
}
