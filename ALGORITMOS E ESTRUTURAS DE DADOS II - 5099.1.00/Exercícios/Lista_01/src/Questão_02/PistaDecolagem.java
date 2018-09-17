package Questão_02;

import java.util.Scanner;

public class PistaDecolagem {
	int[] array;
	int n;

	PistaDecolagem() {
		this(6);
	}

	PistaDecolagem(int tamanho) {
		array = new int[tamanho];
		n = 0;
	}

	void inserirInicio(Aviao x) throws Exception {
		if (n >= array.length) {
			throw new Exception("Erro!");
		} else {
			for (int i = n; i > 0; i--) {
				array[i] = array[i - 1];
			}
			array[n] = x;
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

	void mostrarPrimeiro() {
		System.out.print("Avião: ");
		int i;
		for (i = 0; i < n; i++) {
		}
		System.out.print("Nome:" + aviao.array[i].getNome());
		System.out.print("Identificador:" + aviao.array[i].getIdentificador());
	}

	public static void main(String[] args) throws Exception {
		PistaDecolagem filaDecolagem = new PistaDecolagem();
		// Aviao aviao;
		Scanner scanner = new Scanner(System.in);

		System.out.println("CONTROLE DE PISTA DE DECOLAGEM");
		System.out.println("Selecione a opção abaixo:");
		System.out.println("1-Autorizar a decolagem do primeiro avião da ﬁla");
		System.out.println("2-Adicionar um avião à ﬁla de espera");
		System.out.println("3-Listar todos os aviões na ﬁla de espera");
		System.out.println("4-Listar as características do primeiro avião da ﬁla");

		String opcao = scanner.next();

		switch (opcao) {
		case "1":
			filaDecolagem.removerFim();
			System.out.println("Decolagem autorizada!");
			break;
		case "2":
			Runtime.getRuntime().exec("clear");
			System.out.println("Adicionar um avião à fila de espera");
			System.out.println("Informe o nome do avião: ");
			String nome = scanner.next();
			Aviao aviao = new Aviao(nome);
			filaDecolagem.inserirInicio(aviao);
			break;
		case "3":
			filaDecolagem.mostrar();
			break;
		case "4":
			filaDecolagem.mostrarPrimeiro();
			break;
		default:
			System.out.println("Erro. Tente novamente.");
		}
	}
}
