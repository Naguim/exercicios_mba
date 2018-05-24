package br.com.fiap.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import br.com.fiap.entidades.Disciplina;

public class DisciplinaMapper implements RowMapper<Disciplina> {
	@Override
	public Disciplina mapRow(ResultSet rs, int arg1) throws SQLException {
		Disciplina disciplina = new Disciplina();
		disciplina.setId(rs.getInt("ID"));
		disciplina.setDescricao(rs.getString("DESCRICAO"));
		disciplina.setCh(rs.getInt("CH"));
		//disciplina.setEscola(rs.getObject(arg0)("CH"));
		
		return disciplina;
	}
}