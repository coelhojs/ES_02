package Quest�o_02;

public class Sedan extends Carro {
	private int comprimento;

	public Sedan(int velocidade, double preco, String cor, int comprimento) {
		super(velocidade, preco, cor);
		this.comprimento = comprimento;
	}

	public Sedan() {
		
	}
	
	public int getComprimento() {
		return comprimento;
	}

	public double getPrecoVenda() {
		double precoVenda;
		if (getComprimento() > 6) {
			precoVenda = getPreco() * 0.95;
		} else {
			precoVenda = getPreco() * 0.9;
		}
		return precoVenda;
	}
}