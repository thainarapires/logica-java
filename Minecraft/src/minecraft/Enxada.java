package minecraft;
// a palavra Extends cria uma herança (herança reutiliza variáveis de outra class que voce ja criou)
public class Enxada extends Bloco {
	//atributos
	//boolean é uma variável que só aceita true or false
	
	boolean conquista;
	//métodos 
	
	//construtor 
	public Enxada() {
		System.out.println("");
		System.out.println("enxada");
	}
	public void arar( ) {
		System.out.println("Terra arada ._._._.");
		conquista = true;
	}
}
