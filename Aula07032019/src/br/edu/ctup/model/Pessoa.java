package br.edu.ctup.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Date;

import javax.annotation.Generated;

public class Pessoa {
	
	private String nome;
	private int diaNasc;
	private int mesNasc;
	private int anoNasc;
	private Date dataNasc;
	private float altura;
	
	public static String getDataAtual() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dataAtual = new Date();
		return dateFormat.format(dataAtual);
	}
		
	public String toString() {
		return "Nome: " + this.nome + "\n" +
				"Data de Nascimento: " + this.diaNasc + "/" + this.mesNasc + "/" + this.anoNasc + "\n" +
				"Altura: " + this.altura  + "\n";
	}
	
	public int calculaIdade(){
		int idade=0;
		while(2019 != this.anoNasc) {
			this.diaNasc ++;
			if(this.diaNasc >= 30) {
				this.diaNasc = 0;
				this.mesNasc ++;
				if(this.mesNasc >= 12) {
					this.mesNasc = 0;
					this.anoNasc ++;
					if(this.anoNasc != 2019) {
						idade ++;
					}
				}
			}
		}
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDiaNasc() {
		return diaNasc;
	}
	public void setDiaNasc(int diaNasc) {
		this.diaNasc = diaNasc;
	}
	public int getMesNasc() {
		return mesNasc;
	}
	public void setMesNasc(int mesNasc) {
		this.mesNasc = mesNasc;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	
}
