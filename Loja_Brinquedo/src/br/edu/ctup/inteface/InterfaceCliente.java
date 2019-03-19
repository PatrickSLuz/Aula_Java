package br.edu.ctup.inteface;

import java.util.List;

import br.edu.ctup.model.Cliente;

public interface InterfaceCliente {

	void cadastrarCliente(Cliente cliente);
	List<Cliente> mostrarTodosClientes();
	Cliente verClienteLogado(int i);
	void alterarDadosCliente(Cliente cliente, int pos);
	int validarCliente(String login, String senha);
}
