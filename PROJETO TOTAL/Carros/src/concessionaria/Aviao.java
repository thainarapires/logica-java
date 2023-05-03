package concessionaria;

public class Aviao extends Carro{

	int ano;
	String cor;

	public Aviao() {
		System.out.println(""); //pula linha
		System.out.println("======");	
		System.out.println("✈︎✈︎✈︎✈︎");	
		System.out.println("======");	
		}
	
	void ligar() {
		System.out.println("Avião ligado");

	}
	void aterrizar() {
		System.out.println("Aterrizando");
	}

	void desligar() {
		System.out.println("Avião desligado");
	}

	void acelerar() {
		System.out.println("Vonnnnnn ✈︎");
	}
}

