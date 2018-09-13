package Questão_02;

import java.util.Scanner;

public class PistaDecolagem {

	public static void main(String[] args) throws Exception {
		Fila filaDecolagem = new Fila();
		Aviao aviao = aviao = new Aviao();
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
			
			break;
		case "3":
			break;
		case "4":
			break;
		}
	}

}
