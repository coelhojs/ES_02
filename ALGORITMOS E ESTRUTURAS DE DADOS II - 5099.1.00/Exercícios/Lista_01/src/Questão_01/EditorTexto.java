package Questão_01;

import java.util.Scanner;

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

	void inserirInicio(String x) throws Exception {
		if (n >= array.length) {
			throw new Exception("Erro!");
		} else if (x == "#") {
			removerInicio();
		} else if (x == "@") {
			array = null;
		} else {
			// levar elementos para o fim do array
			for (int i = n; i > 0; i--) {
				array[i] = array[i - 1];
			}
			array[0] = x;
			n++;
		}
	}

	String removerInicio() throws Exception {
		if (n == 0) {
			throw new Exception("Erro!");
		} else {
			String resp = array[0];
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
		Scanner ler = new Scanner(System.in);
		EditorTexto editor = new EditorTexto();
		
		while (x != "#" | x != "@") {
			
		}

	}

}
