package Questão_02;

public class Fiat extends Carro {
	private int descontoDeFabrica;

	public Fiat(int velocidade, double preco, String cor, int descontoDeFabrica) {
		super(velocidade, preco, cor);
		this.descontoDeFabrica = descontoDeFabrica;
	}

	public Fiat() {

	}

	public double getPrecoVenda() {
		double precoVenda = getPreco() * (descontoDeFabrica / 100);
		return precoVenda;
	}
}
