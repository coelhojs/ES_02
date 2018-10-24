package HashComReserva;

public class Hash {
	public int[] tabela;
	public int tamTabela;

	public Hash() {
		this(7);
	}

	public Hash(int tamTabela) {
		tabela = new int[tamTabela];
	}

	int hash(int x) {
		return x % tamTabela;
	}

	void inserir(int x) throws Exception {
		int i = hash(x);
		if (tabela[i] == null) {
			tabela[i] = x;
		} else if (numReverva < tamReserva) {
			tabela[tamTabela + numReserva] = x;
			numReserva++; // o valor inicial de numReserva é zero
		} else {
			throw new Exception("Erro! Reserva cheia.");
		}
	}

	int pesquisar(int x) {
		int i = hash(x), resp = NULO;
		if (tabela[i] == x) {
			resp = i;
		} else if (tabela[i] != NULO) {
			for (int i = 0; i < tamReserva; i++) {
				if (tabela[tamTabela + i] == x) {
					resp = tamTabela + i;
					i = tamReserva;
				}
			}
		}
		return resp;
	}

}
