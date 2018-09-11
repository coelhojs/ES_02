package Algoritmos;

public class PilhaFlexivel {
	public Celula topo;

	public PilhaFlexivel() {
		this.topo = null;
	}

	public void inserir(int x) {
		Celula tmp = new Celula(x);
		tmp.prox = topo;
		topo = tmp;
		tmp = null;
	}

	public int remover() throws Exception {
		if (topo == null)
			throw new Exception("Erro!");
		int elemento = topo.elemento;
		Celula tmp = topo;
		topo = topo.prox;
		tmp.prox = null;
		tmp = null;
		return elemento;
	}

	public void mostrar() {
		System.out.print("[ ");
		for (Celula i = topo; i != null; i = i.prox) {
			System.out.print(i.elemento + "  ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) throws Exception {
		PilhaFlexivel pilhaFlexivel = new PilhaFlexivel();
		pilhaFlexivel.inserir(9);
		pilhaFlexivel.inserir(9);
		pilhaFlexivel.inserir(9);
		pilhaFlexivel.inserir(9);
		pilhaFlexivel.inserir(9);
		pilhaFlexivel.inserir(9);
		pilhaFlexivel.inserir(9);
		pilhaFlexivel.inserir(9);
		pilhaFlexivel.inserir(9);
		pilhaFlexivel.inserir(9);
		pilhaFlexivel.remover();
		pilhaFlexivel.inserir(8);
		pilhaFlexivel.remover();
		pilhaFlexivel.inserir(4);
		pilhaFlexivel.mostrar();

	}

}
