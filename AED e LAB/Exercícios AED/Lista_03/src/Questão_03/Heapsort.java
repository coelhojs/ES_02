package Questão_03;

public class Heapsort {
	int[] sequencia;

	public Heapsort(int[] sequencia) {
		this.sequencia = sequencia;
	}

	public int[] heapsort(int[] sequencia) {
		int seqTam = sequencia.length;

		for (int heapTam = 2; heapTam <= seqTam; heapTam++) {
			constroi(heapTam, sequencia);
		}
		return sequencia;
	}

	private void constroi(int heapTam, int[] sequencia) {
		for (int i = heapTam; i > 1 && sequencia[i] > sequencia[i / 2]; i /= 2) {
			swap(i, i / 2);
		}
	}

	private void swap(int i, int i2) {
		int aux = i2;
		i2 = i;
		i = aux;
	}
}
