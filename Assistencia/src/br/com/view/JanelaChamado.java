package br.com.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.dao.CRUDChamado;
import br.com.dominio.Chamado;

public class JanelaChamado extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtDepartamento;
	private JTextField txtDescricao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaChamado frame = new JanelaChamado();
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
	public JanelaChamado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Preencha todos os campos para efetuar um chamado");
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 14));
		lblTitulo.setBounds(224, 11, 381, 28);
		contentPane.add(lblTitulo);
		
		JLabel lblNome = new JLabel("Insira seu nome:");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNome.setBounds(224, 64, 113, 14);
		contentPane.add(lblNome);
		
		JLabel lblDepartamento = new JLabel("Informe o departamento que deseja falar:");
		lblDepartamento.setFont(new Font("Arial", Font.PLAIN, 16));
		lblDepartamento.setBounds(224, 128, 292, 14);
		contentPane.add(lblDepartamento);
		
		txtNome = new JTextField();
		txtNome.setBounds(224, 89, 292, 28);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setColumns(10);
		txtDepartamento.setBounds(224, 153, 292, 28);
		contentPane.add(txtDepartamento);
		
		JLabel lblProblema = new JLabel("Conte-nos mais sobre o seu problema:");
		lblProblema.setFont(new Font("Arial", Font.PLAIN, 16));
		lblProblema.setBounds(224, 207, 292, 14);
		contentPane.add(lblProblema);
		
		JLabel lblChamado = new JLabel("Registrar Chamado");
		lblChamado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Chamado soliChamado = new Chamado(); 
				CRUDChamado cc = new CRUDChamado();
				 
				if(txtNome.getText().trim().equals("") || 
				txtDepartamento.getText().trim().equals("") || 
				txtDescricao.getText().trim().equals("")) { 
				JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.", "Erro 4000765x" , JOptionPane.ERROR_MESSAGE); 
				} 
				else { 
					soliChamado.setSolicitacao(txtNome.getText()); 
					 
					soliChamado.setDepSolicitado(txtDepartamento.getText()); 
					 
					soliChamado.setDescChamado(txtDescricao.getText()); 
					 
					JOptionPane.showMessageDialog(null, cc.registrar(soliChamado)); 
					 
					
				}

				
			}
		});
		lblChamado.setFont(new Font("Arial", Font.PLAIN, 14));
		lblChamado.setBounds(40, 179, 139, 28);
		contentPane.add(lblChamado);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(224, 232, 393, 194);
		contentPane.add(scrollPane);
		
		txtDescricao = new JTextField();
		scrollPane.setViewportView(txtDescricao);
		txtDescricao.setColumns(10);
	}
}
