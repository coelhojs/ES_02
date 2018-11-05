package Questão_02;

public class Arvore {
	private int contador, comparador;

	public class No {
		public int elemento;
		public No esq, dir;

		public No(int elemento) {
			this(elemento, null, null);
		}

		public No(int elemento, No esq, No dir) {
			this.elemento = elemento;
			this.esq = esq;
			this.dir = dir;
		}
	}

	private No raiz;

	public Arvore() {
		this.raiz = null;
	}

	public void inserir(int item) throws Exception {
		this.raiz = inserir(item, this.raiz);
	}

	private No inserir(int item, No raiz) throws Exception {
		if (raiz == null)
			raiz = new No(item);
		else if (item < raiz.elemento)
			raiz.esq = inserir(item, raiz.esq);
		else if (item > raiz.elemento)
			raiz.dir = inserir(item, raiz.dir);
		else
			throw new Exception("Erro insercao");
		return raiz;
	}

	public boolean pesquisar(int item) {
		return pesquisar(item, this.raiz);
	}

	private boolean pesquisar(int item, No raiz) {
		if (raiz == null)
			return false;
		else if (item == raiz.elemento)
			return true;
		else if (item < raiz.elemento)
			return pesquisar(item, raiz.esq);
		else
			return pesquisar(item, raiz.dir);
	}

	public void remover(int item) throws Exception {
		this.raiz = remover(item, this.raiz);
	}

	private No remover(int item, No raiz) throws Exception {
		if (raiz == null)
			throw new Exception("Erro remocao");
		else if (item < raiz.elemento)
			raiz.esq = remover(item, raiz.esq);
		else if (item > raiz.elemento)
			raiz.dir = remover(item, raiz.dir);
		else if (raiz.dir == null)
			raiz = raiz.esq;
		else if (raiz.esq == null)
			raiz = raiz.dir;
		else
			raiz.esq = anterior(raiz, raiz.esq);
		return raiz;
	}

	private No anterior(No i, No j) {
		if (j.dir != null)
			j.dir = anterior(i, j.dir);
		else {
			i.elemento = j.elemento;
			j = j.esq;
		}
		return j;
	}

	public void mostrarCentral() {
		mostrarCentral(this.raiz);
		System.out.print("\n");
	}

	private void mostrarCentral(No raiz) {
		if (raiz != null) {
			mostrarCentral(raiz.esq);
			System.out.print(raiz.elemento + " ");
			mostrarCentral(raiz.dir);
		}
	}

	public void mostrarPre() {
		mostrarPre(this.raiz);
		System.out.print("\n");
	}

	private void mostrarPre(No raiz) {
		if (raiz != null) {
			System.out.print(raiz.elemento + " ");
			mostrarPre(raiz.esq);
			mostrarPre(raiz.dir);
		}
	}

	public void mostrarPos() {
		mostrarPos(this.raiz);
		System.out.print("\n");
	}

	private void mostrarPos(No raiz) {
		if (raiz != null) {
			mostrarPre(raiz.esq);
			mostrarPre(raiz.dir);
			System.out.print(raiz.elemento + " ");
		}
	}

	public int numFolhas() {
		this.contador = 0;
		numFolhas(this.raiz);
		return this.contador - 1; // subtrai 1, para descartar a raiz que não é considerada uma folha
	}

	private void numFolhas(No raiz) { // usa-se o metodo mostrar modificado em vez de imprimir, se usa um contador
		if (raiz != null) {
			numFolhas(raiz.esq);
			this.contador++;
			numFolhas(raiz.dir);
		}
	}

	public int numComparador() {
		this.comparador = 0;
		return numComparardor(this.raiz, 1);
	}

	private int numComparardor(No raiz, int multiplicador) {
		if (raiz != null) {
			this.comparador = numComparardor(raiz.esq, multiplicador++);
			this.comparador = numComparardor(raiz.dir, multiplicador++);
			return (this.comparador + raiz.elemento * multiplicador);
		}
		return this.comparador;
	}
}
