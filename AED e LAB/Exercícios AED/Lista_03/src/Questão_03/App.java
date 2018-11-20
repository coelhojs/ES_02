package Questão_03;

public class App {

	public static void main(String[] args) {
		int[] sequencia = { 3, 4, 9, 2, 5, 8, 2, 1, 7, 4, 6, 2, 9, 8, 5, 1 };

		Heapsort heapsort = new Heapsort(sequencia);
		int[] ordenada = heapsort.heapsort(sequencia);
		
		System.out.println(ordenada[0]);
	}
}
