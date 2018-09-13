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

	void intercalar(Lista lista1, Lista lista2) {
		if (n >= array.length) {
			throw new Exception("Erro!");
		} else {
			// levar elementos para o fim do array
			for (int i = n, j = n; j > 0 ; i--, j--) {
				array[i] = array[i - 1];
				array[j] = array[j - 1];
			}
			array[0] = x;
			n++;
		}
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("==== LISTA 1 ====");
		Lista lista1 = new Lista();
		Lista lista2 = new Lista();
		Lista lista3 = new Lista();
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
		lista3.intercalar(lista1, lista2);
		lista3.mostrar();
	}	

}
