package br.com.fiap.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import br.com.fiap.viewmodel.EscolaCursoViewModel;

public class EscolaCursoMapper implements RowMapper<EscolaCursoViewModel> {
	@Override
	public EscolaCursoViewModel mapRow(ResultSet rs, int arg1) throws SQLException {
		EscolaCursoViewModel vm = new EscolaCursoViewModel();
		vm.setDescricao(rs.getString("DESCRICAO"));
		vm.setNumCursos(rs.getInt("NUMCURSOS"));
		return vm;
	}
}