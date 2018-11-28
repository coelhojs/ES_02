package Questão_01;

public abstract class Setor {
	private Setor prox;

	public void setProx(Setor prox) {
		this.prox = prox;
	}

	public abstract void aprovar(Compra compra);

	public void analisar(Compra compra) {
		if (!aprovar(compra) && prox != null) {
			prox.analisar(compra);
		}
	}
}
