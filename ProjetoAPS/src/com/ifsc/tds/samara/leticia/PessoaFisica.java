package com.ifsc.tds.samara.leticia;

public class PessoaFisica extends Cliente{
	private String cpf;
	
	public PessoaFisica(int id, String n, Endereco e, String cpf) {
		super(id, n, e);
		setCpf(cpf);
	}
	
	public String toString() {
    	String string;
    	string = "CPF = " + this.cpf;
    	return string;
    }

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
