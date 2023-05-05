package br.com.poo.objetos.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class GerenciarContas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciarContas frame = new GerenciarContas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GerenciarContas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 330);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(231, 117, 20));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnuAberturaConta = new JMenu("Abertura de Conta");
		menuBar.add(mnuAberturaConta);
		
		JMenuItem mniContaPoupanca = new JMenuItem("Conta Poupança");
		mniContaPoupanca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaPoupanca janelapoupanca = new JanelaPoupanca();
				janelapoupanca.setVisible(true);
			}
		});
		mnuAberturaConta.add(mniContaPoupanca);
		
		JMenuItem mniContaCorrente = new JMenuItem("Conta Corrente");
		mniContaCorrente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaCorrente janelacorrente = new JanelaCorrente();
				janelacorrente.setVisible(true);
			}
		});
		mnuAberturaConta.add(mniContaCorrente);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GerenciarContas.class.getResource("/img/itauu.jpg")));
		lblNewLabel.setBounds(93, 94, 174, 164);
		contentPane.add(lblNewLabel);
		
		JLabel lblITAU = new JLabel("Venha ser Itaú");
		lblITAU.setForeground(Color.WHITE);
		lblITAU.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblITAU.setBounds(56, 11, 233, 37);
		contentPane.add(lblITAU);
		
		JLabel lblNewLabel_1 = new JLabel("Perfeito para você.");
		lblNewLabel_1.setFont(new Font("Yu Gothic Medium", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(83, 44, 174, 29);
		contentPane.add(lblNewLabel_1);
	}
}
