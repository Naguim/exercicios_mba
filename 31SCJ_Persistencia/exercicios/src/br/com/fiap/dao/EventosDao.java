package br.com.fiap.dao;
import java.util.HashSet;
import java.util.Set;

import br.com.fiap.entity.Evento;

public class EventosDao extends Dao<Evento> {

	@Override
	public void Incluir(Evento elemento) throws Exception {
		try {
			abrirConexao();
			String sql = "insert into eventos (descricao, data, responsavel) values (?, ?, ?)";
			
			stmt = cn.prepareStatement(sql);
			stmt.setString(1, elemento.getDescricao());
			stmt.setDate(2, new java.sql.Date(elemento.getData().getTime()));
			stmt.setString(3, elemento.getResponsavel());
			
			stmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
	}

	@Override
	public Evento buscar(int id) throws Exception {
		Evento evento = null;
		
		try {
			abrirConexao();
			String sql = "select * from eventos where id = ?";
			
			stmt = cn.prepareStatement(sql);
			stmt.setInt(1, id);
			
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				evento = new Evento();
				evento.setId(id)
					.setDescricao(rs.getString("descricao"))
					.setResponsavel(rs.getString("responsavel"))
					.setData(rs.getDate("data"));
			}
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
		
		return evento;
	}

	@Override
	public Set<Evento> listar(int... param) throws Exception {
		Set<Evento> lista = new HashSet<>();
		
		try {
			abrirConexao();
			String sql = "select * from eventos";
			
			stmt = cn.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				Evento evento = new Evento();
				evento.setId(rs.getInt("id"))
					.setDescricao(rs.getString("descricao"))
					.setResponsavel(rs.getString("responsavel"))
					.setData(rs.getDate("data"));
				lista.add(evento);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
		
		return lista;
	}

}
