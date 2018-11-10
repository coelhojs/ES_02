package aula09;

import java.util.Arrays;

public class InsertionSort implements Ordena {
	
	private int comparacoes;
	
	InsertionSort(){
		this.comparacoes = 0; 
	}

	public void ordenar(int[] vetor) {
		Arrays.sort(vetor);
		// implementar o algoritmo
	}

	public int getComparacoes() {
		return this.comparacoes;
	}

}
