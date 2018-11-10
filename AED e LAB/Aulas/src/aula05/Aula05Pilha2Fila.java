package aula05;

public class Aula05Pilha2Fila {
	public static void main(String[] args) throws Exception {
		Pilha p1 = new Pilha();
		p1.empilhar(5);
		p1.empilhar(7);
		p1.empilhar(10);
		p1.empilhar(20);
		
		System.out.print("[ ");
		while(!p1.isVazia()){
			System.out.print(p1.desempilhar() + " ");
		}
		System.out.print("]\n");
		
	}
}
