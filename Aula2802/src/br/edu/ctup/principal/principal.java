package br.edu.ctup.principal;

import java.util.Scanner;

import br.edu.ctup.model.Aluno;

public class principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		Aluno aluno = new Aluno(); // instancia - criando o objeto da classe Aluno.
		
		
		System.out.print("Digite nome aluno: ");
		String nomeAluno = sc.nextLine();
		aluno.setNome(nomeAluno);
		
		System.out.print("Digite cpf aluno: ");
		long cpfAluno = sc.nextLong();
		aluno.setCpf(cpfAluno);
		
		System.out.println("Nome: "+ aluno.getNome());
		System.out.println("CPF: "+ aluno.getCpf());
	}
	
}
