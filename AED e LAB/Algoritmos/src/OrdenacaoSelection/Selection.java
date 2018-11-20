//Procure o menor elemento do array
//Troque a posição do menor elemento com o primeiro
//Volte ao primeiro passo e considere o array a partir da próxima posição

package OrdenacaoSelection;

public class Selection {
	int[] vetor;
	int n;

	Selection() {
		this.vetor = new int[] { 9, 8, 4, 3, 7, 6, 1, 2, 5 };
		this.n = vetor.length;
	}

	public void ordenar() {
		for (int i = 0; i < n; i++) {
			int menorPos = i;
			for (int j = 0; j < n; j++) {
				if (vetor[i] > vetor[j]) {
					menorPos = j;
				}
			}
			swap(vetor, menorPos, i);
		}
	}

	public void swap(int vetor[], int menorPos, int i) {
		int aux = vetor[i];
		vetor[i] = vetor[menorPos];
		vetor[menorPos] = aux;
	}

	void mostrar() {
		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		Selection shellsort = new Selection();

		shellsort.mostrar();
		shellsort.ordenar();
		shellsort.mostrar();
	}

}
