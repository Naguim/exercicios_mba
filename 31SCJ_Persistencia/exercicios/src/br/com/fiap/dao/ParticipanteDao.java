package br.com.fiap.dao;

import java.util.Set;

import br.com.fiap.entity.Participante;

public class ParticipanteDao extends Dao<Participante> {

	@Override
	public void incluir(Participante elemento) throws Exception {
		try {
			abrirConexao();
			String sql = "insert into participantes (idevento, nome, email) values (?, ?, ?)";
			
			stmt = cn.prepareStatement(sql);
			stmt.setInt(1, elemento.getIdevento().getId());
			stmt.setString(2, elemento.getNome());
			stmt.setString(3, elemento.getEmail());
			
			stmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
		
	}

	@Override
	public Participante buscar(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Participante> listar(int... param) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
