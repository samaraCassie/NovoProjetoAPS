package com.ifsc.tds.samara.leticia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Cliente> todosClientes = new ArrayList<Cliente>();
		List<Endereco> todosEnderecos = new ArrayList<Endereco>();
		Scanner teclado = new Scanner(System.in);
		int opcao = 0, cont=1, cont2=1;
		int id, num, atual;
		String nome, rua, cep, cidade, estado;

		System.out.println("\t[1] Cadastrar Cliente\n");
		System.out.println("\t[2] Cadastrar Unidade Consumidora\n");
		System.out.println("\t[1] Fazer Leitura\n");
		System.out.println("\t[1] Faturar Consumo\n");
		System.out.println("\t[1] Exibir Consumo\n");
		System.out.println("\t[1] Sair\n");
		opcao = teclado.nextInt();
		
		while (opcao!=0) {
			if(opcao==1){
				System.out.println("Nome do cliente: ");
				nome = teclado.next();
				System.out.println("ID do cliente" );
				id = teclado.nextInt();
				System.out.println("\n-----------------------\nEndereço");
				System.out.println("Rua: ");
				rua = teclado.next();
				System.out.println("Numero: ");
				num = teclado.nextInt();
				System.out.println("CEP: ");
				cep = teclado.next();
				System.out.println("Cidade: ");
				cidade = teclado.next();
				System.out.println("Estado: ");
				estado = teclado.next();

				Endereco endereco = new Endereco(cont, rua, num, cep, cidade, estado);
				Cliente cliente = new Cliente(cont, nome, endereco);
				todosEnderecos.add(endereco);
				todosClientes.add(cliente);
				cont++;
				
			}
			

			System.out.println("\t[1] Cadastrar Cliente\n");
			System.out.println("\t[2] Cadastrar Unidade Consumidora\n");
			System.out.println("\t[1] Fazer Leitura\n");
			System.out.println("\t[1] Faturar Consumo\n");
			System.out.println("\t[1] Exibir Consumo\n");
			System.out.println("\t[1] Sair\n");
			opcao = teclado.nextInt();
		}
		teclado.close();
	}
}
