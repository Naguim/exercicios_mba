package br.com.fiap.jdbc;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import br.com.fiap.entidades.Disciplina;

public class JdbcDisciplinaDao {

	private JdbcTemplate jdbcTemplate;

	// propriedade: dataSource
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// método para incluir um novo curso
	public void incluirDisciplina(Disciplina disciplina) throws Exception {
		try {
			String sql = "INSERT INTO DISCIPLINA " + "(IDCURSO,DESCRICAO,CH) VALUES (?,?,?)";
			jdbcTemplate.update(sql, disciplina.getCurso().getId(), disciplina.getDescricao(), disciplina.getCh());

		} catch (Exception e) {
			throw e;
		}
	}
}
