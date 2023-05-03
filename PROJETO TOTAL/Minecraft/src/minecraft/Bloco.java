package minecraft;

public class Bloco {

	// atributos
	int resistencia;
	String textura;

	// construtor >> inicia um código para cada objeto
	//O construtor precisa ter o mesmo nome da classe
	
	public Bloco() {
	System.out.println(""); //pula linha
	System.out.println("=====");	
	System.out.println("|   |");	
	System.out.println("=====");	
	}
	

	// métodos
	// void é um método simples que vai executar uma ação
	void construir() {
		System.out.println("Bloco colocado");

	}

	void minerar() {
		System.out.println("Recursos obtidos");
	}

	void craftar() {
		System.out.println("Item criado");
	}
}
