package br.com.exemplojdbc.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import br.com.exemplojdbc.entidades.Filme;


public class FilmeDAO extends GenericDAO {
	//LISTAR TODOS OS FILMES
	
	public List<Filme> list () throws SQLException {
		
		List<Filme> filmes = new ArrayList<Filme>();
		String sql = "SELECT * FROM FILMES;";
		
		Connection con = getConnection();//conectar com banco
		
		Statement st = con.createStatement(); //cara q roda o comando no banco
		ResultSet resultSet =  st.executeQuery(sql);
		
		while (resultSet.next()){
			
			filmes.add(popularFilmes(resultSet));
			
		}
		
		st.close();
		con.close();
		
		return filmes;
	}

	private Filme popularFilmes(ResultSet resultSet) throws SQLException {
		// TODO Auto-generated method stub
		Filme filme = new Filme();
		
		filme.setDiretor(resultSet.getString("DIRETOR"));
		filme.setDuracao(resultSet.getInt("DURACAO"));
		filme.setGenero(resultSet.getString("GENERO"));
		filme.setId(resultSet.getInt("ID"));
		filme.setTitulo(resultSet.getString("TITULO"));
		
		return filme;
	}

}
