package br.edu.ctup.model;

public class Brinquedo {

	private String nome;
	private String descricao;
	private double preco;
	private int estoque;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int qnt) {
		this.estoque = qnt;
	}
	
	public String toString() {
		String valor = String.format("%.2f", this.preco);
		return "\nNome: "+this.nome+"\n"+
				"Descricao: "+this.descricao+"\n"+
				"Preço: R$ "+valor+"\n"+
				"Estoque: "+this.estoque+"\n";
	}
	
}
