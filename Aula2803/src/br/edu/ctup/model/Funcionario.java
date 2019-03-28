package br.edu.ctup.model;

// Heran�a - esta classe esta herdando da outra classe.
// Funcionario herdou a classe Pessoa
// Heran�a = extends.
public class Funcionario extends Pessoa{

	private long numCarteiraTrabalho;
	
	//metodo Construtor.
	public Funcionario(String nome, Long cpf, long numCarteiraTrabalho) {
		super(nome,cpf);
		this.numCarteiraTrabalho = numCarteiraTrabalho;
	}
	
	public long getNumCarteiraTrabalho() {
		return numCarteiraTrabalho;
	}

	public void setNumCarteiraTrabalho(long numCarteiraTrabalho) {
		this.numCarteiraTrabalho = numCarteiraTrabalho;
	}
	
}

