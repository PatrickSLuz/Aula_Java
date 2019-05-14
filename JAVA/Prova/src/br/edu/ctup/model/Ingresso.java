package br.edu.ctup.model;

public class Ingresso {
	private String data, hora, nomeArtista;
	private Double preco;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}
	
	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String toString(){
		return "\n Nome do artista: "+this.nomeArtista+"\n Preço: "+this.preco+"\n Data: "+this.data+"\n Hora: "+this.hora+"\n\n";
	}
}
