package CatalogoNetflix;

public class Favorito {
	Favorito[] favoritos;
	int n;

	/*
	 * Favorito() { this(60); }
	 */

	Favorito(int tamanho) {
		favoritos = new Favorito[tamanho];
		n = 0;
	}

	void adicionarFavorito(Serie serie) throws Exception {
		if (n >= favoritos.length || serie.getId() < 0 || serie.getId() > n) {
			throw new Exception("Erro! Lista cheia");
		} else {
			System.out.println(favoritos[serie.getId()]);
		}
	}
	
/*	int remover(int pos) throws Exception {
		if (n == 0 || pos < 0 || pos >= n) {
			throw new Exception("Erro!");
		} else {
			int resp = series[pos].getId();
			n--;
			for (int i = pos; i < n; i++) {
				series[i] = series[i + 1];
			}
			return resp;
		}
	}*/

	/*void mostrar() {
		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(series[i].getNome() + " ");
		}
		System.out.println("]");
	}*/
}
