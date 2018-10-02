
public class ArvoreBinaria {
	private No raiz;

	public ArvoreBinaria() {
		raiz = null;
	}

	public void inserir(int x) throws Exception {
		raiz = inserir(x, raiz);
	}

	private No inserir(int x, No i) throws Exception {
		if (i == null) {
			i = new No(x);
		} else if (x < i.elemento) {
			i.esq = inserir(x, i.esq);
		} else if (x > i.elemento) {
			i.dir = inserir(x, i.dir);
		} else {
			throw new Exception("Erro!");
		}
		return i;
	}

	public boolean pesquisar(int x) {
		return pesquisar(x, raiz);
	}

	private boolean pesquisar(int x, No i) {
		boolean resp;
		if (i == null) {
			resp = false;
		} else if (x == i.elemento) {
			resp = true;
		} else if (x < i.elemento) {
			resp = pesquisar(x, i.esq);
		} else {
			resp = pesquisar(x, i.dir);
		}
		return resp;
	}

	public void remover(int x) throws Exception {
		raiz = remover(x, raiz);
	}

	private No remover(int x, No i) throws Exception {
		if (i == null) {
			throw new Exception("Erro!");
		} else if (x < i.elemento) {
			i.esq = remover(x, i.esq);
		} else if (x > i.elemento) {
			i.dir = remover(x, i.dir);
		} else if (i.dir == null) {
			i = i.esq;
		} else if (i.esq == null) {
			i = i.dir;
		} else {
			i.esq = anterior(i, i.esq);
		}
		return i;
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
		mostrarCentral(raiz);
	}

	private void mostrarCentral(No i) {
		if (i != null) {
			mostrarCentral(i.esq);
			System.out.print(i.elemento + " ");
			mostrarCentral(i.dir);
		}
	}

	public void mostrarPre() {
		mostrarPre(raiz);
	}

	private void mostrarPre(No i) {
		if (i != null) {
			System.out.print(i.elemento + " ");
			mostrarPre(i.esq);
			mostrarPre(i.dir);
		}
	}

	public void mostrarPos() {
		mostrarPos(raiz);
	}

	private void mostrarPos(No i) {
		if (i != null) {
			mostrarPos(i.esq);
			mostrarPos(i.dir);
			System.out.print(i.elemento + " ");
		}
	}

	// códigos dados em aula

	public int contarFolhas() {
		return contarFolhas(raiz);
	}

	private int contarFolhas(No i) {
		int cont = 0;
		if (i != null) {
			if (i.esq == null && i.dir == null) {
				cont++;
			}
			cont += contarFolhas(i.esq);
			cont += contarFolhas(i.dir);
		}
		return cont;
	}

	public int contarNosPreenchidos() {
		return contarNosPreenchidos(raiz);
	}

	private int contarNosPreenchidos(No i) {
		int cont = 0;
		if (i != null) {
			if (i.esq != null && i.dir != null) {
				cont++;
			}
			cont += contarNosPreenchidos(i.esq);
			cont += contarNosPreenchidos(i.dir);
		}
		return cont;
	}

	public int contPares() {
		return contPares(raiz);
	}

	private int contPares(No i) {
		int cont = 0;
		if (i != null) {
			// Par?
			if (i.elemento % 2 == 0) {
				cont++;
			}
			cont += contPares(i.esq);
			cont += contPares(i.dir);
		}
		return cont;
	}

//questão 01
	public int alturaArvore() {
		return alturaArvore(raiz);
	}

	private int alturaArvore(No i) {
		if (i != null) {
			int alturaEsq = alturaArvore(i.esq);
			int alturaDir = alturaArvore(i.dir);
			i.depth = (alturaEsq > alturaDir) ? alturaEsq : alturaDir;
			return i.depth + 1;
		} else {
			return 0;
		}
	}

//questão 02
	public void soma() {
		System.out.println(soma(raiz));
	}

	private int soma(No i) {
		if (i != null) {
			return soma(i.esq) + i.elemento + soma(i.dir);
		} else {
			return 0;
		}
	}

//questão 03
	public boolean checkTree() {
		return checkTree(raiz);
	}

	private boolean checkTree(No i) {
		boolean resposta = true;
		if (i != null) {
			if (i.esq != null && i.esq.elemento >= i.elemento) {
				resposta = false;
			} else if (i.dir != null && i.dir.elemento <= i.elemento) {
				resposta = false;
			}
			resposta = resposta && checkTree(i.esq);
			resposta = resposta && checkTree(i.dir);
		}
		return resposta;
	}

	public static void main(String[] args) throws Exception {
		ArvoreBinaria arvore = new ArvoreBinaria();
		arvore.inserir(15);
		arvore.inserir(20);
		arvore.inserir(7);
		arvore.inserir(77);
		arvore.inserir(13);
		arvore.inserir(90);

		System.out.println("Mostrar Central:");
		arvore.mostrarCentral();
		System.out.println();
		System.out.println("Folhas:" + arvore.contarFolhas());
		System.out.println("Nós:" + arvore.contarNosPreenchidos());
		System.out.println("Altura da arvore: " + arvore.alturaArvore());
		arvore.soma();
		System.out.println(arvore.checkTree());
	}
}