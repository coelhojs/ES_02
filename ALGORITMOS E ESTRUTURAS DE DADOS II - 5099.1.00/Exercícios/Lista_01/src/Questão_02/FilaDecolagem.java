package Questão_02;

import java.util.Scanner;

public class FilaDecolagem {
	Aviao[] avioes;
	int n;
	private static Scanner scanner;

	FilaDecolagem(int tamanho) {
		avioes = new Aviao[tamanho];
		n = 0;
	}

	void inserirInicio(String nome) throws Exception {
		if (n >= avioes.length) {
			throw new Exception("Fila cheia!");
		} else {
			int i;
			for (i = n; i > 0; i--) {
				avioes[i] = avioes[i - 1];
				avioes[i].setIdentificador(n - i + 1);
			}
			avioes[0] = new Aviao(nome, n + 1);
			n++;
		}
	}

	Aviao removerFim() throws Exception {
		if (n == 0) {
			throw new Exception("Erro!");
		} else {
			return avioes[--n];
		}
	}

	void mostrar() {
		System.out.println("Aviões:");
		for (int i = 0; i < n; i++) {
			System.out.println("Nome: " + avioes[i].getNome() + ", Identificador: " + avioes[i].getIdentificador());
		}
	}

	void primeiroDaFila() {
		for (int i = 0; i < n; i++) {
		}
		System.out.println("Primeiro avião da fila: ");
		System.out.println("Nome: " + avioes[n - 1].getNome() + ", Identificador: " + avioes[n-1].getIdentificador());
	}

	public static void main(String[] args) throws Exception {
		FilaDecolagem filaDecolagem = new FilaDecolagem(4);
		scanner = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("CONTROLE DE PISTA DE DECOLAGEM");
			System.out.println("Selecione a opção abaixo:");
			System.out.println("1-Autorizar a decolagem do primeiro avião da ﬁla");
			System.out.println("2-Adicionar um avião à ﬁla de espera");
			System.out.println("3-Listar todos os aviões na ﬁla de espera");
			System.out.println("4-Listar as características do primeiro avião da ﬁla");
			System.out.println("0-Sair");

			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				filaDecolagem.removerFim();
				System.out.println("Decolagem autorizada!");
				System.out.println();
				break;
			case 2:
				System.out.println("Adicionar um avião à fila de espera");
				System.out.println("Informe o nome do avião: ");
				String nome = scanner.next();
				filaDecolagem.inserirInicio(nome);
				/*
				 * System.out.println("Avião adicionado à fila."); System.out.println("Nome: " +
				 * aviao[i].getNome()); System.out.println("Identificador: " +
				 * aviao.getIdentificador());
				 */
				System.out.println();
				break;
			case 3:
				filaDecolagem.mostrar();
				System.out.println();
				break;
			case 4:
				filaDecolagem.primeiroDaFila();
				System.out.println();
				break;
			case 0:
				System.out.println("Sistema encerrado.");
				System.out.println();
				break;
			default:
				System.out.println("Erro. Tente novamente.");
			}
		} while (opcao != 0);
	}
}
