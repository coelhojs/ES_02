package Algoritmos;

//Pilha: FIFO (First In, First Out)
//Pilhas possuem duas possibilidades: Inserção no início e remoção no início(menos eficiente) ou Inserção no final 
//e remoção no final(mais eficiente).
// II, RI ou IF, RF
//Neste exemplo será abordada a solução de inserção e remoção no início.

public class Pilha {
	int[] array;
	int n;

	Pilha() {
		this(6);
	}

	Pilha(int tamanho) {
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
		System.out.println("==== PILHA ESTATICA ====");
		Pilha pilha = new Pilha();
		int x1, x2, x3;
		pilha.inserirInicio(2);
		pilha.inserirInicio(3);
		pilha.inserirInicio(6);
		pilha.inserirInicio(7);
		pilha.inserirInicio(11);
		pilha.inserirInicio(0);
		pilha.mostrar();

		x1 = pilha.removerInicio();
		x2 = pilha.removerInicio();
		x3 = pilha.removerInicio();
		System.out.println("Removidos: " + x1 + ", " + x2 + ", " + x3);
		System.out.print("Pilha final: ");
		pilha.mostrar();
	}

}