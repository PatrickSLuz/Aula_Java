package br.edu.ctup.controller;

import java.io.IOException;
import java.util.List;

import javax.faces.context.FacesContext;

import br.edu.ctup.DAOImpl.ClienteDAOImpl;
import br.edu.ctup.bean.Cliente;

public class ClienteController {

	private Cliente cliente;
	private List<Cliente> listaClientes;
	
	private ClienteDAOImpl clienteDAOImpl = new ClienteDAOImpl();
	
	public ClienteController(){
		if (cliente == null) 
			cliente = new Cliente();
 	}
	
	public void salvar() throws IOException {
		clienteDAOImpl.salvar(cliente);
		cliente = new Cliente(); // apos salvar um cliente ja instancia outro;
		//FacesContext.getCurrentInstance().getExternalContext().redirect("Login.xhtml");
	}
	
	public void excluir() {
		// Pegando o paramentro do <f:param>;
		Integer codigo = Integer.parseInt((String)FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("codigo")); 
		clienteDAOImpl.excluir(codigo);
	}
	
	public void editar() {
		Integer codigo = Integer.parseInt((String)FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("codigo"));
		cliente = clienteDAOImpl.editar(codigo);
	}
	
	public void logar() {
		System.out.println("Login DIGITADO\n"+cliente.getLogin()+cliente.getSenha());
		Cliente clienteLogado = clienteDAOImpl.autenticar(cliente);
		if(clienteLogado.getLogin().equals(cliente.getLogin()) && clienteLogado.getSenha().equals(cliente.getSenha())) {
			System.out.println("Logado com Sucesso!");
		}else {
			System.out.println("Falha no login!");
		}
	}
	
	public void listarTodos(){
		listaClientes = clienteDAOImpl.listarTodos();
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Cliente> getListaClientes() {
		listaClientes = clienteDAOImpl.listarTodos();
		return listaClientes;
	}
	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
}
