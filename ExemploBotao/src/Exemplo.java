import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;


public class Exemplo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exemplo window = new Exemplo();
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
	public Exemplo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setBounds(164, 138, 194, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblNewLabel.setText("mouseEntered");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setText("mouseExited");
			}
			@Override
			public void mousePressed(MouseEvent e) {
				
				lblNewLabel.setText("mousePressed");
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				
				lblNewLabel.setText("mouseReleased");
			}
		});
		
		btnNewButton.setBounds(134, 81, 117, 25);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
