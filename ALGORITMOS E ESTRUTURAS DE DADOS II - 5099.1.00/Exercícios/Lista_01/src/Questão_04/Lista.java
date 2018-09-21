package Questão_04;

public class Lista {
	int[] array;
	int n;

	Lista() {
		this(6);
	}

	Lista(int tamanho) {
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

	void inserirFim(int x) throws Exception {
		if (n >= array.length) {
			throw new Exception("Erro!");
		} else {
			array[n] = x;
			n++;
		}
	}

	void inserir(int x, int pos) throws Exception {
		if (n >= array.length || pos < 0 || pos > n) {
			throw new Exception("Erro! Lista cheia");
		} else {
			// levar elementos para o fim do array
			for (int i = n; i > pos; i--) {
				array[i] = array[i - 1];
			}
			array[pos] = x;
			n++;
		}
	}

	int removerInicio() throws Exception {
		if (n == 0) {
			throw new Exception("Erro!");
		} else {
			int resp = array[0];
			n--;
			for (int i = 0; i < n; i++) {
				array[i] = array[i + 1];
			}
			return resp;
		}
	}

	int removerFim() throws Exception {
		if (n == 0) {
			throw new Exception("Erro!");
		} else {
			return array[--n];
		}
	}

	int remover(int pos) throws Exception {
		if (n == 0 || pos < 0 || pos >= n) {
			throw new Exception("Erro!");
		} else {
			int resp = array[pos];
			n--;
			for (int i = pos; i < n; i++) {
				array[i] = array[i + 1];
			}
			return resp;
		}
	}

	void mostrar() {
		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}

	void intercalar(Lista lista1, Lista lista2, Lista lista3) throws Exception {
		int tamanhoTotal = lista1.array.length + lista2.array.length;
		int length = array.length;
		if (n >= tamanhoTotal) {
			throw new Exception("Erro!");
		} else {
			for (int i = tamanhoTotal; i > 0; i--) {
				lista3.array[i - 1] = lista1.array[length-1];
				lista3.array[i - 1] = lista2.array[length-1];
			}
			n += 2;
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println("==== LISTA 1 ====");
		Lista lista1 = new Lista(4);
		Lista lista2 = new Lista(4);
		Lista lista3 = new Lista(8);
		lista1.inserirInicio(1);
		lista1.inserirInicio(2);
		lista1.inserirInicio(3);
		lista1.inserirInicio(4);
		lista1.mostrar();
		System.out.println("==== LISTA 3 ====");
		lista2.inserirInicio(9);
		lista2.inserirInicio(8);
		lista2.inserirInicio(7);
		lista2.inserirInicio(6);
		lista2.mostrar();
		System.out.println("==== LISTA 3 ====");
		lista3.intercalar(lista1, lista2, lista3);
		lista3.mostrar();
	}

}
