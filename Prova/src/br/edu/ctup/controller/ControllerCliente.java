package br.edu.ctup.controller;
import java.util.ArrayList;
import java.util.List;
import br.edu.ctup.model.Cliente;
public class ControllerCliente {
	List<Cliente> listaCliente= new ArrayList<Cliente>();
	public int cadCliente(Cliente cliente) {
		int result = -1;
		
		if(busca(cliente.getCpf()).getCpf()==null){
			result = 1;
			listaCliente.add(cliente);
			
		}
		else {
			result = 0;
		}
		return result;
	}
	public List<Cliente> listar() {
		return listaCliente;
	}
	public Cliente busca(String cpf){
		Cliente buscarCpf = new Cliente();
		for(int i =0 ;i < listaCliente.size();i++) {
			if(listaCliente.get(i).getCpf().equals(cpf)) {
				buscarCpf.setNome(listaCliente.get(i).getNome());
				buscarCpf.setCpf(listaCliente.get(i).getCpf());
				buscarCpf.setSenha(listaCliente.get(i).getSenha());
			}
		}
		return buscarCpf;
	}
	
	public boolean autenticar(String cpf, String senha) {
		boolean verificar = false;
		
		for (int i = 0; i < listaCliente.size(); i++) {
			if (listaCliente.get(i).getCpf().equals(cpf) && 
			listaCliente.get(i).getSenha().equals(senha)) {
				
				verificar = true;
				
			}
		}
		return verificar;
	}
	
}
