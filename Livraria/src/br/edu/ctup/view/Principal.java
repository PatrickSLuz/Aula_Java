package br.edu.ctup.view;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ctup.model.Livro;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

public class Principal {
	
	static Scanner ler = new Scanner(System.in);
	
	static Livro livro = new Livro();
	
	static ArrayList<Livro> array_livro = new ArrayList();

	public static void cadLivro() {
		//int cod = 0;
		String lixo = ler.nextLine();// para "limpar" o buffer do teclado - le o enter
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
			System.out.print(objLivro.toString());
		}
	}
	
	public static void pesqLivro() {
		String lixo = ler.nextLine();// para "limpar" o buffer do teclado - le o enter
		System.out.println("\n==== Pesquisar Livros ====");
		System.out.print("Digite o nome do Livro: ");
		String pesqNome = ler.nextLine();
		livro.pesqLivro(array_livro, pesqNome);
	}
	
	public static void menuPrincipal() {
		int op = -1;
		while (op != 0) {
			System.out.println("\n========== Menu ==========");
			System.out.println("1 - Cadastrar um Livro.");
			System.out.println("2 - Visualizar os Livros.");
			System.out.println("3 - Pesquisar um Livro.");
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