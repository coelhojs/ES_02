package OrdenacaoBubble;

public class Bubble {

	public static void ordenar(int[] vetor) {
		int tam = vetor.length;
		for (int i = 0; i < tam - 1; i++) {
			for (int j = (tam - 1); j > i; j--) {
				if (vetor[j] < vetor[j - 1]) {
					int aux = vetor[j];
					vetor[j] = vetor[j - 1];
					vetor[j - 1] = aux;
				}
			}
		}
	}

	public static String asString(int[] vetor) {

		String vetorString = "";
		vetorString.concat("[ ");
		for (int i = 0; i < vetor.length; i++) {
			String vetorPos = Integer.toString(vetor[i]);
			vetorString.concat(vetorPos);
			vetorString.concat(", ");
		}
		vetorString.concat(" ]");
		return vetorString;
	}

	public static void main(String[] args) {
		int[] vetor = { 101, 115, 30, 63, 47, 20 };

		System.out.println("Vetor original: ");
		ordenar(vetor);
		System.out.println(vetor[0] + ", " + vetor[1]);

	}
}
