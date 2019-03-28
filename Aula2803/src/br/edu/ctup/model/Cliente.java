package br.edu.ctup.model;

//Herança - esta classe esta herdando da outra classe.
//Cliente herdou a classe Pessoa.
public class Cliente extends Pessoa{

	private long numCartaoSaude;

	
	//metodo Construtor vazio.
	public Cliente() {
		
	}
	//metodo Construtor.
	public Cliente(String nome, long cpf) {
		super(nome, cpf);
	}
	
	public Cliente(String nome, long cpf, long numCartaoSaude) {
		super(nome, cpf);
		this.numCartaoSaude = numCartaoSaude; 
	}
	
	

	public long getNumCartaoSaude() {
		return numCartaoSaude;
	}

	public void setNumCartaoSaude(long numCartaoSaude) {
		this.numCartaoSaude = numCartaoSaude;
	}
	
}
