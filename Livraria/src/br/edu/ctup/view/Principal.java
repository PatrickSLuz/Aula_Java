package br.edu.ctup.view;

import java.util.Scanner;

import br.edu.ctup.model.Livro;

public class Principal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Livro livro = new Livro();
		
		System.out.println("\n==== Cadastro de Livro ====");
		System.out.print("Digite o nome: ");
		livro.setNome(ler.nextLine());
		System.out.print("Digite o autor: ");
		livro.setAutor(ler.nextLine());
		System.out.print("Digite o numero de exemplares: ");
		livro.setNum_exemplares(ler.nextInt());
		System.out.print("Digite o preço: ");
		livro.setPreco(ler.nextFloat());
		String lixo = ler.nextLine();// para "limpar" o buffer do teclado - le o enter
		System.out.print("Digite a editora: ");
		livro.setEditora(ler.nextLine());
		
		System.out.println(livro);

		System.out.println("Preço Final: " + livro.calculaPrecoFinal());
		
	}

}