package Quest�o_02;

//Fila: FILO (First In, Last Out)
//Filas possuem duas possibilidades: Inser��o no in�cio e remo��o no final ou Inser��o no final e remo��o no In�cio.
//Neste exemplo ser� abordada a solu��o de inser��o no in�cio e remo��o no final.

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
}