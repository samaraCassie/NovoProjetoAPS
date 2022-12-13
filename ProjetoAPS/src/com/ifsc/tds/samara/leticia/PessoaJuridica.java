package com.ifsc.tds.samara.leticia;

public class PessoaJuridica extends Cliente{
	private String cnpj;
	
	public PessoaJuridica() {}
	
	public String toString() {
		String string;
    	string = "CNPJ = " + this.cnpj;
    	return string;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
