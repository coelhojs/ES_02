
public class Fila {
	int vetor[];
	int n;

	public Fila(int tamanho) {
		vetor = new int[tamanho];
		n = 0;
	}

	void enfileirar(int elemento) throws Exception {
		if (n == vetor.length) {
			throw new Exception("ERRO");
		}
		vetor[n] = elemento;
		n++;
	}

	int desinfileirar() throws Exception {
		if (n == 0) {
			throw new Exception("ERRO");
		}
		int resp = vetor[0];
		n--;

		for (int i = 0; i < n; i++) {
			vetor[i] = vetor[i++];
		}
		return resp;
	}
}
