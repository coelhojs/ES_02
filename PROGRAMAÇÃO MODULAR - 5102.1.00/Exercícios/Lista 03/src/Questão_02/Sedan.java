package Questão_02;

public class Sedan extends Carro {
	private int comprimento;

	public Sedan(int velocidade, double preco, String cor, int comprimento) {
		super(velocidade, preco, cor);
		this.comprimento = comprimento;
	}

	public double getPrecoVenda() {
		double precoVenda;
		if (comprimento > 6) {
			precoVenda = getPreco() * 0.95;
		} else {
			precoVenda = getPreco() * 0.9;
		}
		return precoVenda;
	}

}
