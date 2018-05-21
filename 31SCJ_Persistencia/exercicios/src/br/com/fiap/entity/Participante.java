package br.com.fiap.entity;

import java.util.Date;

public class Participante {
	private int id;
	private Evento idevento;
	private String nome;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Evento getIdevento() {
		return idevento;
	}
	public void setIdevento(Evento idevento) {
		this.idevento = idevento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
