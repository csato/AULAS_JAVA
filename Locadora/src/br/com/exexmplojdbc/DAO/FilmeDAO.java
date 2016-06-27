package br.com.exexmplojdbc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.exexmplojdbc.entidades.Filme;

public class FilmeDAO extends GenericDAO {

	public List<Filme> list() throws SQLException {

		List<Filme> filmes = new ArrayList<Filme>();

		String sql = "SELECT * FROM FILMES";

		Connection con = getConnection();

		Statement st = con.createStatement();
		ResultSet resultSet = st.executeQuery(sql);

		while (resultSet.next()) {
			filmes.add(popularFilme(resultSet));
		}

		st.close();
		con.close();

		return filmes;

	}

	public void insert(Filme filme) throws SQLException {

		String sql = "INSERT INTO FILMES(TITULO,GENERO,DURACAO,DIRETOR)"
				+ " VALUES(?,?,?,?)";

		executeCommand(sql, filme.getTitulo(), filme.getGenero(),
				filme.getDuracao(), filme.getDiretor());

	}

	public Filme getFilmeByTitulo(String titulo) throws SQLException {

		Filme filme = null;

		String sql = "SELECT * FROM FILMES WHERE TITULO = ?";

		ResultSet rs = executeQuery(sql, titulo);

		if (rs.next()) {
			filme = popularFilme(rs);
		}

		return filme;

	}

	private Filme popularFilme(ResultSet resultSet) throws SQLException {

		Filme filme = new Filme();

		filme.setId(resultSet.getInt("ID"));
		filme.setTitulo(resultSet.getString("TITULO"));
		filme.setGenero(resultSet.getString("GENERO"));
		filme.setDuracao(resultSet.getInt("DURACAO"));
		filme.setDiretor(resultSet.getString("DIRETOR"));

		return filme;
	}

}
