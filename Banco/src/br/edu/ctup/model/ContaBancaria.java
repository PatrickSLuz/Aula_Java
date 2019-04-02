package br.edu.ctup.model;

public class ContaBancaria {

	private String cliente;
	private int num_conta;
	private float saldo;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(String cliente, int num_conta, float saldo) {
		this.cliente = cliente;
		this.num_conta = num_conta;
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getNum_conta() {
		return num_conta;
	}
	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}	
	
	@Override
	public String toString() {
		return "\n== Conta Bancaria ==\n"+
				"Nome: "+this.cliente+"\n"+
				"Conta: "+this.num_conta+"\n"+
				"Saldo Atual: R$ "+this.saldo+"\n";
	}
	
}
