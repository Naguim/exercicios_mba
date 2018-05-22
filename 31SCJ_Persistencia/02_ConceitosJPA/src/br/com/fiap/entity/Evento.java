package br.com.fiap.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="eventos")
public class Evento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="descricao", length=45)
	private String descricao;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	@Column(name="data")
	private Date data;
	
	@Column(name="responsavel", length=45)
	private String responsavel;
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="idevento")
	private Set<Participante> participantes = new HashSet<>();
	
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
	public Set<Participante> getParticipantes() {
		return participantes;
	}
	public void setParticipantes(Set<Participante> participantes) {
		this.participantes = participantes;
	}
	
	public String toString() {
		return this.id + "-" + this.descricao;
	}
}
