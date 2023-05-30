package br.com.projeto.papelaria.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.projeto.papelaria.dao.DAOUsuario;
import br.com.projeto.papelaria.dominio.Usuario;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeUsuario;
	private JPasswordField txtSenha;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 249, 249));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome de usuário:");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNome.setBounds(39, 24, 349, 25);
		contentPane.add(lblNome);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSenha.setBounds(39, 114, 349, 25);
		contentPane.add(lblSenha);

		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setBounds(39, 68, 349, 35);
		contentPane.add(txtNomeUsuario);
		txtNomeUsuario.setColumns(10);

		txtSenha = new JPasswordField();
		txtSenha.setBounds(39, 142, 349, 35);
		contentPane.add(txtSenha);

		
		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario us = new Usuario();
				us.setNomeUsuario(txtNomeUsuario.getText());
				us.setSenha(txtSenha.getText());

				DAOUsuario du = new DAOUsuario();
				if (du.logar(us)) {
					Principal p = new Principal();
					p.setState(MAXIMIZED_BOTH);
					p.setVisible(true);
					
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
				}
			}
		});
		btnLogar.setBounds(169, 200, 89, 35);
		contentPane.add(btnLogar);
		getRootPane().setDefaultButton(btnLogar);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
	}

}
