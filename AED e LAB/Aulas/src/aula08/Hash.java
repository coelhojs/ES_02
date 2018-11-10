package aula08;

public class Hash {
	int m;

	int t;

	int reserva;

	int tabela[];

	final int NULO = Integer.MIN_VALUE;

	Hash() {
		this.m = 5;
		this.t = 5;
		this.reserva = 0;
		this.tabela = new int[m + t];
	}

	Hash(int m, int t) {
		this.m = m;
		this.t = t;
		this.reserva = 0;
		this.tabela = new int[m + t];
	}

	void zerarTabela() {
		for (int i = 0; i < tabela.length; i++)
			this.tabela[i] = NULO;
	}

	int hash(int k) {
		return k % m;
	}

	void inserir(int elemento) throws Exception {
		int pos = hash(elemento);

		if (tabela[pos] == NULO) {
			tabela[pos] = elemento;
		} else if ((m + reserva) < tabela.length) {
			tabela[m + reserva] = elemento;
			reserva++;
		} else {
			throw new Exception("::ERRO:: Area de reserva cheia");
		}
	}

	double colisoes() {
		return reserva / m * 100;
	}

	void remover(int elemento) throws Exception {
		int pos = hash(elemento);

		if (tabela[pos] == elemento) {
			tabela[pos] = NULO;
			for (int i = m; i < m + reserva; i++) {
				if (tabela[i] % m == pos) {
					tabela[pos] = tabela[i];
					for (int j = i; j < m + reserva - 1; j++)
						tabela[j] = tabela[j + 1];
					reserva--;
					i = m + reserva;
				}
			}
		} else if (tabela[pos] == NULO) {
			throw new Exception("ERRO:: NAO EXISTE ELEMENTO");

		} else {
			for (int i = m; i < m + reserva; i++) {
				if (tabela[i] == elemento) {
					for (int j = i; j < m + reserva - 1; j++)
						tabela[j] = tabela[j + 1];
					reserva--;
					i = m + reserva;
				}
			}
		}
	}

}
