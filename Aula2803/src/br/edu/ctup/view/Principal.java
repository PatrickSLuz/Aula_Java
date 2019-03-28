package br.edu.ctup.view;

import br.edu.ctup.model.Cliente;
import br.edu.ctup.model.Funcionario;
import br.edu.ctup.model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.setNome("Patrick");
		f.setNumCarteiraTrabalho(129456654);
		
		Cliente c = new Cliente();
		c.setCpf(1112223);
		c.setNome("Pedrin");
		
		System.out.println("Dados do Cliente\nNome: " + c.getNome());
		System.out.println("Dados do Funcionario\nNome: " + f.getNome());
	}

}

