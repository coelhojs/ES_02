package Exemplos;

public class Fila {
	Celula primeiro, ultimo;
	int n;

	Fila() {
		primeiro = new Celula();
		ultimo = primeiro;
		n = 0;
	}

	void enfileirar(int x) {
		ultimo.prox = new Celula(x);
		ultimo = ultimo.prox;
		n++;
	}

	int desenfileirar() throws Exception {
		if (primeiro == ultimo)
			throw new Exception("Fila Vazia..");
		Celula temp = primeiro;
		primeiro = primeiro.prox;
		int elemento = primeiro.elemento;
		temp.prox = null;
		temp = null;
		n--;
		return elemento;
	}

	boolean isVazia() {
		return n == 0; //primeiro == ultimo;
	}
}
