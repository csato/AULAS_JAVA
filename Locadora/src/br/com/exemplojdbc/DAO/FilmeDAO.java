package br.com.exemplojdbc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

	public Filme getFimebyTitulo (String titulo) throws SQLException{
		
		Filme filme = new Filme();
		
		
		String sql= "SELECT * FRO FILMES WHERE TITULO =?"; //mais seguro 
		
		Connection con = getConnection();
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, titulo);//1 pq é o primeiro ponto de interrogação
		
		ResultSet re = ps.executeQuery();
		
		if (re.next()) {
			
			filme = popularFilmes(re);
		}
		
		return filme;
	}
	
	
	public void insert(Filme filme) throws SQLException{
		
		String sql ="INSERT INTO FILMES (TITULO,GENERO,DURACAO,DIRETOR) "
				+ "VALUES(?,?,?,?)";
		
		Connection con = getConnection();
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		//ordem das colunas do insert - MATTERS
		ps.setString(1, filme.getTitulo());
		ps.setString(2, filme.getGenero());
		ps.setInt(3, filme.getDuracao());
		ps.setString(4, filme.getDiretor());
		
		ps.execute();
		
		ps.close();
		con.close();
		
	}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

