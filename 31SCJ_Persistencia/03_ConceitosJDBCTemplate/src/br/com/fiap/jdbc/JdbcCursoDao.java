package br.com.fiap.jdbc;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import br.com.fiap.entidades.Curso;
import br.com.fiap.mapper.CursoMapper;
import javax.sql.DataSource;

public class JdbcCursoDao {

	private JdbcTemplate jdbcTemplate;

	// propriedade: dataSource
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// m�todo para incluir um novo curso
	public void incluirCurso(Curso curso) throws Exception {
		try {
			String sql = "INSERT INTO CURSO " + "(IDESCOLA,DESCRICAO) VALUES (?,?)";
			jdbcTemplate.update(sql, curso.getEscola().getId(), curso.getDescricao());

		} catch (Exception e) {
			throw e;
		}
	}

	// m�todo para buscar uma escola
	public Curso buscarCurso(int id) throws Exception {
		Curso curso = null;
		try {
			String query = "SELECT * FROM CURSO WHERE ID= ? ";
			curso = this.jdbcTemplate.queryForObject(query, new Integer[] { id }, new CursoMapper());
		} catch (Exception e) {
			throw e;
		}
		return curso;
	}

	public List<Curso> listarCursos(int idescola) throws Exception {
		List<Curso> cursos = new ArrayList<>();
		try {
			cursos = this.jdbcTemplate.query("SELECT * FROM CURSO WHERE IDESCOLA=?", new Integer[] { idescola },
					new CursoMapper());
		} catch (Exception e) {
			throw e;
		}
		return cursos;
	}
}
