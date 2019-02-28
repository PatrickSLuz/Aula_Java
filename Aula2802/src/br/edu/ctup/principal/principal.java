package br.edu.ctup.principal;

import java.util.Scanner;

import br.edu.ctup.model.Aluno;

public class principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		Aluno aluno = new Aluno(); // instancia - criando o objeto da classe Aluno // instanciando um objeto aluno.
		
		
		System.out.print("Digite nome aluno: ");
		String nomeAluno = sc.nextLine();
		aluno.setNome(nomeAluno); // SET - armazenando o dado no objeto
		
		System.out.print("Digite cpf aluno: ");
		long cpfAluno = sc.nextLong();
		aluno.setCpf(cpfAluno);
		
		System.out.println("Nome: "+ aluno.getNome()); // GET - pegando o dado da classe.
		System.out.println("CPF: "+ aluno.getCpf());
	}
	
}
