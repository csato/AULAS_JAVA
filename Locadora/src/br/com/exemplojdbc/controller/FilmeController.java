package br.com.exemplojdbc.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import br.com.exexmplojdbc.DAO.FilmeDAO;
import br.com.exexmplojdbc.entidades.Filme;

public class FilmeController {

	public List<Filme> getFilmes() {

		List<Filme> filmes = new ArrayList<Filme>();
		FilmeDAO filmeDAO = new FilmeDAO();

		try {
		
			filmes = filmeDAO.list();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return filmes;
	}

}
