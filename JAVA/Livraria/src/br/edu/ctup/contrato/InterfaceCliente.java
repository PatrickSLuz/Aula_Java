package br.edu.ctup.contrato;

import java.util.List;

import br.edu.ctup.model.Cliente;

public interface InterfaceCliente {

	void cadastrarCLiente(Cliente cliente);
	boolean autenticar(String login, String senha);
	List<Cliente> listarClientes();
}
