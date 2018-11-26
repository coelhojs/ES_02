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
		// o loop for inicia sobre o vetor a partir da posicao vetor[1]
		// a variavel i inicia com valor 1
		for (int i = 1; i < n; i++) {
			// atribui o valor de vetor[1] a variavel temp
			int temp = vetor[i];
			// a variavel j inicia na posicao anterior a vetor[i], ou seja, vetor[0]
			int j = i - 1;
			// se vetor[j] > temp, vetor[i] e substituido por vetor[j]
			// o while continua ate que as posicoes menores que j estejam ordenadas
			// o vetor ordenado tem o tamanho = j
			while ((j >= 0) && (vetor[j] > temp)) {
				vetor[j + 1] = vetor[j];
				j--;
			}
			// o vetor nao ordenado (j+1) comeca com o valor de temp
			vetor[j + 1] = temp;
			mostrar();
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
		Insertion insertion = new Insertion();

		insertion.mostrar();
		insertion.ordenar();
		insertion.mostrar();
	}

}
