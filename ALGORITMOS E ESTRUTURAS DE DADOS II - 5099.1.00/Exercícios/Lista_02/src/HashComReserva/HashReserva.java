package HashComReserva;

public class HashReserva {
	public Integer[] tabela;
	public int tamTabela, tamReserva, numReserva = 0;

	public HashReserva() {
		this(7);
	}

	public HashReserva(int tamTabela) {
		this.tamTabela = tamTabela;
		tabela = new Integer[tamTabela];
	}

	public int hash(int x) {
		return x % tamTabela;
	}

	public void inserir(int x) throws Exception {
		int i = hash(x);
		if (tabela[i] == null) {
			tabela[i] = x;
		} else if (tamReserva < tamReserva) {
			tabela[tamTabela + numReserva] = x;
			numReserva++;
		} else {
			throw new Exception("Erro! Reserva cheia.");
		}
	}

	public void remover(int x) {
		int pos = hash(x);
		if (tabela[pos] == x) {
			tabela[pos] = null;
		} else if (tabela[pos] == null) {
			
		}
	}

	public int pesquisar(int x) {
		int i = hash(x);
		Integer resp = null;
		if (tabela[i] == x) {
			resp = i;
		} else if (tabela[i] != null) {
			for (int j = 0; j < tamReserva; j++) {
				if (tabela[tamTabela + j] == x) {
					resp = tamTabela + j;
					j = tamReserva;
				}
			}
		}
		return resp;
	}

}
