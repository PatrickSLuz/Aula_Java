package br.edu.ctup.model;

import java.util.ArrayList;

public class Pessoa {
	
	private String nome;
	private String rg;
	private Endereco endereco;
	private String login;
	private String senha;
	
	public Pessoa(String nome, String rg, Endereco endereco, String login, String senha) {
		this.nome = nome;
		this.rg = rg;
		this.endereco = endereco;
		this.login = login;
		this.senha = senha;
	}
	
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String validarLogin(ArrayList<Pessoa> ps, String login, String senha){
		boolean result = false;
		 for (int i = 0; i < ps.size(); i++) {
			 if(ps.get(i).login.equals(login) && ps.get(i).senha.equals(senha)) {
				 i = ps.size() + 1;
				 result =  true;
			 }
		 }
		 return String.valueOf(result);

	}
	
	
	public String toString() {
		return "\n=================================\n" +
				"Nome: " + this.nome + "\n" +
				"RG: " + this.rg + "\n" +
				"Endereço: \n" + endereco + "\n" +
				"Login: " + this.login +
				"\n=================================\n";
	}
	
}
