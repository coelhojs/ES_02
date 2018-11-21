//ESTÁVEL
//O vetor é dividido em duas partes: desordenado e ordenado
//A parte ordenada é preenchida com os valores da parte desordenada em sequencia 

package OrdenacaoInsertion;

public class Insertion {
	int[] vetor;
	int n;

	Insertion() {
		this.vetor = new int[] { 9, 8, 4, 3, 7, 6, 1, 2, 5 };
		this.n = vetor.length;
	}

	public void ordenar() {
		for (int i = 1; i < n; i++) {
			int temp = vetor[i];
			int j = i - 1;
			while ((j >= 0) && (vetor[j] > temp)) {
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor[j + 1] = temp;
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
		Insertion shellsort = new Insertion();

		shellsort.mostrar();
		shellsort.ordenar();
		shellsort.mostrar();
	}

}
