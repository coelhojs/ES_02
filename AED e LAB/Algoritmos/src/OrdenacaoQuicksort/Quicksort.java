//Escolha arbitrariamente um pivô
//Percorra o array a partir da esquerda enquanto array[ i ] < pivô
//Percorra o array a partir da direita enquanto array[ j ] > pivô
//Se i ≤ j então troque array[ i ] com array[ j ]
//Continue o processo enquanto i ≤ j

package OrdenacaoQuicksort;

public class Quicksort {

	static int[] array = { 5, 6, 4, 3, 1, 2, 9, 5 };

	public static void swap(int i, int j) {
		int aux = i;
		i = j;
		j = aux;
	}

	public static void quicksort(int esq, int dir) {
		int i = esq, j = dir, pivo = array[(dir + esq) / 2];
		while (i <= j) {
			while (array[i] < pivo)
				i++;
			while (array[j] > pivo)
				j--;
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}

		}

		if (esq < j)
			quicksort(esq, j);
		if (i < dir)
			quicksort(i, dir);
	}

	public static void main(String[] args) {
		System.out.println(array[0]);
		quicksort(0, 7);
		System.out.println(array[0]);
	}

}
