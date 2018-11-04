package Questão_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EditorTexto {
	String[] array;
	int n;

	EditorTexto() {
		this(50);
	}

	EditorTexto(int tamanho) {
		array = new String[tamanho];
		n = 0;
	}

	void inserirFim(String x) throws Exception {
		if (n >= array.length) {
			throw new Exception("Erro!");
		} else if (x == "#") {
			removerFim();
		} else if (x == "@") {
			array = null;
		} else {
			array[n] = x;
			n++;
		}
	}

	String removerFim() throws Exception {
		if (n == 0) {
			throw new Exception("Erro!");
		} else {
			return array[--n];
		}
	}

	void limpar() {
		for (int i = 0; i < n; i++) {
			array[i] = "";
		}
		n = 0;
	}

	void mostrar() {
		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		EditorTexto editor = new EditorTexto(50);

		while (editor.n <= editor.array.length) {
			System.out.println("Digite o caractere e pressione ENTER: ");
			String caractere = br.readLine();
			switch (caractere) {
			case "#":
				editor.removerFim();
				editor.mostrar();
				System.out.println();
				break;
			case "@":
				editor.limpar();
				editor.mostrar();
				break;
			default:
				editor.inserirFim(caractere);
				editor.mostrar();
			}

		}
		System.out.println("Editor cheio!");
	}

}
