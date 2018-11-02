package OrdenacaoInterna;

import java.util.Random;

public class Aplicacao {

	public static void main(String[] args) {
		int TAM = 500;
		int vetor[] = new int[TAM];
		Random rand = new Random();
		Ordena metodo = new Insertion();

		for (int i = 0; i < TAM; i++) {

			vetor[i] = rand.nextInt(TAM) + 1;

			// Pior caso:
			// vetor[i] = TAM - i;
			// Melhor caso:
			// vetor[i] = TAM + i;
		}
		System.out.println(metodo.toString(vetor));
		long start = System.currentTimeMillis();
		metodo.ordenar(vetor);
		System.out.println(metodo.toString(vetor));
		long elapsed = System.currentTimeMillis() - start;

		System.out.println("Tempo de ordenacao: " + elapsed);
		System.out.println(metodo.getComparacoes());
	}

}
