package br.edu.ctup.controller;

import br.edu.ctup.model.ContaEspecial;

public class ControllerCEspecial {

	ContaEspecial cEspecial;
	
	public void cadCEspecial() {
		cEspecial = new ContaEspecial();
		cEspecial.setLimite(200);
	}
	
	public ContaEspecial verDadosCEspecial() {
		return cEspecial;
	}
	
}
