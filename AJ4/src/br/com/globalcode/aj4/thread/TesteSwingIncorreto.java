package br.com.globalcode.aj4.thread;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteSwingIncorreto extends JFrame {

	public TesteSwingIncorreto(String titulaJanel) {
		super(titulaJanel);
		JButton b1 = new JButton("Iniciar Processamento");
		add(b1);
		EventosMouse listener = new EventosMouse();
		b1.addMouseListener(listener);
		setSize(200, 75);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public class EventosMouse extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			// processamento demorado
		}
	}

	public static void main(String[] args) {
		TesteSwingIncorreto frame = new TesteSwingIncorreto("TesteThreadSwing");
	}

}
