package HashComRehash;

public class Rehash {

	int hash(int x) {
		return x % tamTabela;
	}

	int rehash(int x) {
		return ++x % tamTabela;
	}

}
