package HashComReserva;

public class HashReservaApp {

	public static void main(String[] args) throws Exception {
		HashReserva hash = new HashReserva();
		hash.inserir(9);
		for (int i = 0; i < 7; i++) {
			System.out.println(hash.tabela[i]);
		}
		System.out.println(hash.pesquisar(9));
	}

}
