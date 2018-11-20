/*package Lista;

import Fila.Celula;

public class ListaFlexivel {
	public Celula primeiro, ultimo;

	public ListaFlexivel() {
		this.primeiro = new Celula();
		this.ultimo = primeiro;
	}

	public void inserirInicio(int x) {
		Celula tmp = new Celula(x);
		tmp.prox = primeiro.prox;
		primeiro.prox = tmp;
		if (primeiro == ultimo) {
			ultimo = tmp;
		}
		tmp = null;
	}

	public int removerFim() throws Exception {
		if (primeiro == ultimo)
			throw new Exception("Erro!");
		Celula i;
		for (i = primeiro; i.prox != ultimo; i = i.prox)
			;
		int elemento = ultimo.elemento;
		ultimo = i;
		i = ultimo.prox = null;
		return elemento;
	}

	public void inserir(int x, int pos) throws Exception {
		int tamanho = tamanho();
		if (pos < 0 || pos > tamanho) {
			throw new Exception("Erro!");
		} else if (pos == 0) {
			inserirInicio(x);
		} else if (pos == tamanho) {
			inserirFim(x);
		} else {
			Celula i = primeiro;
			for (int j = 0; j < pos; j++, i = i.prox)
				;
			Celula tmp = new Celula(x);
			tmp.prox = i.prox;
			i.prox = tmp;
			tmp = i = null;
		}
	}

	public int remover(int pos) throws Exception { // remover(1)
		int elemento, tamanho = tamanho();
		if (primeiro == ultimo || pos < 0 || pos >= tamanho) {
			throw new Exception("Erro!");
		} else if (pos == 0) {
			elemento = removerInicio();
		} else if (pos == tamanho - 1) {
			elemento = removerFim();
		} else {
			Celula i = primeiro;
			for (int j = 0; j < pos; j++, i = i.prox)
				;
			Celula tmp = i.prox;
			elemento = tmp.elemento;
			i.prox = tmp.prox;
			tmp.prox = null;
			i = tmp = null;
		}
		return elemento;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	}

}
*/