package Parte_02;

public class HashRehash {
	public int tamTabela;
	//public int[] tabela = new int[7];
	
	public HashRehash() {
		this(7);
	}
	
	public HashRehash(int tamTabela) {
		this(tamTabela);
	}

	int hash(int x) {
		return x % tamTabela;
	}

	int rehash(int x) {
		return ++x % tamTabela;
	}

	void inserir(int x) throws Exception {
		if (tabela[hash(x)] == null) {
			tabela[hash(x)] = x;
		} else if (tabela[rehash(x)] == null) {
			tabela[rehash(x)] = x;
		} else {
			throw new Exception("Erro");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
