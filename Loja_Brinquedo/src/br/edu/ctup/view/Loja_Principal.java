package br.edu.ctup.view;

import java.util.Scanner;
import br.edu.ctup.controller.ControllerCliente;
import br.edu.ctup.model.Cliente;

public class Loja_Principal {
	
	static Scanner ler = new Scanner(System.in);

	static Cliente cliente;
	
	static ControllerCliente controllerCliente = new ControllerCliente();
	
	static String lixoTeclado; // variavel para ler o "enter" do teclado.
	
	public static void cadCliente() {
		cliente = new Cliente(); // criando um cliente novo.
		
		lixoTeclado = ler.nextLine(); // variavel para ler o "buffer" do teclado.
		
		System.out.println("\n=== Cadastrar Cliente ===");
		
		System.out.print("Digite seu Nome: ");
		cliente.setNome(ler.nextLine());
		
		System.out.print("Digite seu Login: ");
		cliente.setLogin(ler.nextLine());
		
		System.out.print("Digite sua Senha: ");
		cliente.setSenha(ler.nextLine());
		
		controllerCliente.cadastrarCliente(cliente);
	}
	
	public static void editaCliente(int indice) {
		cliente = new Cliente();
		lixoTeclado = ler.nextLine();
		
		System.out.print("Novo nome: ");
		cliente.setNome(ler.nextLine());
		
		System.out.print("Novo login: ");
		cliente.setLogin(ler.nextLine());
		
		System.out.print("Nova senha: ");
		cliente.setSenha(ler.nextLine());
		
		controllerCliente.alterarDadosCliente(cliente, indice);
	}
	
	public static int logar() {
		int result = 0;
		lixoTeclado = ler.nextLine();
		
		System.out.println("\n=== Fazer Login ===");
		
		System.out.print("Digite o Login: ");
		String login = ler.nextLine();
		System.out.print("Digite a Senha: ");
		String senha = ler.nextLine();
		
		int indice = controllerCliente.validarCliente(login, senha);
		if(indice > -1) {
			System.out.println("\nLogado com Sucesso!");
			menuPrincipal(indice);
		}else {
			System.out.println("\nFalha no Login!");
			result = 1;
		}
		return result;
	}
	
	public static void menu() {
		int op = -1;
		while(op != 0) {
			System.out.println("\n=== Menu ===");
			System.out.println("1 - Cadastrar Cliente.");
			System.out.println("2 - Fazer Login.");
			System.out.println("0 - Sair.");
			System.out.print("Opção: ");
			int opcao = ler.nextInt();
			
			switch(opcao) {
			case 1:
				cadCliente();
				break;
			case 2:
				int validar = logar();
				if(validar == 0) {
					op = 0;
				}
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
	
	public static void menuCliente(int indice) {
		int op = -1;
		while(op != 0) {
			System.out.println("\n=== Menu Cliente ===");
			System.out.println("1 - Alterar dados.");
			System.out.println("2 - Visualizar CLiente Logado.");
			System.out.println("3 - Visualizar CLientes.");
			System.out.println("0 - Sair do Menu Cliente");
			System.out.print("Opção: ");
			op = ler.nextInt();
			
			switch(op) {
			case 1:
				editaCliente(indice);
				break;
			case 2:
				System.out.print("\n=== Cliente Logado ===");
				System.out.println(controllerCliente.verClienteLogado(indice));
				break;
			case 3:
				System.out.println("\n=== Clientes ===");
				System.out.println(controllerCliente.mostrarTodosClientes());
				break;
			case 0: 
				op = 0;
				break;
			default:
				System.out.println("\nOpção Invalida!\n");
				break;
			}
		}
	}
	
	public static void menuPrincipal(int indice) {
		int op = -1;
		while(op != 0) {
			System.out.println("\n=== Menu Principal ===");
			System.out.println("1 - Cadastrar Brinquedos.");
			System.out.println("2 - Editar Brinquedos.");
			System.out.println("3 - Visualizar Brinquedos.");
			System.out.println("4 - Menu Cliente.");
			System.out.println("0 - Sair.");
			System.out.print("Opção: ");
			op = ler.nextInt();
			switch(op) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				menuCliente(indice);
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

