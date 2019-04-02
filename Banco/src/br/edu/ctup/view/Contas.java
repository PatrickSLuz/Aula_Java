package br.edu.ctup.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.edu.ctup.controller.ControllerCBancaria;
import br.edu.ctup.controller.ControllerCEspecial;
import br.edu.ctup.controller.ControllerCPoupanca;

public class Contas {

	static Scanner ler = new Scanner(System.in);
	
	static ControllerCBancaria controllerCBancaria = new ControllerCBancaria();
	static ControllerCPoupanca controllerCPoupanca = new ControllerCPoupanca();
	static ControllerCEspecial controllerCEspecial = new ControllerCEspecial();
	
	public static void cadCBancaria(){
		System.out.print("Digite seu Nome: ");
		String cliente = ler.next();
		int conta=0;
		while(conta == 0) {	
			ler = new Scanner(System.in);
			System.out.print("Digite sua Conta: ");
			try {
				conta = ler.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite somente numeros!");
			}
		}
		
		
		controllerCBancaria.cadCBancaria(cliente, conta);
	}
	
	public static int selecionarConta() {
		System.out.println("\n=== Selecione a Conta ===");
		System.out.println("1 - Conta Poupança.");
		System.out.println("2 - Conta Especial.");
		System.out.println("0 - Voltar.");
		System.out.print("Opção: ");
		int op = ler.nextInt();
		return op;
	}
	
	public static void varificaItemSelecionadoMenu(int menu) {
		int tipoConta = selecionarConta();
		switch(menu) {
		case 1:
			if(tipoConta == 1) {
				controllerCPoupanca.cadCPoupanca();
			}else if(tipoConta == 2) {
				controllerCEspecial.cadCEspecial();
			}
			break;
			
		case 2:
			if(tipoConta == 1) {
				
			}else if(tipoConta == 2) {
				
			}
			break;
			
		case 3:
			if(tipoConta == 1) {
				
			}else if(tipoConta == 2) {
				
			}
			break;
		}
	}
	
	public static void exibirContas() {
		System.out.println(controllerCBancaria.verDados());
		if(controllerCPoupanca.verDadosCPoupanca() != null) {
			System.out.println(controllerCPoupanca.verDadosCPoupanca());
		}
		if(controllerCEspecial.verDadosCEspecial() != null) {
			System.out.println(controllerCEspecial.verDadosCEspecial());
		}	
	}
	
	public static void main(String[] args) {
		
		System.out.println("Insira seus dados para iniciar:");
		cadCBancaria();
		
		int opcao = -1;
		
		while(opcao != 0) {
		
			System.out.println("\n==== Menu Principal ====");
			System.out.println("1 - Incluir dados para outra conta.");
			System.out.println("2 - Sacar.");
			System.out.println("3 - Depositar.");
			System.out.println("4 - Mostrar saldo a partir da taxa de rendimento da conta poupança.");
			System.out.println("5 - Mostrar os dados da(s) conta(s).");
			System.out.println("0 - Sair.");
			System.out.print("Opção: ");
			
			try {
				opcao = ler.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite somente numeros!");
			}
			
			switch(opcao) {
			case 1:
				varificaItemSelecionadoMenu(opcao);
				break;
			case 2:
				varificaItemSelecionadoMenu(opcao);
				break;
			case 3:
				varificaItemSelecionadoMenu(opcao);
				break;
			case 4:
				break;
			case 5:
				exibirContas();
				break;
			case 0:
				break;
			default:
				System.out.println("\nOpção Invalida!");
				break;
			}	
		}	

	}
}		


