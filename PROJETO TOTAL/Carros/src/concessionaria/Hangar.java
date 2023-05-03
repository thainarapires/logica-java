package concessionaria;

public class Hangar {

	public static void main(String[] args) {
		
		Aviao aviaoBoeing777 = new Aviao();
		aviaoBoeing777.ano = 2020;
		aviaoBoeing777.cor = "Azul";
		System.out.println("Ano: " + aviaoBoeing777.ano);
		System.out.println("Cor: " + aviaoBoeing777.cor);
		aviaoBoeing777.ligar();
		aviaoBoeing777.acelerar();
		aviaoBoeing777.aterrizar();
		aviaoBoeing777.desligar();
		
		Aviao aviaoAmarelo = new Aviao();
		aviaoAmarelo.ano = 2020;
		aviaoAmarelo.cor = "Amarelo";
		System.out.println("");
		System.out.println("Ano: " + aviaoAmarelo.ano);
		System.out.println("Cor: " + aviaoAmarelo.cor);
		aviaoAmarelo.ligar();
		aviaoAmarelo.acelerar();
		aviaoAmarelo.aterrizar();
		aviaoAmarelo.desligar();

	}

}
