package br.edu.ctup.view;

import java.util.Scanner;

import br.edu.ctup.model.Calculadora;

public class Principal {

	private static Scanner ler;

	public static void main(String[] args) {
		
		ler = new Scanner(System.in);
		
		Calculadora calc = new Calculadora();
		
		float n1, n2;
		
		System.out.print("Digite um Numero: ");
		n1 = ler.nextFloat();
		
		System.out.print("Digite outro Numero: ");
		n2 = ler.nextFloat();
		
		System.out.println("Soma:\t\t" + n1 + " + " + n2 + " = " + calc.soma(n1,n2));
		System.out.println("Subtração:\t" + n1 + " - " + n2 + " = " + calc.subtracao(n1,n2));
		System.out.println("Divisão:\t" + n1 + " / " + n2 + " = " + calc.divisao(n1,n2));
		System.out.println("Multiplicação:\t" + n1 + " x " + n2 + " = " + calc.multiplicacao(n1,n2));

	}

}
