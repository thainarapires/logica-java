package br.com.projeto.papelaria.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import br.com.projeto.papelaria.dominio.Tipo;
import javax.swing.JButton;

public class TelaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField textField_2;
	private JLabel lblLogradouro;
	private JLabel lblTipo;
	private JTextField txtCPF;
	private JTextField txtNumero;
	private JTextField textField_6;
	private JLabel lblComplemento;
	private JTextField textField_7;
	private JLabel lblCEP;
	private JTextField txtCEP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente frame = new TelaCliente();
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
	public TelaCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 319);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 249, 249));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome*");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(10, 11, 86, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 28, 241, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEmail.setBounds(10, 59, 86, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(10, 76, 241, 20);
		contentPane.add(txtEmail);
		
		JLabel lblTelefone = new JLabel("Telefone*");
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefone.setBounds(261, 59, 86, 14);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(261, 76, 214, 20);
		contentPane.add(txtTelefone);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 172, 241, 20);
		contentPane.add(textField_2);
		
		lblLogradouro = new JLabel("Logradouro*");
		lblLogradouro.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLogradouro.setBounds(10, 155, 86, 14);
		contentPane.add(lblLogradouro);
		
		lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTipo.setBounds(10, 107, 86, 14);
		contentPane.add(lblTipo);
		
		JComboBox cboTipo = new JComboBox();
		cboTipo.setModel(new DefaultComboBoxModel(Tipo.values()));
		cboTipo.setBounds(10, 124, 74, 20);
		contentPane.add(cboTipo);
		
		JLabel lblCpf_1 = new JLabel("CPF*");
		lblCpf_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCpf_1.setBounds(261, 11, 86, 14);
		contentPane.add(lblCpf_1);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(261, 28, 214, 20);
		contentPane.add(txtCPF);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(261, 172, 61, 20);
		contentPane.add(txtNumero);
		
		JLabel lblNumero = new JLabel("Nº*");
		lblNumero.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNumero.setBounds(261, 155, 40, 14);
		contentPane.add(lblNumero);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Arial", Font.PLAIN, 14));
		lblBairro.setBounds(261, 107, 203, 14);
		contentPane.add(lblBairro);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(261, 124, 214, 20);
		contentPane.add(textField_6);
		
		lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblComplemento.setBounds(332, 155, 133, 14);
		contentPane.add(lblComplemento);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(332, 172, 143, 20);
		contentPane.add(textField_7);
		
		lblCEP = new JLabel("CEP*");
		lblCEP.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCEP.setBounds(94, 107, 157, 14);
		contentPane.add(lblCEP);
		
		txtCEP = new JTextField();
		txtCEP.setColumns(10);
		txtCEP.setBounds(94, 124, 157, 20);
		contentPane.add(txtCEP);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(335, 222, 86, 30);
		contentPane.add(btnSalvar);
	}
}
