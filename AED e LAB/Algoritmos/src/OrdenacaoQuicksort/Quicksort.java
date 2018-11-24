//Escolha arbitrariamente um pivô
//Percorra o vetor a partir da esquerda enquanto vetor[ i ] < pivô
//Percorra o vetor a partir da direita enquanto vetor[ j ] > pivô
//Se i ≤ j então troque vetor[ i ] com vetor[ j ]
//Continue o processo enquanto i ≤ j

package OrdenacaoQuicksort;

import OrdenacaoSelection.Selection;

public class Quicksort {
	int[] vetor;
	int n;

	Quicksort() {
		this.vetor = new int[] { 9, 8, 4, 3, 7, 5, 6, 1, 2, 5, 1 };
		this.n = vetor.length;
	}

	void ordenar(int esq, int dir) {
		int i = esq, j = dir, pivo = vetor[(dir + esq) / 2];
		while (i <= j) {
			while (vetor[i] < pivo)
				i++;
			while (vetor[j] > pivo)
				j--;
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}

		}

		if (esq < j)
			ordenar(esq, j);
		if (i < dir)
			ordenar(i, dir);
	}

	public void swap(int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}

	void mostrar() {
		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		Quicksort quicksort = new Quicksort();

		quicksort.mostrar();
		quicksort.ordenar(0, 11);
		quicksort.mostrar();
	}

}
