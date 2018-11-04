package HashComRehash;

public class HashRehash {
	public Integer[] tabela;
	public int tamTabela;

	public HashRehash() {
		this(7);
	}

	public HashRehash(int tamTabela) {
		this.tamTabela = tamTabela;
		tabela = new Integer[tamTabela];
	}

	int hash(int x) {
		return x % tamTabela;
	}

	int rehash(int x) {
		return ++x % tamTabela;
	}

	public void inserir(int x) throws Exception {
		int i = hash(x);
		int j = rehash(x);
		if (tabela[i] == null) {
			tabela[i] = x;
		} else if (tabela[j] == null) {
			tabela[j] = x;
		} else {
			throw new Exception("Erro");
		}
	}

	public int pesquisar(int x) throws Exception {
		int i = hash(x);
		int j = rehash(x);
		Integer resp = null;
		if (tabela[i] == x) {
			resp = i;
		} else if (tabela[j] == x) {
			resp = j;
		} else {
			throw new Exception("Não encontrado");
		}
		return resp;
	}

}
