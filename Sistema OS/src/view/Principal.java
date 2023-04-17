package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DAO;
import java.awt.Font;
import javax.swing.UIManager;

public class Principal extends JFrame {
	// Instanciar objetos JDBC
	private Connection con;
	DAO dao = new DAO();
	private PreparedStatement pst;
	private ResultSet rs;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblStatus;
	private JLabel lblData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/img/icon.png")));
			addWindowListener(new WindowAdapter() {
				@Override
				public void windowActivated(WindowEvent e) {
					// ativação da janela
					status();
					setarData();
				
				}
			});
		
		
		setTitle("SP Assistencia Eletrodomésticos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 402);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnUsuarios = new JButton("");
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuarios usuarios = new Usuarios();
				usuarios.setVisible(true);
				
			}
		});
		btnUsuarios.setIcon(new ImageIcon(Principal.class.getResource("/img/4960335_cogwheel_gear_setting_wrench_icon.png")));
		btnUsuarios.setBounds(113, 114, 128, 128);
		contentPane.add(btnUsuarios);
		
		JButton btnSobre = new JButton("");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnSobre.setContentAreaFilled(false);
		btnSobre.setBorder(null);
		btnSobre.setBorderPainted(false);
		btnSobre.setIcon(new ImageIcon(Principal.class.getResource("/img/about.png")));
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setToolTipText("Sobre");
		btnSobre.setBounds(263, 275, 48, 48);
		contentPane.add(btnSobre);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 326, 497, 37);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblData = new JLabel("New label");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblData.setBounds(10, 8, 262, 17);
		panel.add(lblData);
		
		lblStatus = new JLabel("");
		lblStatus.setBounds(306, 274, 48, 48);
		contentPane.add(lblStatus);
		lblStatus.setIcon(new ImageIcon(Principal.class.getResource("/img/dataoff.png")));
		lblStatus.setToolTipText("Banco de dados");
		
		JLabel lblNewLabel = new JLabel("SP ASSISTÊNCIA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(99, 12, 188, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ELETRODOMÉSTICOS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(113, 36, 200, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblMenu = new JLabel("USUARIOS");
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMenu.setBounds(143, 89, 72, 14);
		contentPane.add(lblMenu);
	

	}
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
				lblStatus.setIcon(new ImageIcon(Principal.class.getResource("/img/dataoff.png")));
			} else {
				// System.out.println("Banco conectado");
				lblStatus.setIcon(new ImageIcon(Principal.class.getResource("/img/dataon.png")));
			}
			// Nunca esquecer de fechar a conexão
			con.close();
		} catch (Exception e) {
			System.out.println(e);

		}

	}//Fim do método status

	/**
	 * Método responsável por setar a data no rodape
	 */
	private void setarData() {
		Date data = new Date();
		//CRIAR OBJETO PARA FORMATAR A DATA
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
		//alterar o texto da label pela data atual formataada
		lblData.setText(formatador.format(data));
		}
}
