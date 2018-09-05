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
		return velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public String getCor() {
		return cor;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPrecoVenda() {
		double precoVenda = getPreco() * 1.35;
		return precoVenda;		
	}
}
