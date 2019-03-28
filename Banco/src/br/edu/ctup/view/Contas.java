package br.edu.ctup.view;

import java.util.Scanner;

import br.edu.ctup.controller.ControllerCBancaria;

public class Contas {

	static Scanner ler = new Scanner(System.in);
	
	static ControllerCBancaria controllerCBancaria = new ControllerCBancaria();
	
	public static void cadCBancaria(){
		System.out.print("Digite seu Nome: ");
		String cliente = ler.next();
		System.out.print("Digite sua Conta: ");
		int conta = ler.nextInt();
		controllerCBancaria.cadCBancaria(cliente, conta);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Insira seus dados para iniciar:");
		cadCBancaria();
		System.out.println(controllerCBancaria.verDados());

	}

}
