package Questão_02;

public class Fiat extends Carro {
	private int descontoDeFabrica;
	
	public Fiat(int velocidade, double preco, String cor, int descontoDeFabrica) {
		super(velocidade, preco, cor);
		this.descontoDeFabrica = descontoDeFabrica;
	}
	
	public Fiat () {
		super();
	}
	
	public int getDescontoDeFabrica() {
		return this.descontoDeFabrica;
	}
	
	public double getPrecoVenda() {
		return super.getPrecoVenda() - getDescontoDeFabrica();
	}

}
