//ESTÁVEL 

package OrdenacaoCounting;

public class Counting {
	int[] vetor;
	int n;

	Counting() {
		this.vetor = new int[] { 9, 8, 4, 3, 7, 5, 6, 1, 2, 5, 1 };
		this.n = vetor.length;
	}

	public void ordenar() {

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
		Counting counting = new Counting();

		counting.mostrar();
		counting.ordenar();
		counting.mostrar();
	}

}
