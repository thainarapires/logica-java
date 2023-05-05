package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.DAO;
import utils.Validador;

public class Agenda extends JFrame {
	// Instanciar objetos JDBC
	DAO dao = new DAO();
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtFone;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JLabel lblStatus;
	private JButton btnAdicionar;
	private JButton btnDeletar;
	private JButton btnEditar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda frame = new Agenda();
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
	public Agenda() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				// ativação da janela
				status();
			}
		});
		setBackground(new Color(255, 255, 255));
		setResizable(false);
		setTitle("Agenda de contatos");
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(Agenda.class.getResource("/img/299047_address_book_icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 309);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblID = new JLabel("ID:");
		lblID.setBounds(11, 11, 52, 14);
		contentPane.add(lblID);

		txtID = new JTextField();
		txtID.setEditable(false);
		txtID.setBounds(83, 8, 131, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);

		JLabel lblNome = new JLabel("*Nome:");
		lblNome.setBounds(11, 36, 52, 14);
		contentPane.add(lblNome);

		JLabel lblFone = new JLabel("*Fone:");
		lblFone.setBounds(11, 65, 52, 14);
		contentPane.add(lblFone);

		txtFone = new JTextField();
		txtFone.setColumns(10);
		txtFone.setBounds(83, 61, 131, 20);
		contentPane.add(txtFone);
		//uso do Validador
		txtFone.setDocument(new Validador(15));

		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(83, 33, 223, 20);
		contentPane.add(txtNome);
		//uso do Validador
		txtNome.setDocument(new Validador(50));
		

		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(11, 92, 52, 14);
		contentPane.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(83, 89, 325, 20);
		contentPane.add(txtEmail);
		//uso do Validador
		txtEmail.setDocument(new Validador(50));

		btnAdicionar = new JButton("");
		btnAdicionar.setEnabled(false);
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionar();
			}
		});
		btnAdicionar.setContentAreaFilled(false);
		btnAdicionar.setBorder(null);
		btnAdicionar.setToolTipText("Adicionar contato");
		btnAdicionar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionar.setBorderPainted(false);
		btnAdicionar.setIcon(new ImageIcon(Agenda.class.getResource("/img/addcontact.png")));
		btnAdicionar.setBounds(21, 137, 48, 48);
		contentPane.add(btnAdicionar);

		btnDeletar = new JButton("");
		btnDeletar.setEnabled(false);
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				excluirContato();
			}
		});
		btnDeletar.setContentAreaFilled(false);
		btnDeletar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDeletar.setToolTipText("Deletar contato");
		btnDeletar.setBorderPainted(false);
		btnDeletar.setIcon(new ImageIcon(Agenda.class.getResource("/img/delet.png")));
		btnDeletar.setBounds(112, 137, 48, 48);
		contentPane.add(btnDeletar);

		btnEditar = new JButton("");
		btnEditar.setEnabled(false);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editarContato();
				
			}
		});
		btnEditar.setContentAreaFilled(false);
		btnEditar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEditar.setToolTipText("Editar contato");
		btnEditar.setBorderPainted(false);
		btnEditar.setIcon(new ImageIcon(Agenda.class.getResource("/img/edit.png")));
		btnEditar.setBounds(206, 137, 48, 48);
		contentPane.add(btnEditar);

		JButton btnApagar = new JButton("");
		btnApagar.setContentAreaFilled(false);
		btnApagar.setBorder(null);
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnApagar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnApagar.setIcon(
				new ImageIcon(Agenda.class.getResource("/img/2064480_education_eraser_learn_student_study_icon.png")));
		btnApagar.setToolTipText("Apagar");
		btnApagar.setBorderPainted(false);
		btnApagar.setBounds(294, 137, 63, 48);
		contentPane.add(btnApagar);

		JButton btnPesquisar = new JButton("");
		btnPesquisar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// evento clicar no botão
				buscar();

			}
		});
		btnPesquisar.setContentAreaFilled(false);
		btnPesquisar.setToolTipText("Procurar");
		btnPesquisar.setBorderPainted(false);
		btnPesquisar.setIcon(new ImageIcon(Agenda.class.getResource("/img/zoom.png")));
		btnPesquisar.setBounds(316, 26, 41, 41);
		contentPane.add(btnPesquisar);

		lblStatus = new JLabel("");
		lblStatus.setToolTipText("");
		lblStatus.setIcon(new ImageIcon(Agenda.class.getResource("/img/dataoff.png")));
		lblStatus.setBounds(413, 211, 48, 48);
		contentPane.add(lblStatus);

		// substituir o click pela tecla <ENTER> em um botão
		getRootPane().setDefaultButton(btnPesquisar);

		JButton btnSobre = new JButton("");
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setContentAreaFilled(false);
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// clicar no botão
				// mostrar a janela sobre
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnSobre.setToolTipText("Sobre");
		btnSobre.setBorderPainted(false);
		btnSobre.setIcon(new ImageIcon(Agenda.class.getResource("/img/about.png")));
		btnSobre.setBounds(398, 8, 63, 41);
		contentPane.add(btnSobre);

	}// FIM DO CONSTRUTOR

	/**
	 * Método responsável por limpar os campos
	 */
	private void limparCampos() {
		txtID.setText(null);
		txtFone.setText(null);
		txtNome.setText(null);
		txtEmail.setText(null);
		btnAdicionar.setEnabled(false);
		btnEditar.setEnabled(false);
		btnDeletar.setEnabled(false);
		
	}// FIM DO MÉTODO LIMPAR CAMPOS

	/**
	 * Método responsável por exibir o status da conexão
	 * 
	 */

	private void status() {
		try {
			// abrir a conexão
			con = dao.conectar();
			if (con == null) {
				// System.out.println("Erro de conexão");
				lblStatus.setIcon(new ImageIcon(Agenda.class.getResource("/img/dataoff.png")));
			} else {
				// System.out.println("Banco conectado");
				lblStatus.setIcon(new ImageIcon(Agenda.class.getResource("/img/dataon.png")));
			}
			// Nunca esquecer de fechar a conexão
			con.close();
		} catch (Exception e) {
			System.out.println(e);

		}

	}// FIM DO MÉTODO STATUS()

	/**
	 * Método para buscar um contato pelo nome
	 */
	private void buscar() {

		// System.out.println("Teste do botão buscar");

		// Criar uma variável com a query (instrução do banco)

		// Tratamento de exceções
		String read = "select * from contatos where nome = ?";
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
				txtFone.setText(rs.getString(3)); // 3º Campo da Tabela ID
				txtEmail.setText(rs.getString(4)); // 4º Campo da Tabela ID
				//validação (liberação dos botões alterar e excluir)
				btnEditar.setEnabled(true);
				btnDeletar.setEnabled(true);
			} else {
				//se nao existir um contato no banco
				// System.out.println("Contatos não cadastrados");
				JOptionPane.showMessageDialog(null, "Contato inexistente");
				btnAdicionar.setEnabled(true);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);

		}

	}// Fim do metodo buscar

	/**
	 * Metodo add novo contato
	 */

	private void adicionar() {
		// System.out.println("Teste");
		// validação de campos obrigatórios

		if (txtNome.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o nome do contato");
			txtNome.requestFocus();
		} else if (txtFone.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o fone do contato");
			txtFone.requestFocus();
		} else {
			// lógica principal
			// CRUD Create
			String create = "insert into contatos(nome,fone,email) values (?,?,?)";
			// tratamento de exceções

			try {
				// abrir conexao
				con = dao.conectar();
				// preparar a execução da query (instrução sql, CRUD CREATE)
				pst = con.prepareStatement(create);
				pst.setString(1, txtNome.getText());
				pst.setString(2, txtFone.getText());
				pst.setString(3, txtEmail.getText());
				// executa a query(instrução sql, CRUD)
				pst.executeUpdate();
				// confirmar
				JOptionPane.showMessageDialog(null, "Contato adicionado");
				// limpar campos
				limparCampos();

				// fechar conection
				con.close();

			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}// fim do método add
	
	/** 
	 * metodo para editar um contato (atenção, usar o id)
	 * 
	 * 
	 */
	private void editarContato() {
	//	System.out.println("teste do botão editar");
	//validar campos obrigatorios
		if (txtNome.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Digite o nome do contato");
			txtNome.requestFocus();
		
		}	else if (txtFone.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Digite o fone do contato");
			txtFone.requestFocus();
		} else {
			//logica principal
			//CRUD - Update
			String update = "update contatos set nome =?, fone=?, email=? where id=?";
			//trat de exceção
			try {
				//abrir conexão
				con = dao.conectar();
				//preparar a query
				pst = con.prepareStatement(update);
				pst.setString(1, txtNome.getText());
				pst.setString(2, txtFone.getText());
				pst.setString(3, txtEmail.getText());
				pst.setString(4, txtID.getText());
				//Executar query
				pst.executeUpdate();
				//confirmar para o user
				JOptionPane.showMessageDialog(null, "Dados do contato editados com sucesso!");
				//limpar campos
				limparCampos();
				//fechar conexao
				con.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
	}//FIM DO MÉTODO EDITAR CONTATO
	
	//Excluir contato
	private void excluirContato() {
		//System.out.println("teste");
		//validação de exclusao - a variável confirma captura a opção escolhida.
		int confirma = JOptionPane.showConfirmDialog(null, "Confirma a exclusão deste contato?", "Atenção", JOptionPane.YES_NO_OPTION);
		if (confirma == JOptionPane.YES_OPTION) {
			// CRUD - Delete vai excluir o contato
			String delete = "delete from contatos where id=?";
			//tratamento de exceção
			try {
				//abrir conexão 
				con = dao.conectar();
				//preparar a query
				pst = con.prepareStatement(delete);
				pst.setString(1, txtID.getText());
				//executar query
				pst.executeUpdate();
				//confirmar para o user
				JOptionPane.showMessageDialog(null, "Contato excluido");
				//limpar campos
				limparCampos();
				//fechar conexao
				con.close();
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}//Fim do método excluir contato
}
// FIM DE CÓDIGO
