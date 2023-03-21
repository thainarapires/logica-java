package br.com.logica.inicio;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salario, convenio_medico, vale_transporte, valor, liquido, valorvt;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu salário: ");
		salario = entrada.nextDouble();
		
		System.out.println("Digite o desconto do seu convênio médico: ");
		convenio_medico = entrada.nextDouble();
		
		System.out.println("Digite o desconto do seu vale transporte: ");
		vale_transporte = entrada.nextDouble();
		
		valor = salario * (convenio_medico / 100);
		
		
		valorvt = salario * (vale_transporte / 100);
		liquido = salario - valor-valorvt;
		
		System.out.println("O valor total de desconto é: "+valor+valorvt);

		System.out.println("O salário líquido fica: " +liquido);
		
	}

}
