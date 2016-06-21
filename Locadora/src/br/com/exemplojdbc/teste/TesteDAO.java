package br.com.exemplojdbc.teste;

import java.sql.SQLException;
import java.util.List;
import br.com.exemplojdbc.DAO.FilmeDAO;
import br.com.exemplojdbc.entidades.Filme;

public class TesteDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FilmeDAO filmeDAO = new FilmeDAO();
			
			//System.out.println(filmeDAO.getConnection());
						
			try {
				List<Filme> filmes =  filmeDAO.list();
				for (Filme filme : filmes) {
					
					System.out.println(filme);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			
	}

}
