package Aula_05;

public class Fila2Pilha {

	public static void main(String[] args) throws Exception {
		Fila f1 = new Fila();
		f1.enfileirar(5);
		f1.enfileirar(7);
		f1.enfileirar(10);
		f1.enfileirar(20);
		
		System.out.print("[ ");
		while (!f1.isVazia()) {
			System.out.print(f1.desenfileirar() + " ");

		}
		System.out.print("]\n");

	}

}
