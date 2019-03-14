package br.edu.ctup.view;

import java.util.Scanner;

import br.edu.ctup.controller.ControllerCliente;
import br.edu.ctup.model.Cliente;

public class Principal {
	
	static Scanner ler = new Scanner(System.in);

	static Cliente cliente;
	
	static ControllerCliente controllerCliente = new ControllerCliente();
	
	
	public static void cadCliente() {
		cliente = new Cliente();
		
		System.out.print("Digite seu Nome:");
		cliente.setNome(ler.nextLine());
		
		System.out.print("Digite seu Login:");
		cliente.setLogin(ler.nextLine());
		
		System.out.print("Digite sua Senha:");
		cliente.setSenha(ler.nextLine());
		
		controllerCliente.cadastrarCliente(cliente);
	}
	
	public static void menu() {
		int op = -1;
		while(op != 0) {
			System.out.println("1 - Cadastrar Cliente.");
			System.out.println("2 - Fazer Login.");
			System.out.println("0 - Sair.");
			System.out.print("Opção: ");
			int opcao = ler.nextInt();
			
			switch(opcao) {
			case 1:
				break;
			case 2:
				break;
			case 0:
				op = 0;
				System.out.println("\n== Sistema Encerrado ==");
				break;
			default:
				System.out.println("\nOpção Invalida!\n");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
	
		menu();

	}

}
