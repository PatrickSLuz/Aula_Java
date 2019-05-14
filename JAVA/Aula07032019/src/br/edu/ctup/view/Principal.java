package br.edu.ctup.view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import br.edu.ctup.model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner ler = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		
		String nome;
		int dia, mes, ano, idade;
		float altura;
		String dtNasc;
		String dtAtual = pessoa.getDataAtual();

		System.out.println("Data Atual: "+ dtAtual);
		
		
		System.out.print("Digite seu nome: ");
		nome = ler.nextLine();
		pessoa.setNome(nome);
		
		System.out.println("Digite sua data de Nascimento: ");
		System.out.print("Dia: ");
		dia = ler.nextInt();
		pessoa.setDiaNasc(dia);
		System.out.print("Mês: ");
		mes = ler.nextInt();
		pessoa.setMesNasc(mes);
		System.out.print("Ano: ");
		ano = ler.nextInt();
		pessoa.setAnoNasc(ano);
				
		System.out.print("Digite sua altura: ");
		altura = ler.nextFloat();
		pessoa.setAltura(altura);
		
		System.out.println("\n" + pessoa); // toString
		
		idade = pessoa.calculaIdade();
		
		if(idade < 16) {
			System.out.println(pessoa.getNome() + " tem " + idade + " anos. Portanto, você ainda não pode votar.");
		} else if(idade < 18) {
			System.out.println(pessoa.getNome() + " tem " + idade + " anos. Portanto, você pode votar.");
		} else if(idade <= 61) {
			System.out.println(pessoa.getNome() + " tem " + idade + " anos. Portanto, você é obrigado a votar.");
		}else {
			System.out.println(pessoa.getNome() + " tem " + idade + " anos. Portanto, o seu voto é facultativo.");
		}
		
		
		
	}
}
