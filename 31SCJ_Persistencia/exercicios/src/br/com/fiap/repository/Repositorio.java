package br.com.fiap.repository;

import br.com.fiap.dao.EventosDao;
import br.com.fiap.dao.ParticipanteDao;

public class Repositorio {
	protected EventosDao _eventosDao;
	protected ParticipanteDao _participanteDao;
	
	public EventosDao getEventosDao() {
		if (this._eventosDao == null) {
			this._eventosDao = new EventosDao();
		}
		
		return this._eventosDao;
	}
	
	public ParticipanteDao getParticipanteDao() {
		if (this._participanteDao == null) {
			this._participanteDao = new ParticipanteDao();
		}
		
		return this._participanteDao;
	}
}
