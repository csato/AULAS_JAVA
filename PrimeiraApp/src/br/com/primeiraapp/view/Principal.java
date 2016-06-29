package br.com.primeiraapp.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frame;
	private JTextField txtNome;
	JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
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
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 194);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtNome = new JTextField();
		txtNome.setBounds(94, 12, 261, 19);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);

		JLabel lblNome = new JLabel("Nome :");
		lblNome.setFont(new Font("Dialog", Font.ITALIC, 14));
		lblNome.setBounds(12, 14, 70, 15);
		frame.getContentPane().add(lblNome);

		lblResultado = new JLabel("");
		lblResultado.setBounds(45, 76, 223, 32);
		frame.getContentPane().add(lblResultado);

		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome = txtNome.getText();

				lblResultado.setText("Seu nome é " + nome);

			}
		});
		btnOk.setBounds(319, 76, 117, 25);
		frame.getContentPane().add(btnOk);
	}
}
