package br.com.fiap.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="participantes")
public class Participante {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="IDEVENTO")
	private Evento idevento;
	
	@Column(name="nome", length=45)
	private String nome;
	
	@Column(name="email", length=45)
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
