package br.com.projeto.papelaria.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.projeto.papelaria.dao.DAOUsuario;
import br.com.projeto.papelaria.dominio.Usuario;

public class JanelaUsuario extends JInternalFrame {

	private JPanel contentPane;
	private JTextField txtNomeUsuario;
	private JPasswordField txtSenha;
	DAOUsuario dao = new DAOUsuario();
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public JanelaUsuario() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 320);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 249, 249));
		panel.setBounds(0, 0, 434, 33);
		contentPane.add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 249, 249));
		panel_1.setBounds(0, 257, 434, 33);
		contentPane.add(panel_1);

		JLabel lblNomeUsuario = new JLabel("Nome do usuário:");
		lblNomeUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNomeUsuario.setBounds(10, 44, 151, 14);
		contentPane.add(lblNomeUsuario);

		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setBounds(10, 64, 414, 20);
		contentPane.add(txtNomeUsuario);
		txtNomeUsuario.setColumns(10);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSenha.setBounds(10, 95, 151, 14);
		contentPane.add(lblSenha);

		JLabel lblNivelAcesso = new JLabel("Nivel acesso:");
		lblNivelAcesso.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNivelAcesso.setBounds(10, 146, 151, 14);
		contentPane.add(lblNivelAcesso);

		JComboBox cboNivelAcesso = new JComboBox();
		cboNivelAcesso.setBackground(new Color(255, 249, 249));
		cboNivelAcesso.setModel(new DefaultComboBoxModel(new String[] { "Admin", "User", "Sales", "Operator" }));
		cboNivelAcesso.setBounds(10, 164, 414, 20);
		contentPane.add(cboNivelAcesso);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(255, 249, 249));
		btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		btnSalvar.setBounds(174, 201, 89, 33);
		contentPane.add(btnSalvar);

		txtSenha = new JPasswordField();
		txtSenha.setBounds(10, 115, 414, 20);
		contentPane.add(txtSenha);

		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario us = new Usuario();
				us.setNomeUsuario(txtNomeUsuario.getText());
				us.setSenha(txtSenha.getText());
				us.setNivelAcesso(cboNivelAcesso.getSelectedItem().toString());
				DAOUsuario du = new DAOUsuario();
				JOptionPane.showMessageDialog(null, du.cadastro(us));
			}
		});
	}

}
