package br.edu.ctup.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.ctup.inteface.InterfaceCliente;
import br.edu.ctup.model.Cliente;

public class ControllerCliente implements InterfaceCliente{

	List<Cliente> listCliente = new ArrayList<Cliente>();
	
	@Override
	public void cadastrarCliente(Cliente cliente) {
		listCliente.add(cliente);
	}

	@Override
	public void validarCliente() {
		
	}

	@Override
	public void mostrarTodosClientes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarDadosCliente() {
		// TODO Auto-generated method stub
		
	}

}
