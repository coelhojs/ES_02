//NÃO ESTÁVEL

//Funcionamento basico
//Os elementos separados de h posições são ordenados via Inserção
//Por exemplo, se h = 4, ordenamos com a Inserção cada um dos pseudoarray

//Complexidade:
//A razão da eficiência do algoritmo ainda não é conhecida
//Sua análise contém alguns problemas matemáticos difíceis, a começar 
//pela própria sequência de incrementos

//O que se sabe é que cada incremento não deve ser múltiplo do anterior

//Conjecturas para o número de comparações dado a seq. de Knuth:
//Conjetura 1: C(n) = O(n^1,25)
//Conjetura 2: C(n) = O(n(lnn)²)

//Vantagens:
//Shellsort é uma ótima opção para arquivos de tamanho moderado
//Sua implementação é simples e requer pouco código

//Desvantagens:
//Seu tempo de execução é sensível à ordem inicial do arquivo
//Algoritmo não estável

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
			// h é multiplicado por 3 e somado 1 enquando h < vetor.length
			// h = 40
		} while (h < n);
		do {
			h /= 3;
			// h = 13
			for (int pos = 0; pos < h; pos++) {
				insercaoPorPos(pos, h);
			}
			// porque nao existe divisao por 0
		} while (h != 1);
	}

	void insercaoPorPos(int pos, int h) {
		for (int i = (h + pos); i < n; i += h) {

			// no primeiro loop, tmp = vetor[13]:
			int tmp = vetor[i];

			// no primeiro loop, j = 13 - 13:
			int j = i - h;

			// vetor[0] > vetor[13]?
			while ((j >= 0) && (vetor[j] > tmp)) {

				// vetor[0 + 13] = vetor[0]:
				vetor[j + h] = vetor[j];

				// 0 = 0 - 13, ou seja, -13:
				j -= h;
			}
			// -13 + 13 = 0
			// vetor[0] =
			vetor[j + h] = tmp;
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
