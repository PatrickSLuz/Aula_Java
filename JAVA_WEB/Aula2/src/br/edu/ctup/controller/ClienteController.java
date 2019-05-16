package br.edu.ctup.controller;

import java.io.IOException;

import javax.faces.context.FacesContext;

import br.edu.ctup.model.bean.Cliente;

public class ClienteController {

	private static Cliente cliente;
	
	public ClienteController(){
		if (cliente == null) {
			cliente = new Cliente();
		}
 	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void salvar() throws IOException {
		System.out.println("SALVOU!!");
		System.out.println(cliente.getNome());
		FacesContext.getCurrentInstance().getExternalContext().redirect("Login.xhtml");
	}
	
}
