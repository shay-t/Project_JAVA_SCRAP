package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import Extract.extr;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import javax.swing.JMenu;

public class Scrapper {

	private JFrame frame;
	Choice choice = new Choice();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scrapper window = new Scrapper();
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
	public Scrapper() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 717, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scrapper");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 25));
		lblNewLabel.setBounds(180, 26, 346, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Lancer Scrapping");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ScrapResult s = new ScrapResult();
				//ScrapResult.main(null);
				String url =choice.getSelectedItem();
				extr.extraire(url);
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		btnNewButton.setBounds(36, 218, 274, 44);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLancerClassification = new JButton("Lancer Classification");
		btnLancerClassification.setVerticalAlignment(SwingConstants.BOTTOM);
		btnLancerClassification.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		btnLancerClassification.setBounds(397, 218, 274, 44);
		frame.getContentPane().add(btnLancerClassification);
		choice.setBounds(228, 123,300, 50);
		choice.add("Rekrute.ma");
		choice.add("Emploi.ma");
		frame.getContentPane().add(choice);
	}
}
