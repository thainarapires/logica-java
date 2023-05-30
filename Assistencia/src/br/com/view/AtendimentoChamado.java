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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.dao.CRUDChamado;
import br.com.dominio.Chamado;
import java.awt.Cursor;

public class AtendimentoChamado extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtResolucao;
	private JTextField txtStatus;
	private JTextField txtResponsavel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtendimentoChamado frame = new AtendimentoChamado();
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
	public AtendimentoChamado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblID = new JLabel("ID do Chamado:");
		lblID.setFont(new Font("Arial", Font.PLAIN, 12));
		lblID.setBounds(228, 28, 121, 14);
		contentPane.add(lblID);
		
		JLabel lblStatud = new JLabel("Status Chamado:");
		lblStatud.setFont(new Font("Arial", Font.PLAIN, 12));
		lblStatud.setBounds(426, 28, 133, 14);
		contentPane.add(lblStatud);
		
		JLabel lblDataDeResoluo = new JLabel("Data de resolução do chamado:");
		lblDataDeResoluo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDataDeResoluo.setBounds(184, 97, 176, 14);
		contentPane.add(lblDataDeResoluo);
		
		JLabel lblResponsvel = new JLabel("Responsável do Chamado:");
		lblResponsvel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblResponsvel.setBounds(404, 97, 168, 14);
		contentPane.add(lblResponsvel);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		txtID.setBounds(172, 48, 198, 20);
		contentPane.add(txtID);
		
		txtResolucao = new JTextField();
		txtResolucao.setColumns(10);
		txtResolucao.setBounds(171, 122, 199, 20);
		contentPane.add(txtResolucao);
		
		txtStatus = new JTextField();
		txtStatus.setColumns(10);
		txtStatus.setBounds(381, 48, 198, 20);
		contentPane.add(txtStatus);
		
		txtResponsavel = new JTextField();
		txtResponsavel.setColumns(10);
		txtResponsavel.setBounds(380, 122, 199, 20);
		contentPane.add(txtResponsavel);
		
		JLabel lblObservaes = new JLabel("Observações:");
		lblObservaes.setFont(new Font("Arial", Font.PLAIN, 12));
		lblObservaes.setBounds(313, 182, 121, 14);
		contentPane.add(lblObservaes);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(172, 212, 407, 197);
		contentPane.add(scrollPane);
		
		JTextArea txtObservacoes = new JTextArea();
		scrollPane.setViewportView(txtObservacoes);
		
		JLabel lblAtualizarChamado = new JLabel("Atualizar chamados");
		lblAtualizarChamado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAtualizarChamado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Chamado cr = new Chamado(); 
				CRUDChamado cc = new CRUDChamado();
				 
				if(txtResponsavel.getText().trim().equals("") || txtStatus.getText().trim().equals("") || 	
				txtID.getText().trim().equals("") || txtResolucao.getText().trim().equals("")) {
				 JOptionPane.showMessageDialog(null, "Os campos Responsável Chamado, Id do Chamado,  Status do Chamado e Data de Resolução devem ser preenchidos", 
				"Erro 4000765x" , JOptionPane.ERROR_MESSAGE); 
				} 
				else { 
				 
					
				cr.setDataResolucao(txtResolucao.getText().toString()); 
				cr.setStatusChamado(txtStatus.getText()); 
				cr.setAtendente(txtResponsavel.getText()); 
				cr.setObservacoes(txtObservacoes.getText()); 
				cr.setIdChamado(Long.parseLong(txtID.getText())); 
				 JOptionPane.showMessageDialog(null, cc.atualizar(cr).getSolicitacao()); 
				} 
			}
		});
		lblAtualizarChamado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAtualizarChamado.setBounds(28, 161, 121, 14);
		contentPane.add(lblAtualizarChamado);
		
		JLabel lblExcluirChamados = new JLabel("Excluir chamados");
		lblExcluirChamados.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblExcluirChamados.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CRUDChamado cc = new CRUDChamado();
				
				if(txtID.equals(null)) { 
					JOptionPane.showMessageDialog(null,"Selecione o chamado a ser excluído.","Erro 	4000770x",JOptionPane.ERROR_MESSAGE); 
					} 
					else { 
					if(JOptionPane.showConfirmDialog(null, "Você tem certeza desta ação? \nEstá ação é permanente "+ "e não pode ser desfeita", "ATENÇÃO", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) { 
					Chamado cr = new Chamado(); 
					cr.setIdChamado(Long.parseLong(txtID.getText())); 
					JOptionPane.showConfirmDialog(null, cc.apagar(cr)); 
					} 

					}
			}
		});
		lblExcluirChamados.setFont(new Font("Arial", Font.PLAIN, 12));
		lblExcluirChamados.setBounds(34, 182, 105, 14);
		contentPane.add(lblExcluirChamados);
	}
}
