package Códigos;

public class FilaCircular {
	int[] array;
	int primeiro, ultimo;

	FilaCircular() {
		this(5);
	}

	FilaCircular(int tamanho) {
		array = new int[tamanho + 1];
		primeiro = ultimo = 0;
	}

	// inserir(1)
	void inserir(int x) throws Exception {
		if (((ultimo + 1) % array.length) == primeiro)
			throw new Exception("Fila cheia!");
		array[ultimo] = x;
		ultimo = (ultimo + 1) % array.length;
	}

	// Remover()
	int remover() throws Exception {
		if (primeiro == ultimo)
			throw new Exception("Fila vazia!");
		int resp = array[primeiro];
		primeiro = (primeiro + 1) % array.length;
		return resp;
	}

	void mostrar() {
		int i = primeiro;
		System.out.print("[");
		while (i != ultimo) {
			System.out.print(array[i] + " ");
			i = ((i + 1) % array.length);
		}
		System.out.println("]");
	}

	/*
	 * boolean isVazio() {
	 * 
	 * }
	 */

	/*
	 * void pesquisar() {
	 * 
	 * }
	 */

	public static void main(String[] args) throws Exception {
		System.out.println("==== FILA CIRCULAR ====");
		FilaCircular filaCircular = new FilaCircular();
		filaCircular.inserir(1);
		filaCircular.inserir(3);
		filaCircular.inserir(5);
		filaCircular.inserir(7);
		// filaCircular.inserir(9);
		// filaCircular.inserir(2);
		filaCircular.remover();
		filaCircular.inserir(4);
		filaCircular.inserir(6);
		filaCircular.remover();
		filaCircular.inserir(8);
		filaCircular.mostrar();
	}

}
