package Quest�o_01;

public class Deque {
	int itens[];
	int primeiro, ultimo;
	int TAM, pos;
	int cont = 1;

	Deque() {
		itens = new int[5];
		this.ultimo = 0;

	}

	public boolean cheia() {
		TAM = itens.length;
		if (pos >= TAM) {
			return true;
		} else {
			return false;
		}

	}

	public int inserir_inicio(int item) {
		if (!cheia()) {
			this.primeiro--;
			if (this.primeiro < 0) {
				cont++;
				this.primeiro = TAM - cont;
			}
			itens[this.primeiro] = item;
			return 1;
		}
		return 0;
	}

	void inserir_pos(int item, int pos) {
		if (!cheia()) {
			if (this.primeiro < 0) {
				this.primeiro = TAM - 1;
			}
			itens[pos] = item;
		}
	}

	void mostrar() {
		System.out.print("[ ");
		for (int i = 0; i < TAM; i++) {
			System.out.print(itens[i] + " ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		Deque deque = new Deque();
		deque.inserir_inicio(15);
		deque.inserir_inicio(10);
		deque.inserir_inicio(9);
		deque.inserir_pos(25, 4);
		System.out.println("DEQUE");
		deque.mostrar();
	}

}
