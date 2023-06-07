package contas;

public class Conta {
	// atributos
	public String cliente;
	public double saldo;

	public Conta() {
		super();
		System.out.println("Agência 2167 :DDDDD");
	}

	/**
	 * MÉTODO SIMPLES (VOID) EXIBIR O SALDO DA CONTA
	 */
	public void exibirSaldo() {
		System.out.println("Saldo: R$" + saldo);
	}

	/**
	 * MÉTODO COM PARÂMETRO (VARIÁVEL)
	 * 
	 * @param valor
	 */
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Crédito: R$ " + valor);

	}

	public void sacar(double valor) {
		saldo -= valor;
		System.out.println("Débito: R$ " + valor);
	}

	public void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferência: R$ " + valor);

	}

	/**
	 * MÉTODO COM 2 PARÂMETROS (VARIÁVEIS) E RETORNO
	 * 
	 * @param cc1
	 * @param cc2
	 * @return
	 */
	public double soma(double cc1, double cc2) {
		double total = cc1 + cc2;
		return total;

	}
}
