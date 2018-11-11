//Procure o menor elemento do array
//Troque a posição do menor elemento com o primeiro
//Volte ao primeiro passo e considere o array a partir da próxima posição


package OrdenacaoSelection_OK;

public class Selection {

	public void swap(int vetor[], int menorPos, int i) {
		int aux = vetor[i];
		vetor[i] = vetor[menorPos];
		vetor[menorPos] = aux;
	}

	public void ordena(int vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			int menorPos = i;
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					menorPos = j;
				}
			}
			swap(vetor, menorPos, i);
		}
	}	
}
