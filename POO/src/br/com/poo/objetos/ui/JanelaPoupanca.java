package br.com.poo.objetos.ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.poo.classes.ContaPoupanca;
import javax.swing.JTextArea;

public class JanelaPoupanca extends JFrame {

	private JPanel contentPane;
	private JTextField txtAniversario;
	private JTextField txtConta;
	private JTextField txtBanco;
	private JTextField txtAgencia;
	private JTextField txtTitular;
	private JLabel lblAniversario;
	private JButton btnAbrirConta;
	private JButton btnVerificarSaldo;
	private JButton btnDepositar;
	private JButton btnSacar;
	private JTextField txtSaldo;
	private JLabel lblPoupanca;
	private ContaPoupanca cp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPoupanca frame = new JanelaPoupanca();
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
	public JanelaPoupanca() {
		setTitle("Conta poupança");
		setBounds(100, 100, 350, 435);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(231, 117, 20));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtAniversario = new JTextField();
		txtAniversario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtAniversario.setBounds(107, 134, 73, 20);
		contentPane.add(txtAniversario);
		txtAniversario.setColumns(10);

		JLabel lblBanco = new JLabel("Nº Banco:");
		lblBanco.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBanco.setBounds(190, 49, 84, 14);
		contentPane.add(lblBanco);

		JLabel lblConta = new JLabel("Conta:");
		lblConta.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConta.setBounds(10, 49, 54, 14);
		contentPane.add(lblConta);

		JLabel lblAgencia = new JLabel("Numero da Agência:");
		lblAgencia.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAgencia.setBounds(10, 74, 149, 19);
		contentPane.add(lblAgencia);

		JLabel lblTitular = new JLabel("Titular:");
		lblTitular.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitular.setBounds(10, 104, 65, 14);
		contentPane.add(lblTitular);

		txtConta = new JTextField();
		txtConta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtConta.setColumns(10);
		txtConta.setBounds(63, 46, 117, 20);
		contentPane.add(txtConta);

		txtBanco = new JTextField();
		txtBanco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtBanco.setColumns(10);
		txtBanco.setBounds(272, 46, 54, 20);
		contentPane.add(txtBanco);

		txtAgencia = new JTextField();
		txtAgencia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtAgencia.setColumns(10);
		txtAgencia.setBounds(169, 74, 157, 20);
		contentPane.add(txtAgencia);

		txtTitular = new JTextField();
		txtTitular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTitular.setColumns(10);
		txtTitular.setBounds(74, 101, 252, 20);
		contentPane.add(txtTitular);

		lblAniversario = new JLabel("Aniversário:");
		lblAniversario.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAniversario.setBounds(10, 137, 98, 14);
		contentPane.add(lblAniversario);

		btnAbrirConta = new JButton("Abrir Conta");

		btnAbrirConta.setBounds(31, 182, 128, 53);
		contentPane.add(btnAbrirConta);

		btnVerificarSaldo = new JButton("Verificar Saldo");

		btnVerificarSaldo.setBounds(169, 182, 128, 53);
		contentPane.add(btnVerificarSaldo);

		btnDepositar = new JButton("Depositar");

		btnDepositar.setBounds(31, 246, 128, 53);
		contentPane.add(btnDepositar);

		btnSacar = new JButton("Sacar");

		btnSacar.setBounds(169, 246, 128, 53);
		contentPane.add(btnSacar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 311, 314, 74);
		contentPane.add(scrollPane);

		JTextArea txtResultado = new JTextArea();
		scrollPane.setViewportView(txtResultado);

		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSaldo.setBounds(190, 137, 54, 14);
		contentPane.add(lblSaldo);

		txtSaldo = new JTextField();
		txtSaldo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSaldo.setColumns(10);
		txtSaldo.setBounds(245, 134, 81, 20);
		contentPane.add(txtSaldo);

		lblPoupanca = new JLabel("POUPANÇA");
		lblPoupanca.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPoupanca.setBounds(107, 11, 122, 27);
		contentPane.add(lblPoupanca);

		// EVENTOS
		btnAbrirConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cp = new ContaPoupanca();
				String rs = cp.abrirConta(Long.parseLong(txtConta.getText()), Long.parseLong(txtBanco.getText()),
						Long.parseLong(txtAgencia.getText()), txtTitular.getText(),
						Double.parseDouble(txtSaldo.getText()));
				txtResultado.setText(rs);

				txtBanco.setEnabled(false);
				txtAgencia.setEnabled(false);
				txtTitular.setEnabled(false);
				txtSaldo.setEnabled(false);
				txtConta.setEnabled(false);
				btnAbrirConta.setEnabled(false);
			}
		});

		btnVerificarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(String.valueOf(cp.verificarSaldo()));
			}
		});

		btnDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String valor = JOptionPane.showInputDialog("Digite o valor do depósito");
				txtResultado.setText(cp.depositar(Double.parseDouble(valor)));
			}
		});
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Digite o valor do saque");
				txtResultado.setText(cp.sacar(Double.parseDouble(valor)));
			}
		});
	}
}
