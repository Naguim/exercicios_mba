package br.com.fiap.aplicacao;

import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import br.com.fiap.entidades.Curso;
import br.com.fiap.entidades.Escola;
import br.com.fiap.jdbc.JdbcCursoDao;

//import br.com.fiap.jdbc.JdbcEscolaCursoDao;
import br.com.fiap.jdbc.JdbcEscolaDao;
//import br.com.fiap.viewmodel.EscolaCursoViewModel;

public class AppEscola {
	public static void main(String[] args) {
		incluirEscola();
		// incluirCurso();
		//listarEscolasComCursos();
	}

	private static void incluirEscola() {

		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("beanJdbc.xml");
			JdbcEscolaDao dao = (JdbcEscolaDao) context.getBean("jdbcEscolaDao");

			Escola escola = new Escola();
			escola.setDescricao("Fiap Tecnologia");
			escola.setDataString("01/02/1990");
			escola.setEndereco("Av Paulista");

			dao.incluirEscola(escola);
			JOptionPane.showMessageDialog(null, "Escola incluída com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void incluirCurso() {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("beanJdbc.xml");
			List<Escola> escolas = ((JdbcEscolaDao) context.getBean("jdbcEscolaDao")).listarEscolas();
			Escola escola = escolas.get(0);

			JdbcCursoDao dao = (JdbcCursoDao) context.getBean("jdbcCursoDao");
			Curso curso = new Curso();
			curso.setDescricao("MBA Full Stack");
			curso.setEscola(escola);

			dao.incluirCurso(curso);
			JOptionPane.showMessageDialog(null, "Curso incluída com sucesso");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}