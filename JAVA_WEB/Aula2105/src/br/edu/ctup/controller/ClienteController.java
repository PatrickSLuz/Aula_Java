package br.edu.ctup.controller;

import java.io.IOException;
import java.util.List;

import javax.faces.context.FacesContext;

import br.edu.ctup.DAOImpl.ClienteDAOImpl;
import br.edu.ctup.bean.Cliente;

public class ClienteController {

	private Cliente cliente;
	private List<Cliente> listaClientes;
	
	public ClienteController(){
		if (cliente == null) {
			cliente = new Cliente();
		}
 	}
	
	public void salvar() throws IOException {
		System.out.println("Nome: "+cliente.getNome());
		ClienteDAOImpl clienteDAOImpl = new ClienteDAOImpl();
		clienteDAOImpl.salvar(cliente);
		//FacesContext.getCurrentInstance().getExternalContext().redirect("Login.xhtml");
	}
	
	public void listarTodos(){
		ClienteDAOImpl clienteDAOImpl = new ClienteDAOImpl();
		listaClientes = clienteDAOImpl.listarTodos();
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Cliente> getListaClientes() {
		ClienteDAOImpl clienteDAOImpl = new ClienteDAOImpl();
		listaClientes = clienteDAOImpl.listarTodos();
		return listaClientes;
	}
	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
}
