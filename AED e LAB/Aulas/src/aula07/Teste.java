
public class Teste {

	public static void main(String[] args) throws Exception {

		AVL binaria = new AVL();
		AVL avl = new AVL();

		for (int i = 1; i <= 6; i++)
			binaria.inserir(i);

		for (int i = 1; i <= 6; i++)
			avl.inserirAVL(i);

		System.out.println("altura da binaria: " + binaria.getAltura());
		System.out.println("altura da avl: " + avl.getAltura());

	}
}
