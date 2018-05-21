package br.com.fiap.dao;

import java.sql.*;
import java.util.Set;

public abstract class Dao<T> {
	protected Connection cn;
	protected PreparedStatement stmt;
	protected ResultSet rs;
	
	//private String conexao = "jdbc:mysql://localhost:3306/dbeventos?useSSL=false&useTimezone=true&serverTimezone=UTC";
	private String conexao = "jdbc:mysql://localhost:3306/dbeventos";
	
	public void abrirConexao() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		//Class.forName("com.mysql.cj.jdbc.Driver");
		cn = DriverManager.getConnection(conexao, "root", "fiap");
	}
	
	public void fecharConexao() throws Exception {
		if ((cn != null) && !cn.isClosed())
			cn.close();
	}
	
	public abstract void incluir(T elemento) throws Exception;
	public abstract T buscar(int id) throws Exception;
	public abstract Set<T> listar(int... param) throws Exception; 
}
