package Lista;

import Fila.Celula;

public class ListaEncadeada {
	public Celula primeiro, ultimo;
	int[] array;
	int n;

	public ListaEncadeada() {
		primeiro = new Celula();
		ultimo = primeiro;
	}

	int tamanho() {
		return array.length;
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

	void inserirFim(int x) throws Exception {
		if (n >= array.length) {
			throw new Exception("Erro!");
		} else {
			array[n] = x;
			n++;
		}
	}

	int removerInicio() throws Exception {
		if (n == 0) {
			throw new Exception("Erro!");
		} else {
			int resp = array[0];
			n--;
			for (int i = 0; i < n; i++) {
				array[i] = array[i + 1];
			}
			return resp;
		}
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

	public void inserir(int x, int pos) throws Exception { // Inserir(6, 2)
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

	void mostrar() {
		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}

}