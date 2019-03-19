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
	public List<Cliente> mostrarTodosClientes() {
		return listCliente;
	}

	@Override // alterando o cliente apartir do seu indice da lista.
	public void alterarDadosCliente(Cliente cliente, int pos) {
		listCliente.get(pos).setLogin(cliente.getLogin());
		listCliente.get(pos).setNome(cliente.getNome());
		listCliente.get(pos).setSenha(cliente.getSenha());
	}

	@Override // a validação de login e senha retorna o indice do usuário na lista. 
	public int validarCliente(String login, String senha) {
		int indice = -1;
		for (int i = 0; i < listCliente.size(); i++) {
			 if(listCliente.get(i).getLogin().equals(login) && listCliente.get(i).getSenha().equals(senha)) {
				 indice = i; // pegando o indece.
				 break;
			 }
		 }
		return indice;
	}

	@Override // ver um item especifico da lista com o indice.
	public Cliente verClienteLogado(int i) {
		return listCliente.get(i);
	}

}
