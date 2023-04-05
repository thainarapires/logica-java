package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Usuarios extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtLogin;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuarios dialog = new Usuarios();
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
	public Usuarios() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Usuarios.class.getResource("/img/login.png")));
		lblNewLabel.setBounds(35, 106, 64, 64);
		getContentPane().add(lblNewLabel);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(147, 95, 236, 32);
		getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(147, 80, 46, 14);
		getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setBounds(147, 145, 46, 14);
		getContentPane().add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(147, 163, 236, 32);
		getContentPane().add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Usuarios.class.getResource("/img/key.png")));
		lblNewLabel_1.setBounds(181, 143, 16, 16);
		getContentPane().add(lblNewLabel_1);

	}
}
