package br.com.exemplojdbc.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.com.exemplojdbc.controller.FilmeController;
import br.com.exexmplojdbc.entidades.Filme;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaPrincipal {

	private JFrame frame;
	private JTable table;
	private FilmeController filmeController = new FilmeController();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
		popularTabela();
	}

	private void popularTabela() {

		List<Filme> filmes = filmeController.getFilmes();

		DefaultTableModel model = (DefaultTableModel) table.getModel();

		for (Filme filme : filmes) {

			model.addRow(new Object[] { filme.getTitulo(), filme.getGenero(),
					filme.getDuracao(), filme.getDiretor() });
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 56, 389, 171);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] {
				"Titulo", "Genero", "Dura\u00E7\u00E3o", "Diretor" }) {
			Class[] columnTypes = new Class[] { String.class, String.class,
					Integer.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 129, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnOpoes = new JMenu("Opçoes");
		menuBar.add(mnOpoes);
		
		JMenuItem mntmAdicionarFilme = new JMenuItem("Adicionar Filme");
		mnOpoes.add(mntmAdicionarFilme);
		
		JMenuItem mntmExportar = new JMenuItem("Exportar");
		mnOpoes.add(mntmExportar);
	}
}
