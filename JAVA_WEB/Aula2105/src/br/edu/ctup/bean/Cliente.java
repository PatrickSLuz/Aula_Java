package br.edu.ctup.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //Se colocar somente o @Entity ele cria a tabela com o nome da Classe;
//@Table(name="Nome_da_Tabela") - Para nomear a tabela com um nome diferente do nome da Classe;
public class Cliente {
	
	//@Column(name="Nome_do_campo") - Para nomear a coluna com um nome diferente da declaração;
	@Id // Criando uma PK
	@GeneratedValue(strategy=GenerationType.SEQUENCE) // Criando uma geração sequencial;
	private Integer codigo;
	@Column
	private String login;
	@Column
	private String senha;
	@Column
	private String nome;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
