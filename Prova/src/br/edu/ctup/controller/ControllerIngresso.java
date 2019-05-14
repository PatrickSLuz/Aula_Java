package br.edu.ctup.controller;
import java.util.ArrayList;
import java.util.List;
import br.edu.ctup.model.Ingresso;

public class ControllerIngresso {
	List<Ingresso> listaIngresso= new ArrayList<Ingresso>();
	public void cadastrarIngresso(Ingresso ingresso) {
		listaIngresso.add(ingresso);
	}
	public List<Ingresso> listar(){
		return listaIngresso;
	}
	
	public Double finalizarCompra(int indice,long carteirinha) {
		Double precoFinal =0.0;
		if(carteirinha ==0.0) {		
			precoFinal=listaIngresso.get(indice).getPreco();
		}
		else {
			precoFinal=listaIngresso.get(indice).getPreco() / 2;
		}
		return precoFinal;
		}
	
}
