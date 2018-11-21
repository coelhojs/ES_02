//NÃO ESTÁVEL

package OrdenacaoShellsort;

public class Shellsort {
	int[] vetor;
	int n;

	Shellsort() {
		this.vetor = new int[] { 90, 45, 32, 11, 15, 60, 45, 70, 20, 13, 40, 39, 25, 10 };
		this.n = vetor.length;
	}

	void ordenar() {
		int h = 1;
		do {
			h = (h * 3) + 1;
		} while (h < vetor.length);
		do {
			h /= 3;
			for (int pos = 0; pos < h; pos++) {
				insercaoPorPos(pos, h);
			}
		} while (h != 1);
	}

	void insercaoPorPos(int pos, int h) {
		for (int i = (h + pos); i < n; i += h) {
			int tmp = vetor[i];
			int j = i - h;
			while ((j >= 0) && (vetor[j] > tmp)) {
				vetor[j + h] = vetor[j];
				j -= h;

			}

			vetor[j + h] = tmp;
		}

	}

	void insercao() {
		for (int i = 1; i < n; i += 1) {
			int tmp = vetor[i];
			int j = i - 1;
			while ((j >= 0) && (vetor[j] > tmp)) {
				vetor[j + 1] = vetor[j];
				j -= 1;
			}
			vetor[j + 1] = tmp;
		}
	}

	public int getComparacoes() {
		return 0;
	}

	void mostrar() {
		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		Shellsort shellsort = new Shellsort();

		shellsort.mostrar();
		shellsort.ordenar();
		shellsort.mostrar();
	}

}
