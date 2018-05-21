package br.com.fiap.entity;

import java.util.Date;

public class Evento {
	private int id;
	private String descricao;
	private Date data;
	private String responsavel;
	
	public int getId() {
		return id;
	}
	public Evento setId(int id) {
		this.id = id;
		return this;
	}
	public String getDescricao() {
		return descricao;
	}
	public Evento setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	public Date getData() {
		return data;
	}
	public Evento setData(Date data) {
		this.data = data;
		return this;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public Evento setResponsavel(String responsavel) {
		this.responsavel = responsavel;
		return this;
	}
	
	public String toString() {
		return this.id + "-" + this.descricao;
	}
}
