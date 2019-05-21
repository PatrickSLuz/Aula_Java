package br.edu.ctup.DAO;

import java.util.List;

import br.edu.ctup.bean.Cliente;

public interface ClienteDAO {
	
	// o objetivo desta classe/interface é definir métodos de acesso ao Banco de Dados
	
	void salvar(Cliente cliente);
	void excluir(Integer codigo);
	List<Cliente> listarTodos();
	Cliente autenticar(String login, String senha);
	Cliente autenticar(Cliente cliente);
	
}
