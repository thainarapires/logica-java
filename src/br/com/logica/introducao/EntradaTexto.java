package br.com.logica.introducao;

import java.util.Scanner;

public class EntradaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		
		Scanner texto = new Scanner(System.in);
		System.out.println("Digite o seu nome:");
		nome = texto.next(); 
		System.out.println("Olá " + nome);
	}

}
