package br.com.exemplojdbc.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.exemplojdbc.controller.FilmeController;
import br.com.exexmplojdbc.entidades.Filme;

public class AdicionarFilme extends JDialog {
	private JTextField txtTitulo;
	private JTextField txtGenero;
	private JTextField txtDuracao;
	private JTextField txtDiretor;

	/**
	 * Create the dialog.
	 */
	public AdicionarFilme() {
		setTitle("Adicionar Filme");
		setBounds(100, 100, 332, 208);
		getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(12, 27, 70, 15);
		getContentPane().add(lblTitulo);

		txtTitulo = new JTextField();
		txtTitulo.setBounds(89, 27, 193, 15);
		getContentPane().add(txtTitulo);
		txtTitulo.setColumns(10);

		txtGenero = new JTextField();
		txtGenero.setColumns(10);
		txtGenero.setBounds(89, 54, 193, 15);
		getContentPane().add(txtGenero);

		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(12, 54, 70, 15);
		getContentPane().add(lblGenero);

		txtDuracao = new JTextField();
		txtDuracao.setColumns(10);
		txtDuracao.setBounds(89, 81, 193, 15);
		getContentPane().add(txtDuracao);

		JLabel lblDurao = new JLabel("Duração");
		lblDurao.setBounds(12, 81, 70, 15);
		getContentPane().add(lblDurao);

		txtDiretor = new JTextField();
		txtDiretor.setColumns(10);
		txtDiretor.setBounds(89, 108, 193, 15);
		getContentPane().add(txtDiretor);

		JLabel lblDiretor = new JLabel("Diretor");
		lblDiretor.setBounds(12, 108, 70, 15);
		getContentPane().add(lblDiretor);

		JButton btnSalvar = new JButton("salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Filme filme = new Filme();
				filme.setTitulo(txtTitulo.getText());
				filme.setGenero(txtGenero.getText());
				filme.setDuracao(Integer.valueOf(txtDuracao.getText()));
				filme.setDiretor(txtDiretor.getText());

				FilmeController controller = new FilmeController();
				controller.inserirFilme(filme);

				dispose();

			}
		});
		btnSalvar.setBounds(164, 135, 117, 25);
		getContentPane().add(btnSalvar);
		
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setVisible(true);

	}
}
