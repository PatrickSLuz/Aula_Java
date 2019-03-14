package br.edu.ctup.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.ctup.model.Endereco;
import br.edu.ctup.model.Livro;
import br.edu.ctup.controller.ControllerCliente;
import br.edu.ctup.model.Cliente;

public class Principal {
	
	static Livro livro = new Livro();
	static ArrayList<Livro> array_livro = new ArrayList<Livro>();
	
	static Cliente pessoa = new Cliente();
	
	static Endereco endereco = new Endereco();
	static List<Endereco> array_endereco = new ArrayList<Endereco>();
	
	static ControllerCliente controllerCliente = new ControllerCliente();

	static String lixo;// para "limpar" o buffer do teclado - le o enter
	
	public static void cadLivro(Scanner ler) {
		lixo = ler.nextLine();// para "limpar" o buffer do teclado - le o enter
		System.out.println("\n=== Cadastro de Livro ===");
		System.out.print("Digite o nome: ");
		String nome = ler.nextLine();
		System.out.print("Digite o autor: ");
		String autor = ler.nextLine();
		System.out.print("Digite o numero de exemplares: ");
		int num_exemplares = ler.nextInt();
		System.out.print("Digite o preço: ");
		float preco = ler.nextFloat();
		lixo = ler.nextLine();// para "limpar" o buffer do teclado - le o enter
		System.out.print("Digite a editora: ");
		String editora = ler.nextLine();
		array_livro.add(new Livro(nome, autor, num_exemplares, preco, editora));
	}
	
	public static void verLivro() {
		System.out.println("\n=== Livros Cadastrados ===");
		for (Livro objLivro : array_livro) {
			System.out.print(objLivro);
		}
	}
	
	public static void pesqLivro(Scanner ler) {
		lixo = ler.nextLine();// para "limpar" o buffer do teclado - le o enter
		System.out.println("\n==== Pesquisar Livros ====");
		System.out.print("Digite o nome do Livro: ");
		String pesqNome = ler.nextLine();
		livro.pesqLivro(array_livro, pesqNome);
	}
	
	public static void cadCliente(Scanner ler) {
		 pessoa = new Cliente();// criando um novo cliente para o cadastro
		 
		 lixo = ler.nextLine();// para "limpar" o buffer do teclado - le o enter
		 System.out.println("\n=== Cadastro de Cliente ===");
		 
		 System.out.print("Digite o nome: ");
		 pessoa.setNome(ler.nextLine());
		 
		 System.out.print("Digite o RG: ");
		 pessoa.setRg(ler.nextLine());
		 
		 System.out.println("Endereço: ");
		 System.out.print("Digite a rua: ");
		 endereco.setRua(ler.nextLine());
		 
		 System.out.print("Digite o bairro: ");
		 endereco.setBairro(ler.nextLine());
		 
		 System.out.print("Digite o numero: ");
		 endereco.setNumero(ler.nextInt());
		 
		 lixo = ler.nextLine();// para "limpar" o buffer do teclado - le o enter
		 System.out.print("Digite o Login: ");
		 pessoa.setLogin(ler.nextLine());
		 
		 System.out.print("Digite a senha: ");
		 pessoa.setSenha(ler.nextLine());
		 
		 pessoa.setEndereco(endereco);
		 
		 controllerCliente.cadastrarCLiente(pessoa);
	}
	
	public static void verCliente(Scanner ler) {
		System.out.println("\n=== Clientes Cadastrados ===");
		for (Cliente objPessoa : controllerCliente.listarClientes()) {
			System.out.print(objPessoa);
		}
	}
	
	public static void logar(Scanner ler) {
		lixo = ler.nextLine();// para "limpar" o buffer do teclado - le o enter
		System.out.println("\n========= Login =========");
		System.out.print("Login: ");
		String login = ler.nextLine();
		System.out.print("Senha: ");
		String senha = ler.nextLine();
		
		if(controllerCliente.autenticar(login, senha)) {
			System.out.println("\nLogado com Sucesso!");
			menuLogado(ler);
		}else {
			System.out.println("\nFalha no Login! Tente Novamente");
		}
		/*
		if(pessoa.validarLogin(controllerCliente.listarClientes(), login, senha)=="true") {
			System.out.println("\nLogado com Sucesso!");
		}else {
			System.out.println("\nFalha no Login! Tente Novamente");
		}
		*/
	}
	
	public static void menu(Scanner ler) {
		int op = -1;
		while (op != 0) {
			System.out.println("1 - Cadastrar Cliente.");
			System.out.println("2 - Fazer Login.");
			System.out.println("0 - Sair");
			System.out.print("Opção: ");
			int opcao = ler.nextInt();
			switch(opcao){
				case 1:
					cadCliente(ler);
					break;
				case 2:
					logar(ler);
					op = 0;
					break;
				case 0:
					op = 0;
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;	
			}
		}
	}
	
	public static void menuLogado(Scanner ler) {
		int op = -1;
		while (op != 0) {
			System.out.println("\n========== Menu ==========");
			System.out.println("1 - Cadastrar um Livro.");
			System.out.println("2 - Visualizar os Livros.");
			System.out.println("3 - Pesquisar um Livro.");
			System.out.println("4 - Visualizar os Clientes.");
			System.out.println("0 - Sair");
			System.out.print("Opção: ");
			int opcao = ler.nextInt();
			
			switch(opcao) {
				case 1:
					cadLivro(ler);
					break;
				case 2:
					verLivro();
					break;
				case 3:
					pesqLivro(ler);
					break;
				case 4:
					verCliente(ler);
					break;
				case 0:
					op = 0;
					System.out.println("\n=== Sistema encerrado ===\n");
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		menu(ler);
		
	}

}
