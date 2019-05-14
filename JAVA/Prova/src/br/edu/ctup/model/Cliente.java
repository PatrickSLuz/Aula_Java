package br.edu.ctup.model;

public class Cliente {
	private String nome, senha, cpf, rg;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String buscaCpf() {
		return "\n NOME: "+this.nome+"\nCPF:"+this.cpf+"\n SENHA: "+this.senha;
	}
	
	public String toString() {
		return "\n NOME: "+this.nome+"\nCPF:"+this.cpf+"\n";
	}
	
}
