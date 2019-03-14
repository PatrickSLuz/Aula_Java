package br.edu.ctup.inteface;

import br.edu.ctup.model.Cliente;

public interface InterfaceCliente {

	void cadastrarCliente(Cliente cliente);
	void validarCliente();
	void mostrarTodosClientes();
	void alterarDadosCliente();
}
