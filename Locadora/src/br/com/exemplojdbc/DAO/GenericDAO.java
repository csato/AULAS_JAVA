package br.com.exemplojdbc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class GenericDAO {

	public Connection getConnection() {

		Connection connection = null; // atributo do tipo Connection

		try {
			// Carregando o JDBC Driver padr�o

			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);

			// Configurando a nossa conex�o com um banco de dados//
			String serverName = "localhost"; // caminho do servidor do BD
			String mydatabase = "locadora"; // nome do seu banco de dados
			String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
			String username = "root"; // nome de um usu�rio de seu BD
			String password = "season"; // sua senha de acesso
			connection = DriverManager.getConnection(url, username, password);

			return connection;
		} catch (Exception ex) {
			Logger.getLogger(GenericDAO.class.getName()).log(Level.SEVERE,
					null, ex);
			return null;
		}
	}

	public Statement getStatement() throws SQLException {
		return getConnection().createStatement();
	}

	public PreparedStatement getStatement(String st) throws SQLException {
		return getConnection().prepareStatement(st);
	}

	public ResultSet executeQuery(String query, Object... params)
			throws SQLException {
		PreparedStatement ps = getStatement(query);
		for (int i = 0; i < params.length; i++) {
			ps.setObject(i + 1, params[i]);
		}
		return ps.executeQuery();
	}

	public int executeCommand(String query, Object... params)
			throws SQLException {
		PreparedStatement ps = getStatement(query);
		for (int i = 0; i < params.length; i++) {
			try {
				ps.setObject(i + 1, params[i]);
			} catch (Exception e) {
				System.out.println("Error to try " + i + " with value "
						+ params[i]);
			}
		}
		int result = ps.executeUpdate();
		ps.close();
		return result;
	}
}
