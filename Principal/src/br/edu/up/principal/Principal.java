package br.edu.up.principal;

import java.util.Scanner;

public class Principal {

	static Scanner ler = new Scanner(System.in);
	
	public static int perguntaQNT(String iten) {
		int qnt=0;
		System.out.print("\nQual a quantidade de "+iten+": ");
		qnt = ler.nextInt();
		System.out.println();
		return qnt;
	}
	
	public static double verificaValorTotal(double valor) {
		double valor_pag = 0;
		String resultado = String.format("%.2f", valor);
		System.out.println("\nO valor total é: R$ " + resultado);
		System.out.print("Valor Pago: ");
		valor_pag = ler.nextDouble();
		return valor_pag;
	}
	
	public static void verificaTroco(double valor) {
		double troco = 0;
		double valor_pag = verificaValorTotal(valor);
		
		if(valor == valor_pag) {
			troco = 0;
		}else if(valor > valor_pag) {
			troco = valor_pag - valor;
		}else if (valor < valor_pag) {
			troco = valor_pag - valor;
		}
		
		String res = String.format("%.2f", troco); // comando para limitar a quantidade de casas decimais
		if(troco < 0) {
			String resN = String.format("%.2f", troco*-1);
			System.out.println("\nEstá faltando: R$ "+ resN);
			verificaTroco(valor);
		}else if (troco > 0) {
			System.out.println("Troco: R$ "+ res);
		}else{
			System.out.println("Troco: R$ "+ res);
		}

	}
	
	public static int comprarOutroItem() {
		int op = -1;
		System.out.println("Deseja comprar outro Item?");
		System.out.println("1 - Sim.");
		System.out.println("0 - Não.");
		System.out.print("Opção: ");
		op = ler.nextInt();
		if(op < 0 || op > 1) {
			comprarOutroItem();
		}
		return op;
	}
	
	public static void menuPrincipal(double valor) {
		int op = -1;
		int qnt = 0;
		while(op != 0) {
			System.out.println("\n===== Maquina de Café =====");
			System.out.println("1 - Café............R$ 1,00");
			System.out.println("2 - Café c/ Leite...R$ 3,00");
			System.out.println("3 - Chocolate.......R$ 3,50");
			System.out.println("4 - Leite...........R$ 1,50");
			System.out.println("0 - Sair");
			System.out.print("Opção: ");
			op = ler.nextInt();
			
			switch (op) {
			case 1:
				qnt = perguntaQNT("Café");
				valor += 1 * qnt;
				if(comprarOutroItem() == 1) {
					menuPrincipal(valor);
				}
				verificaTroco(valor);
				System.out.println("===== Venda Finalizada =====");
				valor = 0;
				break;
				
			case 2:
				qnt = perguntaQNT("Café c/ Leite");
				valor += 3 * qnt;
				if(comprarOutroItem() == 1) {
					menuPrincipal(valor);
				}
				verificaTroco(valor);
				System.out.println("Venda Finalizada.");
				valor = 0;
				break;
				
			case 3:
				qnt = perguntaQNT("Chocolate");
				valor += 3.5 * qnt;
				if(comprarOutroItem() == 1) {
					menuPrincipal(valor);
				}
				verificaTroco(valor);
				System.out.println("Venda Finalizada.");
				valor = 0;
				break;
				
			case 4:
				qnt = perguntaQNT("Leite");
				valor += 1.5 * qnt;
				if(comprarOutroItem() == 1) {
					menuPrincipal(valor);
				}
				verificaTroco(valor);
				System.out.println("Venda Finalizada.");
				valor = 0;
				break;
			
			case 0:
				op=0;
				break;
		
			default:
				System.out.print("\nOpção Inválida!\n\n");
				break;
			}		
		}
	}
	
	public static void main(String[] args) {
		
		menuPrincipal(0);
		
	}

}
