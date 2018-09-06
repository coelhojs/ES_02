package Questão_02;

public class Carro {
	private int velocidade;
	private double preco;
	private String cor;

	public Carro(int velocidade, double preco, String cor) {
		this.velocidade = velocidade;
		this.preco = preco;
		this.cor = cor;
	}

	public Carro() {

	}

	public int getVelocidade() {
		return this.velocidade;
	}

	public double getPrecoVenda() {
		return this.preco;
	}

	public String getCor() {
		return this.cor;
	}
}
