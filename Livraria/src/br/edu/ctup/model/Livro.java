package br.edu.ctup.model;

import java.util.ArrayList;

public class Livro {

	private String nome;
	private String autor;
	private int num_exemplares;
	private float preco;
	private String editora;
	
	public Livro(String nome, String autor, int num_exemplares, float preco, String editora) {
		this.nome = nome;
		this.autor = autor;
		this.num_exemplares = num_exemplares;
		this.preco = preco;
		this.editora = editora;
	}
	
	public Livro() {
		
	}
	
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
	 
	 public void pesqLivro(ArrayList<Livro> lv, String nome_livro) {
		 boolean achou = false;
		 for (int i = 0; i < lv.size(); i++) {
			 if(lv.get(i).nome.equals(nome_livro)) {
				 System.out.print(lv.get(i).toString());
				 achou = true;
				 i = lv.size() + 1;
			 }
		}
		 if(!achou) {
			System.out.println("\nEste livro não exite!"); 
		 }
	 }
	
	 public String toString() {
		 return "\n=================================\n" +
				"Nome do Livro: " + this.nome + "\n" +
				"Autor: " + this.autor + "\n" +
				"Número de Exemplares: " + this.num_exemplares + "\n" +
				"Preço: " + this.preco + "\n" +
				"Editora: " + this.editora + "\n" +
				"Preço Final: " + calculaPrecoFinal() +
				"\n=================================\n";
	 }
	
}
