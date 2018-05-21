package br.com.fiap.aplicacao;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import br.com.fiap.entity.Evento;
import br.com.fiap.repository.Repositorio;
import br.com.fiap.dao.EventosDao;

public class AppEventos {

	public static void main(String[] args) {
		Repositorio repo = new Repositorio();
		Evento evento = new Evento();
		EventosDao dao = repo.getEventosDao();
		Set<Evento> eventos = new HashSet<>();
		
		evento.setDescricao("Campus Party")
			.setData(new Date())
			.setResponsavel("Instituto Campus Party");
		
		try {
			dao.incluir(evento);
			
			eventos = dao.listar();
			
			eventos.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
