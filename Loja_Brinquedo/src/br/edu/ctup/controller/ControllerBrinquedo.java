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
	/*
	public List<Brinquedo> mostrarTodosBrinquedos() {
		return listBrinquedo;
		
	}
*/
	
	public void mostrarTodosBrinquedos() {
		for (int i = 0; i < listBrinquedo.size(); i++) {
			System.out.println("\nID: "+i+"\n"+
			"Nome: "+listBrinquedo.get(i).getNome()+"\n"+
			"Descrição: "+listBrinquedo.get(i).getDescricao()+"\n"+
			"Preço: R$ "+listBrinquedo.get(i).getPreco()+"\n"+
			"Estoque: "+listBrinquedo.get(i).getEstoque()+"\n");
			
			
			
		}
	}
	
}
