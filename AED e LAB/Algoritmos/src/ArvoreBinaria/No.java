package ArvBinaria;
public class No {
	public int elemento;
	public No esq, dir;

	public No(int elemento, No esq, No dir) {
		this.elemento = elemento;
		this.esq = esq;
		this.dir = dir;
	}

	public No(int elemento) {
		this(elemento, null, null);
	}

	public No rotacionarEsq(No no) {
		No noDir = no.dir;
		No noDirEsq = noDir.esq;
		noDir.esq = no;
		no.dir = noDirEsq;
		return noDir;
	}
	/*
	public No rotacionarDir(No no) {
		
	}
*/
}