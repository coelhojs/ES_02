package OrdenacaoInsertion;

public class Insertion implements Ordena {
	int comparacoes;

	Insertion() {
		this.comparacoes = 0;
	}

	@Override
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

	@Override
	public int getComparacoes() {
		return 0;
	}


	@Override
	public String toString(int array[]) {
		String resp = " ";
		for (int i : array) {
			resp += i + ", ";
		}
		return resp;
	}

}
