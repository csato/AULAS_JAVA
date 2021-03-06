package br.com.globalcode.aj4.annotations;

import java.awt.Dimension;
import java.io.ObjectInputStream.GetField;

import javax.swing.JFrame;

public class TesteGUIGenerator {

	public static void main(String[] args) {

		JFrame frame = new JFrame("GUI Generator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GUIGenerator generator = new GUIGenerator();
		Cliente cliente = new Cliente();
		generator.bind(cliente);
		frame.add(generator);

		frame.setPreferredSize(new Dimension(300, 300));
		frame.pack();
		frame.setVisible(true);

	}
}
