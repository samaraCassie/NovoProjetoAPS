package com.ifsc.tds.samara.leticia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Cliente> todosClientes = new ArrayList<Cliente>();
		List<Endereco> todosEnderecos = new ArrayList<Endereco>();
		Scanner teclado = new Scanner(System.in);
		int opcao = 0, cont=0, cont2=0;
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
				todosEnderecos.add(cont, endereco);
				todosClientes.add(cont, cliente);
				cont++;
			}
			if (opcao==2) {
				System.out.println("ID do Cliente: ");
				id = teclado.nextInt();
				Cliente cliente = todosClientes.get(id);
				System.out.println("ID do Endereco");
				id = teclado.nextInt();
				Endereco endereco = todosEnderecos.get(id);
				System.out.println("Insira um ID para Unidade Consumidora: ");
				id = teclado.nextInt();
				System.out.println("Leitura Atual");
				atual = teclado.nextInt();
				UC uc = new UC(cont2, atual, cliente, endereco);
				cont2++;
			}
			if (opcao==3) {
				try {
					System.out.println("[1] Informar a leitura atual");
				    uc.getLeituraAtual();
				} catch (Exception e) {
					System.out.println("Verifique se Unidade Cosumidora foi inserida.");
				}
			}
			if (opcao==4){
				try {
					uc.faturar();
				} catch (Exception e) {
					System.out.println("Verifique se Unidade Cosumidora foi inserida.");
				}
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
