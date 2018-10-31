package Questão_04_OK;

public class Carro extends Item {
	private String cor;
	private long ano;

	public Carro(String nome, double preco, String cor, long ano) {
		super(nome, preco);
		this.cor = cor;
		this.ano = ano;
	}

	@Override
	public String toString() {
		return super.toString() + " Cor: "+this.cor+" Ano: "+this.ano;
	}
	
	public String getCor() {
		return cor;
	}

	public long getAno() {
		return ano;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setAno(long ano) {
		this.ano = ano;
	}

}