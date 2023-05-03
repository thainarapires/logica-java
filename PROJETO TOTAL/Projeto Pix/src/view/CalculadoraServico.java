package view;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CalculadoraServico extends JFrame {
	Locale localeBR = new Locale("pt","BR");
	
	// CRIAR VARIAVEIS
	// 3 PASSO
	double remuneracao, custo, hora, valor, total;
	int cargaHoraria, estimativa;
	
	NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtRemuneracao;
	private JTextField txtCusto;
	private JTextField txtCargaHoraria;
	private JTextField txtEstimativa;
	private JLabel lblValor;
	private JLabel lblTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraServico frame = new CalculadoraServico();
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
	public CalculadoraServico() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalculadoraServico.class.getResource("/img/54829_calculator_iphone app_app_icon.png")));
		setTitle("Calculadora de serviço  de TI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Renumeração mensal pretendida:");
		lblNewLabel.setBounds(10, 25, 212, 14);
		contentPane.add(lblNewLabel);

		txtRemuneracao = new JTextField();
		txtRemuneracao.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// event digitacao...
				// definir caracteres permitidos (que podem ser digitados)
				String caracteres = "0123456789.";
				// definir caractere nao permitido
				if (!caracteres.contains(e.getKeyChar() + "")) {
					// ignorar
					e.consume();
				}
			}
		});
		txtRemuneracao.setBounds(212, 25, 206, 20);
		contentPane.add(txtRemuneracao);
		txtRemuneracao.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Custo Operacional mensal:");
		lblNewLabel_1.setBounds(10, 85, 164, 14);
		contentPane.add(lblNewLabel_1);

		txtCusto = new JTextField();
		txtCusto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// event digitacao...
				// definir caracteres permitidos (que podem ser digitados)
				String caracteres = "0123456789";
				// definir caractere nao permitido
				if (!caracteres.contains(e.getKeyChar() + "")) {
					// ignorar
					e.consume();
				}

			}
		});
		txtCusto.setBounds(212, 85, 206, 20);
		contentPane.add(txtCusto);
		txtCusto.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Carga horária mensal de trabalho:");
		lblNewLabel_2.setBounds(10, 146, 212, 14);
		contentPane.add(lblNewLabel_2);

		txtCargaHoraria = new JTextField();
		txtCargaHoraria.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				// event digitacao...
				// definir caracteres permitidos (que podem ser digitados)
				String caracteres = "0123456789.";
				// definir caractere nao permitido
				if (!caracteres.contains(e.getKeyChar() + "")) {
					// ignorar
					e.consume();
				}
			}

		});
		txtCargaHoraria.setBounds(212, 146, 206, 20);
		contentPane.add(txtCargaHoraria);
		txtCargaHoraria.setColumns(10);

		JButton btnCalcular = new JButton("");
		btnCalcular.setToolTipText("Calcular");
		btnCalcular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalcular
				.setIcon(new ImageIcon(CalculadoraServico.class.getResource("/img/6590488_and_calculator_education_learning_maths_icon.png")));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 2PASSO
				// ADD EVENT ACTION,DIREITO
				calcular();
			}
		});
		btnCalcular.setBounds(261, 186, 89, 68);
		contentPane.add(btnCalcular);

		JButton btnLimpar = new JButton("");
		btnLimpar.setToolTipText("Apagar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimparCampos();

			}
		});
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setIcon(new ImageIcon(CalculadoraServico.class.getResource("/img/8675036_ic_fluent_eraser_regular_icon.png")));
		btnLimpar.setBounds(90, 186, 89, 68);
		contentPane.add(btnLimpar);

		JLabel lblNewLabel_3 = new JLabel("Valor da Hora:");
		lblNewLabel_3.setBounds(10, 267, 108, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Estimativa de horas de serviço:");
		lblNewLabel_4.setBounds(10, 315, 199, 14);
		contentPane.add(lblNewLabel_4);

		txtEstimativa = new JTextField();
		txtEstimativa.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				// event digitacao...
				// definir caracteres permitidos (que podem ser digitados)
				String caracteres = "0123456789";
				// definir caractere nao permitido
				if (!caracteres.contains(e.getKeyChar() + "")) {
					// ignorar
					e.consume();
				}
			}

		});
		txtEstimativa.setBounds(212, 312, 128, 20);
		contentPane.add(txtEstimativa);
		txtEstimativa.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Total a ser cobrado do cliente:");
		lblNewLabel_5.setBounds(10, 366, 181, 14);
		contentPane.add(lblNewLabel_5);

		lblValor = new JLabel("R$ 0");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValor.setBounds(105, 267, 74, 14);
		contentPane.add(lblValor);

		lblTotal = new JLabel("R$ 0");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotal.setBounds(201, 366, 154, 14);
		contentPane.add(lblTotal);
		
		JButton btnTotal = new JButton("");
		btnTotal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTotal.setToolTipText("TOTAL");
		btnTotal.setIcon(new ImageIcon(CalculadoraServico.class.getResource("/img/equal.png")));
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularTotal();
				
			}
		});
		btnTotal.setBounds(353, 307, 32, 32);
		contentPane.add(btnTotal);
	}// fim do construtor
		// 1PASSO

	private void calcular() {
		// teste do botao calcular
		// 4 passo "comentario,sysem"
		// System.out.println("teste");
		// VALIDACAO DE CAMPOS OBRIGATORIOS 7PASSO
		if (txtRemuneracao.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a renumeração mensal pretendida");
			txtRemuneracao.requestFocus();
		} else if (txtCusto.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o custo operacional mensal");
			txtCusto.requestFocus();
		} else if (txtCargaHoraria.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o carga horaria mensal");
			txtCargaHoraria.requestFocus();
		} else {
			
			// entrada
			remuneracao = Double.parseDouble(txtRemuneracao.getText());
			custo = Double.parseDouble(txtCusto.getText());
			estimativa = Integer.parseInt(txtEstimativa.getText());
			
			cargaHoraria = Integer.parseInt(txtCargaHoraria.getText());
			// 5PASSO
			valor = (remuneracao + (0.3 * remuneracao) + (0.2 * remuneracao) + custo) / cargaHoraria;
			total = valor * estimativa;
			
			DecimalFormat formatador = new DecimalFormat("#0.000");
			lblValor.setText("R$: " + formatador.format(valor));
			
			// formatacao
			lblValor.setText(dinheiro.format(valor));
			lblTotal.setText(dinheiro.format(total));
			
		}
		// saida
		// 6passo

	}

	private void LimparCampos() {
		txtRemuneracao.setText(null);
		txtCusto.setText(null);
		txtCargaHoraria.setText(null);
		txtEstimativa.setText(null);
		lblValor.setText(null);
		lblTotal.setText(null);
		
	}
	/**
	 * método responsável pelo cálculo do valor total do serviço
	 */
	
	private void calcularTotal() {
	//validação de campos obrigatórios
	if (txtEstimativa.getText().isEmpty()) {
		JOptionPane.showMessageDialog(null, "Preencha a estimativa de horas!");
		txtEstimativa.requestFocus();
	} else {
	
	//System.out.println("teste");
		estimativa = Integer.parseInt(txtEstimativa.getText());
	//processamento
		total = estimativa * valor;
		//saida
		DecimalFormat formatador = new DecimalFormat("#0.000");
		lblTotal.setText("R$: " + formatador.format(valor));
	}		
		
		
		
	}
}// fim do codigo
