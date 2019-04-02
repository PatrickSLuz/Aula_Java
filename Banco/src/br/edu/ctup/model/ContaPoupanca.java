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
		return "== Conta Poupan�a =="+
				"\nRendimento: "+this.rendimento+"%\n";
	}
	
}
