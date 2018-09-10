package Algoritmos;

//Fila: FIFO (First In, First Out)
//Filas possuem duas possibilidades: Inserção no início e remoção no final ou Inserção no final e remoção no Início.
//Neste exemplo será abordada a solução de inserção no início e remoção no final.

public class Fila {
	int[] array;
	int n;

	Fila() {
		this(6);
	}

	Fila(int tamanho) {
		array = new int[tamanho];
		n = 0;
	}

	void inserirInicio(int x) throws Exception {
		if (n >= array.length) {
			throw new Exception("Erro!");
		} else {
			// levar elementos para o fim do array
			for (int i = n; i > 0; i--) {
				array[i] = array[i - 1];
			}
			array[0] = x;
			n++;
		}
	}

	int removerFim() throws Exception {
		if (n == 0) {
			throw new Exception("Erro!");
		} else {
			return array[--n];
		}
	}

	void mostrar() {
		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) throws Exception {
		System.out.println("==== FILA ESTATICA ====");
		Fila fila = new Fila();
		int x1, x2, x3;
		fila.inserirInicio(2);
		fila.inserirInicio(3);
		fila.inserirInicio(6);
		fila.inserirInicio(7);
		fila.inserirInicio(11);
		fila.inserirInicio(0);
		fila.mostrar();

		x1 = fila.removerFim();
		x2 = fila.removerFim();
		x3 = fila.removerFim();
		System.out.println(x1 + ", " + x2 + ", " + x3);
		fila.mostrar();

	}

}