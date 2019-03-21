package br.edu.ctup.view;

import java.util.Scanner;
import br.edu.ctup.controller.ControllerCliente;
import br.edu.ctup.model.Cliente;

public class Loja_Principal {
	
	static Scanner ler = new Scanner(System.in);
	
	static ViewCliente viewCliente = new ViewCliente();
	
	static ViewBrinquedo viewBrinquedo = new ViewBrinquedo();
	
	static String lixoTeclado; // variavel para ler o "enter" do teclado.
	
	
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
				viewCliente.cadCliente();
				break;
			case 2:
				int validar = viewCliente.logar();
				if(validar == -1) {
					System.out.println("Usuário e/ou Senha Incorreto! Tente Novamente.");
				}else {
					menuPrincipal(validar);
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
	
	public static void menuPrincipal(int indice) {
		int op = -1;
		while(op != 0) {
			System.out.println("\n=== Menu Principal ===");
			System.out.println("1 - Cadastrar Brinquedos.");
			System.out.println("2 - Editar Brinquedos.");
			System.out.println("3 - Visualizar Brinquedos.");
			System.out.println("4 - Menu Cliente.");
			System.out.println("0 - Logout.");
			System.out.print("Opção: ");
			op = ler.nextInt();
			switch(op) {
			case 1:
				viewBrinquedo.cadBrinquedo();
				break;
			case 2:
				viewBrinquedo.editaBrinquedo();
				break;
			case 3:
				//System.out.println(viewBrinquedo.controllerBrinquedo.mostrarTodosBrinquedos());
				viewBrinquedo.controllerBrinquedo.mostrarTodosBrinquedos();
				break;
			case 4:
				viewCliente.menuCliente(indice);
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
	
	public static void main(String[] args) {
	
		menu();

	}

}

