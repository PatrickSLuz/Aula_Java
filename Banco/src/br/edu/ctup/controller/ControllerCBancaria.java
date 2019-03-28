package br.edu.ctup.controller;

import br.edu.ctup.model.ContaBancaria;

public class ControllerCBancaria {

	ContaBancaria cBancaria;
	
	public void cadCBancaria(String cliente, int conta) {
		cBancaria = new ContaBancaria();
		cBancaria.setCliente(cliente);
		cBancaria.setNum_conta(conta);
		cBancaria.setSaldo(0);
	}
	
	public ContaBancaria verDados() {
		return cBancaria;
	}
	
}
