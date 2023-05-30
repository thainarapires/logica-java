package br.com.projeto.papelaria.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	private JDesktopPane contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/br/com/projeto/papelaria/img/paper.png")));
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 223, 242));
		setJMenuBar(menuBar);
		
		JMenu menuCadastrar = new JMenu("Cadastrar |");
		menuCadastrar.setBackground(new Color(255, 230, 230));
		menuCadastrar.setFont(new Font("Arial", Font.PLAIN, 18));
		menuBar.add(menuCadastrar);
		
		JMenuItem mniUsuario = new JMenuItem("Usuário");
		mniUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
		mniUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
	//			new JanelaUsuario().setVisible(true);
				JanelaUsuario janelausuario = new JanelaUsuario();
				janelausuario.setClosable(true);
				janelausuario.setIconifiable(true);
				janelausuario.setResizable(true);
				
				janelausuario.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
				getContentPane().add(janelausuario);
				
				janelausuario.setVisible(true);
			}
		});
		mniUsuario.setBackground(new Color(255, 223, 242));
		menuCadastrar.add(mniUsuario);
		
		JMenuItem mniConsulta = new JMenuItem("Consulta");
		mniConsulta.setFont(new Font("Arial", Font.PLAIN, 14));
		mniConsulta.setBackground(new Color(255, 223, 242));
		menuCadastrar.add(mniConsulta);
		
		JMenuItem mniFornecedor = new JMenuItem("Fornecedor");
		mniFornecedor.setFont(new Font("Arial", Font.PLAIN, 14));
		mniFornecedor.setBackground(new Color(255, 223, 242));
		menuCadastrar.add(mniFornecedor);
		
		JMenuItem mniFuncionario = new JMenuItem("Funcionário");
		mniFuncionario.setFont(new Font("Arial", Font.PLAIN, 14));
		mniFuncionario.setBackground(new Color(255, 223, 242));
		menuCadastrar.add(mniFuncionario);
		
		JMenuItem mniPedido = new JMenuItem("Pedido");
		mniPedido.setFont(new Font("Arial", Font.PLAIN, 14));
		mniPedido.setBackground(new Color(255, 223, 242));
		menuCadastrar.add(mniPedido);
		
		JMenuItem mniProduto = new JMenuItem("Produto");
		mniProduto.setFont(new Font("Arial", Font.PLAIN, 14));
		mniProduto.setBackground(new Color(255, 223, 242));
		menuCadastrar.add(mniProduto);
		
		JMenu menuConsulta = new JMenu("Consulta |");
		menuConsulta.setFont(new Font("Arial", Font.PLAIN, 18));
		menuConsulta.setBackground(new Color(255, 230, 230));
		menuBar.add(menuConsulta);
		
		JMenuItem mniConUsuario = new JMenuItem("Usuário");
		mniConUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
		mniConUsuario.setBackground(new Color(255, 223, 242));
		menuConsulta.add(mniConUsuario);
		
		JMenuItem mniConCliente = new JMenuItem("Cliente");
		mniConCliente.setFont(new Font("Arial", Font.PLAIN, 14));
		mniConCliente.setBackground(new Color(255, 223, 242));
		menuConsulta.add(mniConCliente);
		
		JMenuItem mniConFornecedor = new JMenuItem("Fornecedor");
		mniConFornecedor.setFont(new Font("Arial", Font.PLAIN, 14));
		mniConFornecedor.setBackground(new Color(255, 223, 242));
		menuConsulta.add(mniConFornecedor);
		
		JMenuItem mniConFuncionario = new JMenuItem("Funcionário");
		mniConFuncionario.setFont(new Font("Arial", Font.PLAIN, 14));
		mniConFuncionario.setBackground(new Color(255, 223, 242));
		menuConsulta.add(mniConFuncionario);
		
		JMenuItem mniConPedido = new JMenuItem("Pedido");
		mniConPedido.setFont(new Font("Arial", Font.PLAIN, 14));
		mniConPedido.setBackground(new Color(255, 223, 242));
		menuConsulta.add(mniConPedido);
		
		JMenuItem mniConProduto = new JMenuItem("Produto");
		mniConProduto.setFont(new Font("Arial", Font.PLAIN, 14));
		mniConProduto.setBackground(new Color(255, 223, 242));
		menuConsulta.add(mniConProduto);
		
		JMenuItem mniConPagamento = new JMenuItem("Pagamento");
		mniConPagamento.setFont(new Font("Arial", Font.PLAIN, 14));
		mniConPagamento.setBackground(new Color(255, 223, 242));
		menuConsulta.add(mniConPagamento);
		contentPane = new JDesktopPane();
		contentPane.setBackground(new Color(255, 249, 249));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
