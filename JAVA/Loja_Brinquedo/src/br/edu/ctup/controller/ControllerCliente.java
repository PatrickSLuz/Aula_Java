package br.edu.ctup.controller;

import java.util.ArrayList;
import java.util.List;
import br.edu.ctup.model.Cliente;

public class ControllerCliente{
	
	List<Cliente> listCliente = new ArrayList<Cliente>();

	
	public void cadastrarCliente(Cliente cliente) {
		listCliente.add(cliente);		
	}

	
	public List<Cliente> mostrarTodosClientes() {
		return listCliente;
	}

	 // alterando o cliente apartir do seu indice da lista.
	public void alterarDadosCliente(Cliente cliente, int pos) {
		listCliente.get(pos).setNome(cliente.getNome());
		listCliente.get(pos).setSenha(cliente.getSenha());
	}

	 // a validação de login e senha retorna o indice do usuário na lista. 
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

	 // ver um item especifico da lista com o indice.
	public Cliente verClienteLogado(int i) {
		return listCliente.get(i);
	}

}
