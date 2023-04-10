package view;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import model.DAO;

public class Usuarios extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JPasswordField passwordSenha;
	private JTextField txtID;
	private JTextField txtLogin;
	private PreparedStatement pst;
	private ResultSet rs;
	private Connection con;
	DAO dao = new DAO();

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
	 * Método responsável por limpar os campos
	 */
	private void limparCampos() {
		txtID.setText(null);
		txtNome.setText(null);
		txtLogin.setText(null);
		passwordSenha.setText(null);

	}// FIM DO MÉTODO LIMPAR CAMPOS

	/**
	 * Create the dialog.
	 */
	public Usuarios() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Usuarios.class.getResource("/img/login.png")));
		lblNewLabel.setBounds(23, 72, 64, 64);
		getContentPane().add(lblNewLabel);

		txtNome = new JTextField();
		txtNome.setBounds(113, 42, 270, 32);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(113, 89, 46, 14);
		getContentPane().add(lblLogin);

		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setBounds(113, 152, 46, 14);
		getContentPane().add(lblSenha);

		passwordSenha = new JPasswordField();
		passwordSenha.setBounds(113, 166, 236, 32);
		getContentPane().add(passwordSenha);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Usuarios.class.getResource("/img/key.png")));
		lblNewLabel_1.setBounds(159, 149, 16, 16);
		getContentPane().add(lblNewLabel_1);

		JLabel lblID = new JLabel("ID");
		lblID.setBounds(305, 89, 46, 14);
		getContentPane().add(lblID);

		txtID = new JTextField();
		txtID.setEditable(false);
		txtID.setBounds(305, 104, 86, 32);
		getContentPane().add(txtID);
		txtID.setColumns(10);

		JLabel lblNome = new JLabel("NOME");
		lblNome.setBounds(113, 27, 46, 14);
		getContentPane().add(lblNome);

		txtLogin = new JTextField();
		txtLogin.setBounds(113, 102, 162, 34);
		getContentPane().add(txtLogin);
		txtLogin.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(0, 219, 434, 42);
		getContentPane().add(panel);

		JButton btnPesquisar = new JButton("");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscar();
			
			}
		});

		btnPesquisar.setContentAreaFilled(false);
		btnPesquisar.setBorderPainted(false);
		btnPesquisar.setSelected(true);
		btnPesquisar.setToolTipText("Pesquisar");
		btnPesquisar.setIcon(new ImageIcon(Usuarios.class.getResource("/img/search.png")));
		btnPesquisar.setBounds(383, 45, 42, 23);
		getContentPane().add(btnPesquisar);

		// substituir o click pela tecla <ENTER> em um botão
		getRootPane().setDefaultButton(btnPesquisar);

		JButton btnApagar = new JButton("");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnApagar.setBorderPainted(false);
		btnApagar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnApagar.setToolTipText("APAGAR TUDO!!!");
		btnApagar.setContentAreaFilled(false);
		btnApagar.setIcon(new ImageIcon(
				Usuarios.class.getResource("/img/2064480_education_eraser_learn_student_study_icon.png")));
		btnApagar.setBounds(359, 164, 54, 34);
		getContentPane().add(btnApagar);

	}

	private void buscar() {

		// System.out.println("Teste do botão buscar");

		// Criar uma variável com a query (instrução do banco)

		// Tratamento de exceções
		String read = "select * from usuarios where nome = ?";
		try {
			// abrir a conexão
			con = dao.conectar();
			// preparar a execucão da query( instrução sql - CRUD Read)
			// o parâmetro 1 substitui a ? pelo conteúdo da caixa de texto
			pst = con.prepareStatement(read);
			pst.setString(1, txtNome.getText());
			// executar a query e buscar o resultado
			rs = pst.executeQuery();
			// uso da estrutura if else para verificar se existe o contato
			// rs.next() -> se existir um contato no banco
			if (rs.next()) {
				// preencher as caixas de texto com as informações

				txtID.setText(rs.getString(1)); // 1º Campo da Tabela ID
				txtNome.setText(rs.getString(2)); // 2º Campo da Tabela ID
				txtLogin.setText(rs.getString(3)); // 3º Campo da Tabela ID
				passwordSenha.setText(rs.getString(4)); // 4º Campo da Tabela ID
			} else {
				// System.out.println("Contaos não cadastrados");
				JOptionPane.showMessageDialog(null, "Contato inexistente");
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);

		}

	
	}
}
