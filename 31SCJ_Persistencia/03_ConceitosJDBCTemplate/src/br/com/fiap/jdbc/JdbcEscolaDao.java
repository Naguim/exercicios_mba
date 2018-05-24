package br.com.fiap.jdbc;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import br.com.fiap.entidades.Escola;
import br.com.fiap.mapper.EscolaMapper;
import javax.sql.DataSource;

public class JdbcEscolaDao {
	private JdbcTemplate jdbcTemplate;

	// propriedade: dataSource
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// método para incluir uma escola
	public void incluirEscola(Escola escola) throws Exception {
		try {
			String sql = "INSERT INTO ESCOLA " + "(DESCRICAO,ENDERECO,DATAFUNDACAO) VALUES (?,?,?)";

			this.jdbcTemplate.update(sql, escola.getDescricao(), escola.getEndereco(), escola.getDataFundacao());

		} catch (Exception e) {
			throw e;
		}
	}

	// método para buscar uma escola
	public Escola buscarEscola(int id) throws Exception {
		Escola escola = null;
		try {
			String query = "SELECT * FROM ESCOLA WHERE ID= ? ";
			escola = this.jdbcTemplate.queryForObject(query, new Integer[] { id }, new EscolaMapper());
		} catch (Exception e) {
			throw e;
		}
		return escola;
	}

	// método para listar todas as escolas
	public List<Escola> listarEscolas() throws Exception {
		List<Escola> escolas = new ArrayList<>();
		try {
			escolas = this.jdbcTemplate.query("SELECT * FROM ESCOLA", new EscolaMapper());
		} catch (Exception e) {
			throw e;
		}
		return escolas;
	}
}
