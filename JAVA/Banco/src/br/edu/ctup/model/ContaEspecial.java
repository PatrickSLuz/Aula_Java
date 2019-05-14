package br.edu.ctup.model;

public class ContaEspecial extends ContaBancaria{

	private float limite;

	public ContaEspecial() {
		
	}
	
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public String toString() {
		return "== Conta Espcial =="+
				"\nLimite: "+this.limite+"\n";
	}
	
}
