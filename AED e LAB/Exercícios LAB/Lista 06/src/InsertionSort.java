
public class InsertionSort implements Ordena {
	private int[] array;
	private int n, aux;

	@Override
	public void ordenar(int array[]) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > array[i + 1]) {
				aux = array[i];
				array[i] = array[i + 1];
				array[i + 1] = aux;
			}
		}
	}

	@Override
	public int getOperacoes() {

		return 0;
	}

}
