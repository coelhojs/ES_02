package Questão_02;

public class AgenciaDeVeiculos {

	public static void main(String[] args) {
		Carro carro = new Carro(160, 15000.00, "chumbo");
		Caminhao caminhao = new Caminhao(120, 97000.00, "Azul", 16);
		Fiat fiat = new Fiat(160, 15000.00, "chumbo", 7);
		Sedan sedan = new Sedan(160, 15000.00, "chumbo", 7);
		System.out.println("Carro:");
		System.out.println("Velocidade: " + carro.getVelocidade());
		System.out.println("Preço: " + carro.getPreco());
		System.out.println("Cor: " + carro.getCor());
		System.out.println();

		System.out.println("Caminhão:");
		System.out.println("Velocidade: " + caminhao.getVelocidade());
		System.out.println("Preço: " + caminhao.getPreco());
		System.out.println("Preço de Venda: " + caminhao.getPrecoVenda());
		System.out.println("Cor: " + caminhao.getCor());
		System.out.println("Carga: " + caminhao.getCarga());
		System.out.println();

		System.out.println("Fiat:");
		System.out.println("Velocidade: " + fiat.getVelocidade());
		System.out.println("Preço: " + fiat.getPreco());
		System.out.println("Preço de Venda: " + fiat.getPrecoVenda());
		System.out.println("Cor: " + fiat.getCor());
		System.out.println();

		System.out.println("Sedan:");
		System.out.println("Velocidade: " + sedan.getVelocidade());
		System.out.println("Preço: " + sedan.getPreco());
		System.out.println("Preço de Venda: " + sedan.getPrecoVenda());
		System.out.println("Comprimento: " + sedan.getComprimento());
		System.out.println("Cor: " + sedan.getCor());
		System.out.println();
	}
}