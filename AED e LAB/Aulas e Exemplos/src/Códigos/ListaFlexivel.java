package Códigos;

public class ListaFlexivel {
	public Celula i, primeiro, ultimo;
	int[] array;
	int n;

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

	void inserirFim(int x) {
		ultimo.prox = new Celula(x);
		ultimo = ultimo.prox;
		n++;
	}

	int removerInicio() throws Exception {
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

	public int removerFim() throws Exception {
		if (primeiro == ultimo) {
			throw new Exception("Erro!");
		}
		for (i = primeiro; i.prox != ultimo; i = i.prox)
			;
		int elemento = ultimo.elemento;
		ultimo = i;
		i = ultimo.prox = null;
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