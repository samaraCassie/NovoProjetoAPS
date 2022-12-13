package com.ifsc.tds.samara.leticia;

public class Cliente {
	private int clienteId;
    private String nome;
    private Endereco endereco;

    public Cliente() {}

    public String toString() {
     String string;
     string = "ID = " + this.clienteId + "Nome = " + this.nome + "Endereco = " + this.endereco;
    	
        return string;
    }

    public int getClienteId() {
        return clienteId;
    }
    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
