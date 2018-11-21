//ESTÁVEL

package OrdenacaoBubble;

public class Bubble {
	int[] vetor;
	int n;

	Bubble() {
		this.vetor = new int[] { 9, 8, 4, 3, 7, 5, 6, 1, 2, 5, 1 };
		this.n = vetor.length;
	}

	public void ordenar() {
		int tam = vetor.length;
		for (int i = 0; i < tam - 1; i++) {
			for (int j = (tam - 1); j > i; j--) {
				if (vetor[j] < vetor[j - 1]) {
					int aux = vetor[j];
					vetor[j] = vetor[j - 1];
					vetor[j - 1] = aux;
				}
			}
		}
	}

	void mostrar() {
		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		Bubble shellsort = new Bubble();

		shellsort.mostrar();
		shellsort.ordenar();
		shellsort.mostrar();
	}

}
