package br.edu.ctup.view;

import java.util.Scanner;

import br.edu.ctup.controller.ControllerBrinquedo;
import br.edu.ctup.model.Brinquedo;
import br.edu.ctup.model.Cliente;

public class ViewBrinquedo {
	
	static Scanner ler = new Scanner(System.in);
	
	static Brinquedo brinquedo;
	
	static ControllerBrinquedo controllerBrinquedo = new ControllerBrinquedo();
	
	static String lixoTeclado; // variavel para ler o "enter" do teclado.
	
	public void cadBrinquedo(){
		brinquedo = new Brinquedo(); // criando um Brinquedo novo.
		
		lixoTeclado = ler.nextLine(); // criando um Brinquedo novo.
		
		System.out.println("\n=== Cadastrar Brinquedo ===");
		
		System.out.print("Digite o Nome: ");
		brinquedo.setNome(ler.nextLine());
		
		System.out.print("Digite a Descrição: ");
		brinquedo.setDescricao(ler.nextLine());
		
		System.out.print("Digite o Preço: R$ ");
		brinquedo.setPreco(ler.nextDouble());
		
		System.out.print("Digite o Estoque: ");
		brinquedo.setEstoque(ler.nextInt());
		
		controllerBrinquedo.cadastrarBrinquedo(brinquedo);
	}
	
	public static void editaBrinquedo() {
		brinquedo = new Brinquedo();
		
		System.out.println("\n=== Editar Brinquedo ===");
		
		System.out.print("Digite o ID do brinquedo: ");
		int id = ler.nextInt();
		
		System.out.println("\n=== O que deseja fazer ===");
		System.out.println("1 - Editar dados do Brinquedo.");
		System.out.println("2 - Entrada de Estoque.");
		System.out.println("0 - Voltar.");
		System.out.print("Opção: ");
		int op = ler.nextInt();
		
		int editou_estoque = -1;
		switch(op) {
			case 1:
				editou_estoque=0;
				lixoTeclado = ler.nextLine(); // variavel para ler o "enter" do teclado.
				System.out.print("\nNova Descrição: ");
				brinquedo.setDescricao(ler.nextLine());
				
				System.out.print("Novo Preço: R$ ");
				brinquedo.setPreco(ler.nextDouble());
				break;
			case 2:
				editou_estoque=1;
				System.out.print("\nNovo Estoque: ");
				brinquedo.setEstoque(ler.nextInt());
				break;
			default:
				System.out.println("\nOpção Invalida!\n");
				break;
		}
		if(editou_estoque > -1) {
			controllerBrinquedo.alterarDadosBrinquedo(brinquedo, id, editou_estoque);
		}
		
	}
	
	public void buscarBrinquedo() {
		lixoTeclado = ler.nextLine(); // variavel para ler o "enter" do teclado.
		System.out.println("\n=== Buscar Brinquedo ===");
		
		System.out.print("Digite o Nome do Brinquedo:");
		String nome_busca = ler.nextLine();
	
		System.out.println(controllerBrinquedo.buscaBrinquedo(nome_busca));
		
	}
	
}
