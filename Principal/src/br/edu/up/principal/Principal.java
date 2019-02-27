package br.edu.up.principal;

import java.util.Scanner;

public class Principal {

	
	
	public static int perguntaQNT(String iten) {
		Scanner sc = new Scanner(System.in);
		int qnt=0;
		System.out.print("Qual a quantidade de "+iten+": ");
		qnt = sc.nextInt();
		return qnt;
	}
	
	public static double verificaTroco(double valor) {
		Scanner sc = new Scanner(System.in);
		double troco=0;
		double valor_pag=0;
		String resultado = String.format("%.2f", valor);
		System.out.println("O valor total é: R$ " + resultado);
		System.out.print("Valor Pago: ");
		valor_pag = sc.nextDouble();
		
		if(valor == valor_pag) {
			troco = 0;
		}else if(valor > valor_pag) {
			troco = valor_pag - valor;
		}else if (valor < valor_pag) {
			troco = valor_pag - valor;
		}
		
		return troco;
	}
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int op = -1;
		double valor = 0, troco = 0;
		int qnt=0;
		
		while(op != 0) {
			System.out.println("\n=== Maquina de Café ===");
			System.out.println("1 - Café: R$ 1,00");
			System.out.println("2 - Café c/ Leite: R$ 3,00");
			System.out.println("3 - Chocolate: R$ 3,50");
			System.out.println("4 - Leite: R$ 1,50");
			System.out.println("0 - Sair");
			System.out.print("Opção: ");
			op = ler.nextInt();
			
			switch (op) {
			case 1:
				qnt = perguntaQNT("Café");
				valor =1 *qnt;
				troco = verificaTroco(valor);
				String res = String.format("%.2f", troco);
				if(troco < 0) {
					String resN = String.format("%.2f", troco*-1);
					System.out.println("Está faltando: R$ "+ resN);
				}else if (troco > 0) {
					System.out.println("Troco: R$ "+ res);
				}else{
					System.out.println("Troco: R$ "+ res);
				}
				System.out.println("Venda Finalizada.");
				break;
				
			case 2:
				qnt = perguntaQNT("Café c/ Leite");
				valor = 3 * qnt;
				troco = verificaTroco(valor);
				String res2 = String.format("%.2f", troco);
				if(troco < 0) {
					String resN2 = String.format("%.2f", troco*-1);
					System.out.println("Está faltando: R$ "+ resN2);
				}else if (troco > 0) {
					System.out.println("Troco: R$ "+ res2);
				}else{
					System.out.println("Troco: R$ "+ res2);
				}
				System.out.println("Venda Finalizada.");
				break;
				
			case 3:
				qnt = perguntaQNT("Chocolate");
				valor = 3.5 * qnt;
				troco = verificaTroco(valor);
				String res3 = String.format("%.2f", troco);
				if(troco < 0) {
					String resN3 = String.format("%.2f", troco*-1);
					System.out.println("Está faltando: R$ "+ resN3);
				}else if (troco > 0) {
					System.out.println("Troco: R$ "+ res3);
				}else{
					System.out.println("Troco: R$ "+ res3);
				}
				System.out.println("Venda Finalizada.");
				break;
				
			case 4:
				qnt = perguntaQNT("Leite");
				valor = 1.5 * qnt;
				troco = verificaTroco(valor);
				String res4 = String.format("%.2f", troco);
				if(troco < 0) {
					String resN4 = String.format("%.2f", troco*-1);
					System.out.println("Está faltando: R$ "+ resN4);
					
					
				}else if (troco > 0) {
					System.out.println("Troco: R$ "+ res4);
				}else{
					System.out.println("Troco: R$ "+ res4);
				}
				System.out.println("Venda Finalizada.");
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

}
