package HashComRehash;

public class HashRehashApp {

	public static void main(String[] args) throws Exception {
		HashRehash hash = new HashRehash();
		hash.inserir(9);
		hash.inserir(16);
		for (int i = 0; i < 7; i++) {
			System.out.println(hash.tabela[i]);
		}
		System.out.println(hash.pesquisar(16));
	}

}
