package Questão_03;

public class ListaSemRepeticoes {
	int[] array;
	int n;

	public Celula primeiro, ultimo;

	public ListaSemRepeticoes() {
		primeiro = new Celula();
		ultimo = primeiro;
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

	void mostrar() {
		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}
}
