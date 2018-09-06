package Questão_02;

public class Sedan extends Carro {
	private int comprimento;

	public Sedan(int velocidade, double preco, String cor, int comprimento) {
		super(velocidade, preco, cor);
		this.comprimento = comprimento;
	}

	public Sedan() {
		super();
	}

	public int getComprimento() {
		return this.comprimento;
	}

	public double getPrecoVenda() {
		if (getComprimento() > 6) {
			return super.getPrecoVenda() * 0.95;
		} else {
			return super.getPrecoVenda() * 0.9;
		}
	}
}
