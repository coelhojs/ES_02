//Procure o menor elemento do array
//Troque a posição do menor elemento com o primeiro
//Volte ao primeiro passo e considere o array a partir da próxima posição

package OrdenacaoSelection;

public class Selection {

	public int getMenor(int vetor[]) {
		for(int i =0;i<vetor.length;i++) {
			if(vetor[i]<vetor[i])
		}
	}

	public void ordena(int vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i + 1] < vetor[i]) {
					int aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
				}
			}
		}
	}
}
