package HashIndireta;

public class HashIndireta {
	public int tamTabela;
	
	public ListaDinamicaSimples[] tabela;

	public HashIndireta(int m) {
		this.tamTabela = m;
		tabela = new ListaDinamicaSimples[m];
		for (int i = 0; i < m; i++){ tabela[i] = new Celula(); }

		}

	int hash(int x) {
		return x % tamTabela;
	}
	
	void inserir(int x) throws Exception {
		if (pesquisar(x) == true){
		throw new Exception("Erro ao inserir!");
		} else {
		tabela[hash(x)].inserir(x);

		}

		}
	
	boolean pesquisar(int x){
		return tabela[hash(x)].pesquisar(x);

		}
	
	void remover(int x){
		if (pesquisar(x) == false){
		throw new Exception("Erro ao remover!");
		} else {
		tabela[hash(x)].remover(x);

		}

		}
}}
