package br.edu.ctup.model;

public class ContaPoupanca extends ContaBancaria{
	
	private double rendimento;
	
	public ContaPoupanca() {
	
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public String toString() {
		return "== Conta Poupança =="+
				"\nRendimento: "+this.rendimento+"%\n";
	}
	
}
