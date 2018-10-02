package CatalogoNetflix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Catalogo {
	Serie[] array;
	int n, i;

	Catalogo() {
		this(61);
	}

	Catalogo(int tamanho) {
		array = new Serie[tamanho];
		n = 0;
	}

	public void inicializarCatalogo() throws Exception {
		File file = new File("Series.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
		String linha = null;
		linha = br.readLine();

		while (i < array.length) {
			String campos[] = linha.split(";");

			array[i] = new Serie();

			array[i].setId(i);
			array[i].setNome(campos[0]);
			array[i].setTipo(campos[1]);
			array[i].setDuracao(campos[2]);
			array[i].setPais(campos[3]);
			array[i].setIdioma(campos[4]);
			array[i].setEmissora(campos[5]);
			array[i].setTransmissao(campos[6]);
			array[i].setNumTemporadas(campos[7]);
			array[i].setNumEpisodios(campos[8]);
			inserirFim(array[i]);
			i++;
			linha = br.readLine();
		}
		br.close();
	}

	void inserirInicio(Serie serie) throws Exception {
		if (n >= array.length) {
			throw new Exception("Erro!");
		} else {
			// levar elementos para o fim do array
			for (int i = n; i > 0; i--) {
				array[i] = array[i - 1];
			}
			array[0] = serie;
			n++;
		}
	}

	void inserirFim(Serie serie) throws Exception {
		if (n >= array.length) {
			throw new Exception("Erro!");
		} else {
			array[n] = serie;
			n++;
		}
	}

	void inserir(Serie serie, int pos) throws Exception {
		if (n >= array.length || pos < 0 || pos > n) {
			throw new Exception("Erro! Lista cheia");
		} else {
			// levar elementos para o fim do array
			for (int i = n; i > pos; i--) {
				array[i] = array[i - 1];
			}
			array[pos] = serie;
			n++;
		}
	}

	Serie removerInicio() throws Exception {
		if (n == 0) {
			throw new Exception("Erro!");
		} else {
			Serie resp = array[0];
			n--;
			for (int i = 0; i < n; i++) {
				array[i] = array[i + 1];
			}
			return resp;
		}
	}

	Serie removerFim() throws Exception {
		if (n == 0) {
			throw new Exception("Erro!");
		} else {
			return array[--n];
		}
	}

	Serie remover(int pos) throws Exception {
		if (n == 0 || pos < 0 || pos >= n) {
			throw new Exception("Erro!");
		} else {
			Serie resp = array[pos];
			n--;
			for (int i = pos; i < n; i++) {
				array[i] = array[i + 1];
			}
			return resp;
		}
	}

	void mostrar() {
		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i].getNome() + " ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) throws Exception {
		System.out.println("==== Catalogo ====");
		Catalogo catalogo = new Catalogo();
		
		catalogo.inicializarCatalogo();
		
		catalogo.mostrar();

	}

}