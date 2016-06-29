package br.com.exemplojdbc.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import br.com.exexmplojdbc.DAO.FilmeDAO;
import br.com.exexmplojdbc.entidades.Filme;

public class FilmeController {

	public void exportarFilmes() {

		File file = new File("/home/aluno/teste/export.csv");
		PrintWriter writer = null;
		List<Filme> filmes = getFilmes();

		try {
			file.createNewFile();
			writer = new PrintWriter(file);

			for (Filme filme : filmes) {
				writer.print(filme.getTitulo());
				writer.print(";");
				writer.print(filme.getGenero());
				writer.print(";");
				writer.print(filme.getDuracao());
				writer.print(";");
				writer.print(filme.getDiretor());
				writer.print(";");
				writer.println();
			}
			
			writer.flush();

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			writer.close();
		}

	}

	public void inserirFilme(Filme filme) {

		FilmeDAO filmeDAO = new FilmeDAO();

		try {

			filmeDAO.insert(filme);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

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
