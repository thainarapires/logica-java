package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Fornecedores extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fornecedores dialog = new Fornecedores();
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
	public Fornecedores() {
		getContentPane().setBackground(SystemColor.text);
		setBounds(100, 100, 722, 505);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 702, 38);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("ÁREA DO FORNECEDOR");
		lblTitulo.setForeground(new Color(0, 128, 255));
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
		lblTitulo.setBounds(232, 0, 204, 38);
		panel.add(lblTitulo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 428, 702, 38);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome*");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNome.setBounds(20, 49, 74, 14);
		getContentPane().add(lblNome);
		
		JLabel lblIdFornecedor = new JLabel("ID Fornecedor:");
		lblIdFornecedor.setFont(new Font("Arial", Font.PLAIN, 16));
		lblIdFornecedor.setBounds(346, 287, 136, 14);
		getContentPane().add(lblIdFornecedor);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		textField.setBounds(20, 74, 263, 29);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(350, 312, 219, 29);
		getContentPane().add(textField_1);
		
		JLabel lblCnpj = new JLabel("CNPJ*");
		lblCnpj.setFont(new Font("Arial", Font.PLAIN, 16));
		lblCnpj.setBounds(20, 114, 74, 14);
		getContentPane().add(lblCnpj);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(20, 139, 207, 29);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(237, 139, 207, 29);
		getContentPane().add(textField_3);
		
		JLabel lblCnpj_1 = new JLabel("CNPJ*");
		lblCnpj_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblCnpj_1.setBounds(237, 114, 74, 14);
		getContentPane().add(lblCnpj_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(498, 139, 183, 29);
		getContentPane().add(textField_4);
		
		JLabel lblCnpj_1_1 = new JLabel("CNPJ*");
		lblCnpj_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblCnpj_1_1.setBounds(498, 114, 74, 14);
		getContentPane().add(lblCnpj_1_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(364, 74, 205, 29);
		getContentPane().add(textField_5);
		
		JLabel lblCnpj_2 = new JLabel("CNPJ*");
		lblCnpj_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblCnpj_2.setBounds(365, 49, 204, 14);
		getContentPane().add(lblCnpj_2);
		
		JLabel lblCnpj_2_1 = new JLabel("ID:");
		lblCnpj_2_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblCnpj_2_1.setBounds(583, 49, 74, 14);
		getContentPane().add(lblCnpj_2_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBounds(583, 74, 98, 29);
		getContentPane().add(textField_6);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(293, 77, 55, 23);
		getContentPane().add(btnNewButton);

	}
}
