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
	}

}
