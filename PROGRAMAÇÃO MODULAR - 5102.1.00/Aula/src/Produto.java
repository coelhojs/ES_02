
public class Produto {
	private String descricao;
	private float preco;
	private int quant;

	public boolean emEstoque() {
		return (quant > 0);
	}

	public String getDescricao() {
		return descricao;
	}

	public float getPreco() {
		return preco;
	}

	public int getQuant() {
		return quant;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public Produto(String descricao, float preco, int quant) {
		this.setDescricao(descricao);
		this.setPreco(preco);
		this.setQuant(quant);
	}
}
