//O vetor é dividido em duas partes: desordenado e ordenado
//A parte ordenada é preenchida com os valores da parte desordenada em sequencia 

package OrdenacaoInsertion;

public class Insertion {
	int comparacoes;

	Insertion() {
		this.comparacoes = 0;
	}

	public void ordenar(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int tmp = array[i];
			int j = i - 1;
			while ((j >= 0) && (array[j] > tmp)) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = tmp;
		}
	}

	public String toString(int array[]) {
		String resp = " ";
		for (int i : array) {
			resp += i + ", ";
		}
		return resp;
	}

}
