package br.com.globalcode.aj4.thread;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class TesteThreadSwingUtilities extends JFrame {

	JLabel lMensagem = new JLabel();

	public TesteThreadSwingUtilities(String titulaJanela) {
		super(titulaJanela);
		JButton b1 = new JButton("Iniciar Processamento");
		add(b1, BorderLayout.NORTH);
		add(lMensagem, BorderLayout.SOUTH);
		EventosMouse listener = new EventosMouse();
		b1.addMouseListener(listener);
		setSize(200, 75);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public class EventosMouse extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			Processador proc = new Processador();
			Thread t = new Thread(proc);
			t.start();
		}
	}

	class Processador implements Runnable {

		@Override
		public void run() {
			// processamento demorado
			SwingUtilities.invokeLater(new Runnable() {

				@Override
				public void run() {
					lMensagem.setText("Processamento concluido");

				}
			});

		}
	}

	public static void main(String[] args) {
		TesteThreadSwingUtilities frame = new TesteThreadSwingUtilities("TesteThreadSwing");
	}

}
