package Aula07_AVL;

class No {
	public int elemento; // Conteudo do no.
	public No esq; // No da esquerda.
	public No dir; // No da direita.
	public int nivel; // Numero de niveis abaixo do no

	No(int elemento) {
		this(elemento, null, null, 1);
	}

	No(int elemento, No esq, No dir, int nivel) {
		this.elemento = elemento;
		this.esq = esq;
		this.dir = dir;
		this.nivel = nivel;
	}

	public No setNivel() {
		this.nivel = 1 + Math.max(getNivel(esq), getNivel(dir));
		return this;
	}

	public static int getNivel(No no) {
		return (no == null) ? 0 : no.nivel;
	}
}
