package br.edu.ctup.view;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ctup.model.Livro;
import br.edu.ctup.model.Pessoa;

public class Principal {
	
	static Scanner ler = new Scanner(System.in);
	
	static Livro livro = new Livro();
	static ArrayList<Livro> array_livro = new ArrayList<Livro>();
	
	static Pessoa pessoa = new Pessoa();
	static ArrayList<Pessoa> array_pessoa = new ArrayList<Pessoa>();

	static String lixo;// para "limpar" o buffer do teclado - le o enter
	
	public static void cadLivro() {
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
	
	public static void pesqLivro() {
		lixo = ler.nextLine();// para "limpar" o buffer do teclado - le o enter
		System.out.println("\n==== Pesquisar Livros ====");
		System.out.print("Digite o nome do Livro: ");
		String pesqNome = ler.nextLine();
		livro.pesqLivro(array_livro, pesqNome);
	}
	
	public static void cadCliente() {
		 lixo = ler.nextLine();// para "limpar" o buffer do teclado - le o enter
		 System.out.println("\n=== Cadastro de Cliente ===");
		 System.out.print("Digite o nome: ");
		 String nome = ler.nextLine();
		 System.out.print("Digite o RG: ");
		 String rg = ler.nextLine();
		 System.out.print("Digite o Endereço: ");
		 String endereco = ler.nextLine();
		 System.out.print("Digite o Login: ");
		 String login = ler.nextLine();
		 System.out.print("Digite a senha: ");
		 String senha = ler.nextLine();
		 array_pessoa.add(new Pessoa(nome, rg, endereco, login, senha));
	}
	
	public static void verCliente() {
		System.out.println("\n=== Clientes Cadastrados ===");
		for (Pessoa objPessoa : array_pessoa) {
			System.out.print(objPessoa);
		}
	}
	
	public static void logar() {
		lixo = ler.nextLine();// para "limpar" o buffer do teclado - le o enter
		System.out.println("\n========= Login =========");
		System.out.print("Login: ");
		String login = ler.nextLine();
		System.out.print("Senha: ");
		String senha = ler.nextLine();
		if(pessoa.validarLogin(array_pessoa, login, senha)=="true") {
			System.out.println("\nLogado com Sucesso!");
		}else {
			System.out.println("\nFalha no Login! Tente Novamente");
		}
	}
	
	public static void menuPrincipal() {
		int op = -1;
		while (op != 0) {
			System.out.println("\n========== Menu ==========");
			System.out.println("1 - Cadastrar um Livro.");
			System.out.println("2 - Visualizar os Livros.");
			System.out.println("3 - Pesquisar um Livro.");
			System.out.println("4 - Cadastrar Cliente.");
			System.out.println("5 - Visualizar os Clientes.");
			System.out.println("6 - Fazer Login.");
			System.out.println("0 - Sair");
			System.out.print("Opção: ");
			int opcao = ler.nextInt();
			
			switch(opcao) {
				case 1:
					cadLivro();
					break;
				case 2:
					verLivro();
					break;
				case 3:
					pesqLivro();
					break;
				case 4:
					cadCliente();
					break;
				case 5:
					verCliente();
					break;
				case 6:
					logar();
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
		
		menuPrincipal();
		
	}

}