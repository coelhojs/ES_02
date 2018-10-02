

public class No {
	public int elemento;
	public No esq;
	public No dir;
	public int depth;

	public No(int elemento) {
		this(elemento, null, null, 0);
	}

	public No(int elemento, No esq, No dir, int depth) {
		this.elemento = elemento;
		this.esq = esq;
		this.dir = dir;
		this.depth = depth;
	}
}
