package Questão_02;

public class Fiat extends Carro {
	private int descontoDeFabrica;

	public Fiat(int velocidade, double preco, String cor, int descontoDeFabrica) {
		super(velocidade, preco, cor);
		this.descontoDeFabrica = descontoDeFabrica;
	}

	public Fiat() {

	}

	public int getDescontoDeFabrica() {
		return descontoDeFabrica;
	}

	public double getPrecoVenda() {
		
		double precoVenda = getPreco() * ((100 - (double)getDescontoDeFabrica()) / 100);
		return precoVenda;
	}
}