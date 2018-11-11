package OrdenacaoSelection_OK;
/*package OrdenacaoSelection;

public class OrdenacaoSelecao {
	static int[] array = new int[5];

	void ordenar(int[] array) {
		int n = array.length;
		for (int i = 0; i < (n - 1); i++) {
			int menor = i;
			for (int j = (i + 1); j < n; j++) {
				if (array[menor] > array[j]) {
					menor = j;
				}
			}
			swap(menor, i);
		}
	}

	void ordenarRecursivo(int[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			int menor = getMenor(i, n);
			swap(menor, i);
		}
	}

	int getMenor(int i, int n) {
		if (j < n) {
			if (array[menor] > array[j]) {
				menor = j;
				return getMenor(menor, j + 1, n);
			} else {
				return menor;
			}
		}
	}

	void swap(int menor, int i) {
		int temp = array[menor];
		array[menor] = array[i];
		array[i] = temp;
	}

	static void main(String[] args) {
		array = new int[5];

	}

}
*/