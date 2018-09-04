package Questão_02;

public class Caminhao extends Carro {
	private int carga;

	public Caminhao(int velocidade, double preco, String cor, int carga) {
		super(velocidade, preco, cor);
		this.carga = carga;
	}

	public Caminhao() {
	}

	public int getCarga() {
		return carga;
	}

	public double getPrecoVenda() {
		double precoVenda;
		if (getCarga() > 2000) {
			precoVenda = getPreco() * 0.9;
		} else {
			precoVenda = getPreco() * 0.8;
		}
		return precoVenda;
	}
}