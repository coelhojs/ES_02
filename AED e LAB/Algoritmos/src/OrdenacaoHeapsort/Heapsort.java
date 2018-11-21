//NÃO ESTÁVEL
//APARENTEMENTE É O MAIS DIFÍCIL DE TODOS

package OrdenacaoHeapsort;

public class Heapsort {
	int[] vetor;
	int n;

	Heapsort() {
		this.vetor = new int[] { 9, 8, 4, 3, 7, 5, 6, 1, 2, 5, 1 };
		this.n = vetor.length;
	}

	public void ordenar() {
		// Contrucao do heap
		for (int tam = 2; tam <= n; tam++) {
			constroi(tam);

		}

		// Ordenacao propriamente dita
		int tam = n;
		while (tam > 1) {
			swap(1, tam--);
			reconstroi(tam);

		}
	}

	void constroi(int tam) {
		for (int i = tam; i > 1 && vetor[i] > vetor[i / 2]; i /= 2) {
			swap(i, i / 2);
		}
	}

	void reconstroi(int tam) {
		int i = 1;
		while (i <= (tam / 2)) {
			int filho = getMaiorFilho(i, tam);
			if (vetor[i] < vetor[filho]) {
				swap(i, filho);
				i = filho;
			} else {
				i = tam;
			}
		}

	}

	int getMaiorFilho(int i, int tam) {
		int filho;
		if (2 * i == tam || vetor[2 * i] > vetor[2 * i + 1]) {
			filho = 2 * i;
		} else {
			filho = 2 * i + 1;

		}

		return filho;

	}

	public void swap(int i, int filho) {
		int aux = vetor[filho];
		vetor[filho] = vetor[i];
		vetor[i] = aux;
	}

	void mostrar() {
		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		Heapsort shellsort = new Heapsort();

		shellsort.mostrar();
		shellsort.ordenar();
		shellsort.mostrar();
	}

}
