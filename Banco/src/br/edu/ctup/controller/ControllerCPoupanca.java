package br.edu.ctup.controller;

import br.edu.ctup.model.ContaPoupanca;

public class ControllerCPoupanca {

	ContaPoupanca cPoupanca;
	
	public void cadCPoupanca() {
		cPoupanca = new ContaPoupanca();
		cPoupanca.setRendimento(0.05);
	}
	
	public ContaPoupanca verDadosCPoupanca() {
		return cPoupanca;
	}
	
}
