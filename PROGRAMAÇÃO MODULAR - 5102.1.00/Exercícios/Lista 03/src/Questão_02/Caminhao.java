/package Questão_02;

public class Caminhao extends Carro {
	private int carga;

	public Caminhao(int velocidade, double preco, String cor, int carga) {
		super(velocidade, preco, cor);
		this.carga = carga;
	}

	public Caminhao() {
		super();
	}

	public int getCarga() {
		return this.carga;
	}

	public double getPrecoVenda() {
		if (getCarga() > 2000) {
			return super.getPrecoVenda() * 0.9;
		} else {
			return super.getPrecoVenda() * 0.8;
		}
	}
}
