package concessionaria;

import java.util.Random;

public class Carro {
	
	int ano;
	String cor;
	
	public Carro() {
		System.out.println("________________________________________________________");
		// alinha abaixo cria um objeto de nome chassi
		String chassi = new String ("j321ieh12ui31");
		//chassi tb, é uma variavel q recebe os caracteres dentro de ()
		Random gerador = new Random ();
		
		System.out.println("Chassi: * ");
		for (int i = 1; i < 16; i++) {
			char numeracao = (char) gerador.nextInt(chassi.length());
			System.out.print(chassi.charAt(numeracao)); //TIRAR O IN do Println para nao quebrar as linhas
		}
		System.out.println(" *");
	}
	
	void ligar() {
		System.out.println("Ligar o carro");
	}
	void desligar() {
		System.out.println("Desligar o carro");
	}

	void acelerar() {
		System.out.println("Acelerar o carro");
	}

	
}
