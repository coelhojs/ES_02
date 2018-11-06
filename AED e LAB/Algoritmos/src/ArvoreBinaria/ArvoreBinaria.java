package ArvoreBinaria;

public class ArvoreBinaria {
	public No raiz;

	public void inserir(int x) throws Exception {
		raiz = inserir(x, raiz);
	}

	private No inserir(int x, No raiz) throws Exception {
		if (raiz == null) {
			raiz = new No(x);
		} else if (x < raiz.elemento) {
			raiz.esq = inserir(x, raiz.esq);
		} else if (x > raiz.elemento) {
			raiz.dir = inserir(x, raiz.dir);
		} else {
			throw new Exception("Erro!");
		}
		return raiz;
	}

	public boolean pesquisar(int x) {
		return pesquisar(x, raiz);
	}

	private boolean pesquisar(int x, No raiz) {
		boolean resp;
		if (raiz == null) {
			resp = false;
		} else if (x == raiz.elemento) {
			resp = true;
		} else if (x < raiz.elemento) {
			resp = pesquisar(x, raiz.esq);
		} else {
			resp = pesquisar(x, raiz.dir);
		}
		return resp;
	}

	public void remover(int x) throws Exception {
		raiz = remover(x, raiz);
	}

	private No remover(int x, No raiz) throws Exception {
		if (raiz == null) {
			throw new Exception("Erro!");
		} else if (x < raiz.elemento) {
			raiz.esq = remover(x, raiz.esq);
		} else if (x > raiz.elemento) {
			raiz.dir = remover(x, raiz.dir);
		} else if (raiz.dir == null) {
			raiz = raiz.esq;
		} else if (raiz.esq == null) {
			raiz = raiz.dir;
		} else {
			raiz.esq = anterior(raiz, raiz.esq);
		}
		return raiz;
	}

	private No anterior(No raiz, No raizEsq) {
		if (raizEsq.dir != null)
			raizEsq.dir = anterior(raiz, raizEsq.dir);
		else {
			raiz.elemento = raizEsq.elemento;
			raizEsq = raizEsq.esq;
		}
		return raizEsq;
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


	// Questão 02 nova tentativa
//fazer string do mostrar central, do mostrar pre e do mostrar pos

	/*
	 * public String printCentral() { String central = null; return
	 * printCentral(raiz); }
	 * 
	 * private String printCentral(No i) { if (i != null) { printCentral(i.esq);
	 * 
	 * printCentral(i.dir); } return; }
	 */
	
	
	// Questão 01
	public int contarFolhas() {
		return contarFolhas(raiz);
	}

	private int contarFolhas(No raiz) {
		int cont = 0;
		if (raiz != null) {
			if (raiz.esq == null && raiz.dir == null) {
				cont++;
			}
			cont += contarFolhas(raiz.esq);
			cont += contarFolhas(raiz.dir);
		}
		return cont;
	}

	// Questão 02
	public boolean compararArv(No arv2) {
		return compararArv(raiz, arv2);
	}

	public boolean compararArv(No raiz, No raiz2) {
		boolean resp;
		if (raiz.elemento != raiz2.elemento) {
			resp = false;
		} else {
			boolean compararEsq = compararArv(raiz.esq, raiz2.esq);
			if (compararEsq) {
				boolean compararDir = compararArv(raiz.dir, raiz2.dir);
				if (compararDir) {
					resp = true;
				} else {
					resp = false;
				}
			} else {
				resp = false;
			}
		}
		return resp;
	}

	// Questão 03
	public int contarFolhasV() {
		return contarFolhasV(raiz);
	}

	private int contarFolhasV(No raiz) {
		int cont = 0;
		if (raiz != null) {
			if (raiz.esq == null && raiz.dir == null) {
				cont++;
			}
			cont += contarFolhas(raiz.esq);
			cont += contarFolhas(raiz.dir);
		}
		return cont;
	}
}