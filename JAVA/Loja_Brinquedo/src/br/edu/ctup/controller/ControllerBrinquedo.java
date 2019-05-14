package br.edu.ctup.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.ctup.model.Brinquedo;
import br.edu.ctup.model.Cliente;

public class ControllerBrinquedo{

	List<Brinquedo> listBrinquedo = new ArrayList<Brinquedo>();
	
	public void cadastrarBrinquedo(Brinquedo brinquedo) {
		listBrinquedo.add(brinquedo);
	}

	public void alterarDadosBrinquedo(Brinquedo brinquedo, int indice, int atualiza_estoque) {
		if(atualiza_estoque == 0) {
			listBrinquedo.get(indice).setDescricao(brinquedo.getDescricao());
			listBrinquedo.get(indice).setPreco(brinquedo.getPreco());
		}else if(atualiza_estoque == 1){
			listBrinquedo.get(indice).setEstoque(brinquedo.getEstoque());
		}
	}

	public List<Brinquedo> buscaBrinquedo(String nome) {
		List<Brinquedo> listBrinquedoBusca = new ArrayList<Brinquedo>(); // Criando uma lista para receber os itens da busca da lista principal.
		for (int i = 0; i < listBrinquedo.size(); i++) {
			if(listBrinquedo.get(i).getNome().equals(nome)) {
				listBrinquedoBusca.add(listBrinquedo.get(i)); // lista de busca recebe um objeto da lista principal.
			}
		}
		return listBrinquedoBusca;
	}
	
	public List<Brinquedo> mostrarTodosBrinquedos() {
		List<Brinquedo> listEstoquePositivo = new ArrayList<Brinquedo>();
		for (int i = 0; i < listBrinquedo.size(); i++) {
			if(listBrinquedo.get(i).getEstoque() > 0) {
				listEstoquePositivo.add(listBrinquedo.get(i));
			}
		}
		return listEstoquePositivo;
	}
	
}
