package br.edu.ctup.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.ctup.contrato.InterfaceCliente;
import br.edu.ctup.model.Cliente;

public class ControllerCliente implements InterfaceCliente{

	static List<Cliente> array_cliente = new ArrayList<Cliente>();
	
	@Override
	public void cadastrarCLiente(Cliente cliente) {
		array_cliente.add(cliente);
	}

	@Override
	public boolean autenticar(String login, String senha) {
		boolean result = false;
		 for (int i = 0; i < array_cliente.size(); i++) {
			 if(array_cliente.get(i).getLogin().equals(login) && array_cliente.get(i).getSenha().equals(senha)) {
				 i = array_cliente.size() + 1;
				 result = true;
			 }
		 }
		 return result;
	}

	@Override
	public List<Cliente> listarClientes() {
		return array_cliente;
	}
	
}
