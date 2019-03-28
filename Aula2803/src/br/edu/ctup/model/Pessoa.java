package br.edu.ctup.model;

public class Pessoa {
	
	private String nome ;
	private long cpf;
	private int rg;
	private String endereco;
		
	//metodo Construtor vazio.
	public Pessoa() {
		
	}
	//metodo Construtor.
	public Pessoa(String nome, long cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}

