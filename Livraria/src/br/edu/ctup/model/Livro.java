package br.edu.ctup.model;

public class Livro {

	private String nome;
	private String autor;
	private int num_exemplares;
	private float preco;
	private String editora;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNum_exemplares() {
		return num_exemplares;
	}
	public void setNum_exemplares(int num_exemplares) {
		this.num_exemplares = num_exemplares;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
		
	 public double calculaPrecoFinal() {
		 double preco_final = this.preco * 1.2;
		 return preco_final; 
	 }
	
	public String toString() {
		return "\nNome do Livro: " + this.nome + "\n" +
				"Autor: " + this.autor + "\n" +
				"Número de Exemplares: " + this.num_exemplares + "\n" +
				"Preço: " + this.preco + "\n" +
				"Editora: " + this.editora + "\n";
	}
	
}
