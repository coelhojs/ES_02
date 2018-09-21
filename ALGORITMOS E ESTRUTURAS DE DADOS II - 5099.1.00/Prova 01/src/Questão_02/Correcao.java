package Questão_02;

public class Correcao {
	Pilha combina(Pilha p1, Pilha p2) {
		int x, y;
		Pilha p3 = new Pilha();
		x = p1.desempilhar();
		y = p2.desempilhar();
		while (!p1.vazia() && !p2.vazia()) {
			if (x > y) {
				p3.empilhar(y);
				y = p2.desempilhar();
			} else {
				p3.empilhar(x);
				x = p1.desempilhar();
			}
		}
		if (x > y) {
			p3.empilha(y);
			p3.empilha(x);
		} else {
			p3.empilha(x);
			p3.empilha(y);
		}
		while (!p1.vazia()) {
			x = p1.desempilha();
			p3.empilha(x);
		}
		while (!p2.vazia()) {
			y = p2.desempilha();
			p3.empilha(y);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
