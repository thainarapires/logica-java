package concessionaria;

public class CorAno {

	public static void main(String[] args) {

		Carro carroFusca = new Carro();
		carroFusca.ano = 2020;
		carroFusca.cor = "Azul";
		System.out.println("Ano: " + carroFusca.ano);
		System.out.println("Cor: " + carroFusca.cor);
		carroFusca.ligar();
		carroFusca.acelerar();
		
		Carro carroFerrari = new Carro();
		carroFerrari.ano = 2020;
		carroFerrari.cor = "Amarelo";
		System.out.println("");
		System.out.println("Ano: " + carroFerrari.ano);
		System.out.println("Cor: " + carroFerrari.cor);
		carroFerrari.ligar();
		carroFerrari.acelerar();

		Carro carroUno = new Carro();
		carroUno.ano = 2020;
		carroUno.cor = "Branco";
		System.out.println("");
		System.out.println("Ano: " + carroUno.ano);
		System.out.println("Cor: " + carroUno.cor);
		carroUno.ligar();
		carroUno.acelerar();

		Carro carroCivic = new Carro();
		carroCivic.ano = 2020;
		carroCivic.cor = "Amarelo";
		System.out.println("");
		System.out.println("Ano: " + carroCivic.ano);
		System.out.println("Cor: " + carroCivic.cor);
		carroCivic.ligar();
		carroCivic.acelerar();

	}

}
