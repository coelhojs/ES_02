package Questão_01;

public class EditorTexto {
	int[] array;
	int n;

	EditorTexto() {
		this(50);
	}

	EditorTexto(int tamanho) {
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

	void mostrar() {
		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	}

}
