package CatalogoNetflix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Catalogo {
	Serie[] series, favoritos;
	StringBuilder texto;
	String resultado, serie;
	int n, i, match, opcao;
	Object[] opcoesIniciais = { "Abrir o catalogo", "Pesquisar serie", "Lista de favoritas",
			"Pedir uma sugestao de serie", "Sair" };
	Object[] opcoesPesquisa = { "Adicionar serie aos favoritos", "Remover dos favoritos", "Voltar ao menu anterior",
			"Sair" };

	Catalogo(int tamanho) {
		series = new Serie[tamanho];
		favoritos = new Serie[tamanho];
		n = 0;
	}

	public void inicializarCatalogo() throws Exception {
		File file = new File("Series.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
		String linha = br.readLine();

		while (i < series.length) {
			String campos[] = linha.split(";");

			series[i] = new Serie();

			series[i].setId(i);
			series[i].setNome(campos[0]);
			series[i].setTipo(campos[1]);
			series[i].setDuracao(campos[2]);
			series[i].setPais(campos[3]);
			series[i].setIdioma(campos[4]);
			series[i].setEmissora(campos[5]);
			series[i].setTransmissao(campos[6]);
			series[i].setNumTemporadas(campos[7]);
			series[i].setNumEpisodios(campos[8]);
			inserirFim(series[i]);
			i++;
			linha = br.readLine();
		}
		br.close();
	}

	public void menu() throws Exception {

		int opcao = JOptionPane.showOptionDialog(null, "Selecione a opcao abaixo", "Bem vindo ao Catalogo Netflix",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesIniciais, opcoesIniciais[0]);
		while (opcao != 4) {
			switch (opcao) {
			case 0:
				opcao = JOptionPane.showOptionDialog(null, abrirCatalogo(), "Catalogo de series",
						JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesIniciais,
						opcoesIniciais[0]);
				break;
			case 1:
				pesquisarSerie();
				break;
			case 2:
				listaFavoritos();
				break;
			case 3:
				sugestaoSerie();
				break;
			default:

				break;
			}
		}
	}

	void inserirInicio(Serie serie) throws Exception {
		if (n >= series.length) {
			throw new Exception("Erro!");
		} else {
			// levar elementos para o fim do array
			for (int i = n; i > 0; i--) {
				series[i] = series[i - 1];
			}
			series[0] = serie;
			n++;
		}
	}

	void inserirFim(Serie serie) throws Exception {
		if (n >= series.length) {
			throw new Exception("Erro!");
		} else {
			series[n] = serie;
			n++;
		}
	}

	void inserir(Serie serie, int pos) throws Exception {
		if (n >= series.length || pos < 0 || pos > n) {
			throw new Exception("Erro! Lista cheia");
		} else {
			// levar elementos para o fim do array
			for (int i = n; i > pos; i--) {
				series[i] = series[i - 1];
			}
			series[pos] = serie;
			n++;
		}
	}

	void favoritar(Serie serie, int pos) throws Exception {
		if (n == 0 || pos < 0 || pos > n) {
			throw new Exception("Erro! Lista cheia");
		} else {
			// levar elementos para o fim do array
			//for (int i = n; i > pos; i--) {
			//	series[i] = series[i - 1];
			//}
			favoritos[pos] = null;
			n++;
		}
	}

	Serie removerInicio() throws Exception {
		if (n == 0) {
			throw new Exception("Erro!");
		} else {
			Serie resp = series[0];
			n--;
			for (int i = 0; i < n; i++) {
				series[i] = series[i + 1];
			}
			return resp;
		}
	}

	Serie removerFim() throws Exception {
		if (n == 0) {
			throw new Exception("Erro!");
		} else {
			return series[--n];
		}
	}

	Serie remover(int pos) throws Exception {
		if (n == 0 || pos < 0 || pos >= n) {
			throw new Exception("Erro!");
		} else {
			Serie resp = series[pos];
			n--;
			for (int i = pos; i < n; i++) {
				series[i] = series[i + 1];
			}
			return resp;
		}
	}

	Serie desfavoritar(int seriePos) throws Exception {
		if (n == 0 || seriePos < 0 || seriePos >= n) {
			throw new Exception("Erro!");
		} else {
			Serie resp = series[seriePos];
			n--;
			for (int i = seriePos; i < n; i++) {
				series[i] = series[i + 1];
			}
			return resp;
		}
	}

	void mostrar() {
		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(series[i].getNome() + " ");
		}
		System.out.println("]");
	}

	public String abrirCatalogo() throws Exception {
		texto = new StringBuilder();

		for (i = 1; i < series.length; i++) {
			texto.append(series[i].getNome() + ", " + series[i].getNumTemporadas() + " temporadas");
			texto.append("        ");
			if (i % 4 == 0) {
				texto.append("\n\n");
			}
			System.out.println(series[i].getId());
		}
		return texto.toString();
	}

	public void pesquisarSerie() throws Exception {
		texto = new StringBuilder();

		serie = JOptionPane.showInputDialog(null, "Informe o nome da Serie:", "Pesquisa de serie",
				JOptionPane.OK_CANCEL_OPTION);
		if (serie != null) {
			for (i = 1; i < series.length; i++) {
				if (serie.equalsIgnoreCase(series[i].getNome())) {
					match = i;
					texto.append(series[i].getNome() + ", " + series[i].getTipo() + ", duracao: "
							+ series[i].getDuracao() + ", Pais: " + series[i].getPais() + ", Idioma: "
							+ series[i].getIdioma() + ",\nEmissora: " + series[i].getEmissora() + ", Transmissao: "
							+ series[i].getTransmissao() + ", Temporadas: " + series[i].getNumTemporadas()
							+ ", Episodios: " + series[i].getNumEpisodios());
					resultado = texto.toString();
				}
			}
			if (!serie.equalsIgnoreCase(series[match].getNome())) {
				match = 999;
				resultado = "Verifique no catalogo o nome digitado.";
			}
			opcao = JOptionPane.showOptionDialog(null, resultado, "Catalogo de series", JOptionPane.DEFAULT_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null, opcoesPesquisa, opcoesPesquisa[0]);

			while (opcao != 4) {
				switch (opcao) {
				case 0:
					favoritar(series[match], series[match].getId());
					break;
				case 1:
//desfavoritar();
					break;
				case 2:
					menu();
					break;
				case 3:
					opcao = 4;
					encerrar();
					break;
				}
			}
		} else {
			menu();
		}
	}
	/*
	 * public void adicionarFavorito(Serie serie) throws Exception { for (i = 0; i <
	 * favoritos.length; i++) { if (favoritos[i] == null) { favoritos[i] =
	 * series[i]; } else { throw new Exception("Erro! Lista cheia"); } } }
	 * 
	 * public void removerFavoritos() throws Exception {
	 * 
	 * }
	 */

	public void listaFavoritos() throws Exception {

	}

	public void sugestaoSerie() throws Exception {

	}
	
	public void encerrar() throws Exception {
		System.exit(0);
	}
}