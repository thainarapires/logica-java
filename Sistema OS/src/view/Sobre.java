package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		getContentPane().setBackground(Color.WHITE);
		setModal(true);
		setTitle("Sobre");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/about.png")));
		setBounds(100, 100, 430, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblTitulo = new JLabel("SP ASSISTENCIA ELETRODOMÉSTICOS");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitulo.setBounds(55, 17, 349, 27);
		getContentPane().add(lblTitulo);
		
		JLabel lblAutora = new JLabel("AUTORA:");
		lblAutora.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAutora.setBounds(20, 215, 163, 14);
		getContentPane().add(lblAutora);
		
		JLabel lblNewLabel_2 = new JLabel("Sob a licença MIT");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(56, 82, 127, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Sobre.class.getResource("/img/mit-icon.png")));
		lblNewLabel_3.setBounds(260, 101, 128, 103);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Sobre.class.getResource("/img/icon.png")));
		lblLogo.setBounds(10, 3, 40, 56);
		getContentPane().add(lblLogo);
		
		JLabel lblThainara = new JLabel("THAINARA PIRES DA SILVA");
		lblThainara.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblThainara.setBounds(20, 230, 230, 14);
		getContentPane().add(lblThainara);
		
		JLabel lblVersao = new JLabel("VERSÃO: 1.0 BETA");
		lblVersao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVersao.setBounds(55, 43, 163, 14);
		getContentPane().add(lblVersao);
		
		JLabel txtMIT = new JLabel("SISTEMA PARA GESTÃO DA EMPRESA");
		txtMIT.setBounds(20, 118, 230, 14);
		getContentPane().add(txtMIT);
		
		JLabel lblNewLabel = new JLabel("SP ASSISTENCIA ELETRODOMÉSTICOS.");
		lblNewLabel.setBounds(19, 129, 243, 14);
		getContentPane().add(lblNewLabel);
		
	
	}
}
