/*
OK • Visualize todas as séries disponíveis para exibição
OK • Busque por série na lista de séries disponíveis
• Crie sua lista de séries favoritas
• Remova elementos da sua lista de séries favoritas
• Visualize sua lista de séries favoritas
• Considerando a lista de séries favoritas, crie uma opção para sugestão de uma série baseado na lista de séries ou em escolha aleatória.
*/

package CatalogoNetflix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Catalogo {
	Serie[] series, favoritos;
	int contFavs, contSeries, i, match, opcao;
	String resultado, serie;
	StringBuilder texto;
	Object[] opcoesIniciais = { "Abrir o catalogo", "Pesquisar serie", "Lista de favoritas",
			"Pedir uma sugestao de serie", "Sair" },
			opcoesPesquisa = { "Adicionar serie aos favoritos", "Remover dos favoritos", "Voltar ao menu principal",
					"Sair" };

	Catalogo(int tamanho) {
		series = new Serie[tamanho];
		favoritos = new Serie[tamanho];
		contFavs = 0;
		contSeries = 0;
	}

	public void inicializarCatalogo() throws Exception {
		File file = new File("Series.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
		String linha = null;
		linha = br.readLine();

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

		do {
			int opcao = JOptionPane.showOptionDialog(null, "Selecione a opcao abaixo", "Bem vindo ao Catalogo Netflix",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesIniciais,
					opcoesIniciais[0]);
			switch (opcao) {
			case 0:
				JOptionPane.showOptionDialog(null, abrirCatalogo(), "Catalogo de series", JOptionPane.DEFAULT_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null, opcoesIniciais, opcoesIniciais[0]);
				break;
			case 1:
				pesquisarSerie();
				break;
			case 2:
				JOptionPane.showOptionDialog(null, abrirFavoritos(), "Séries favoritas", JOptionPane.DEFAULT_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null, opcoesIniciais, opcoesIniciais[0]);
				break;
			case 3:
				sugestaoSerie();
				break;
			case 4:
				opcao = 4;
				encerrar();
				break;
			}
		} while (opcao != 4);
	}

	void inserirFim(Serie serie) throws Exception {
		if (contSeries >= series.length) {
			throw new Exception("Erro!");
		} else {
			series[contSeries] = serie;
			contSeries++;
		}
	}

	void removerInicio() throws Exception {
		if (series.length == 0) {
			throw new Exception("Erro!");
		} else {
			int n = series.length - 1;
			for (int i = 0; i < n; i++) {
				series[i] = series[i + 1];
			}
		}
	}

	void favoritar(Serie serie) throws Exception {
		if (contFavs >= favoritos.length) {
			throw new Exception("Erro!");
		} else {
			// comparacao
			for (int i = 0; i < contFavs; i++) {
				if (serie.equals(favoritos[i])) {
					i = 0;
				} else {
					i = contFavs;
				}
			}
			// se a serie ainda nao estiver na lista de favoritos, execute:
			for (int aux = i; i > 0; i--) {
				favoritos[aux] = favoritos[aux - 1];
			}
			favoritos[0] = serie;
			contFavs++;
		}
	}

	void favoritarTEST(Serie serie) throws Exception {
		if (contFavs >= series.length) {
			throw new Exception("Erro!");
		} else {
			for (int i = contFavs; i > 0; i--) {
				favoritos[i] = favoritos[i - 1];
			}
			favoritos[0] = serie;
			contFavs++;
		}
	}

	Serie desfavoritar(int pos) throws Exception {
		if (pos < 0 || pos >= contFavs) {
			throw new Exception("Erro!");
		} else {
			Serie resp = series[pos];
			contFavs--;
			for (int i = pos; i < contFavs; i++) {
				series[i] = series[i + 1];
			}
			return resp;
		}
	}

	public String abrirCatalogo() throws Exception {
		texto = new StringBuilder();
		if (series.length > 0) {
			for (i = 1; i < series.length; i++) {
				texto.append(series[i].getNome() + ", " + series[i].getNumTemporadas() + " temporadas");
				texto.append("        ");
				if (i % 4 == 0) {
					texto.append("\n\n");
				}
			}
			return texto.toString();
		} else {
			return "Lista vazia";
		}
	}

	public String abrirFavoritos() throws Exception {
		if (contFavs > 0) {
			texto = new StringBuilder();
			for (i = 0; i < contFavs; i++) {
				texto.append(favoritos[i].getNome() + ", " + favoritos[i].getNumTemporadas() + " temporadas");
				texto.append("        ");
				if (i % 4 == 0) {
					texto.append("\n\n");
				}
			}
			return texto.toString();
		} else {
			return "Lista vazia";
		}
	}

	public void pesquisarSerie() throws Exception {
		texto = new StringBuilder();

		serie = JOptionPane.showInputDialog(null, "Informe o nome da Serie:", "Pesquisa de serie",
				JOptionPane.OK_CANCEL_OPTION);
		if (serie != null) {
			// criando string com os dados da serie encontrada
			for (i = 0; i < series.length; i++) {
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
			// se a serie nao for encontrada
			if (!serie.equalsIgnoreCase(series[match].getNome())) {
				resultado = "Verifique no catalogo o nome digitado.";
			}
			do {
				opcao = JOptionPane.showOptionDialog(null, resultado, "Catalogo de series", JOptionPane.DEFAULT_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null, opcoesPesquisa, opcoesPesquisa[0]);

				switch (opcao) {
				case 0:
					favoritar(series[match]);
					opcao = 4;
					menu();
					break;
				case 1:
					// desfavoritar();
					// opcao = 4;
					// menu();
					break;
				case 2:
					opcao = 4;
					menu();
					break;
				case 3:
					opcao = 4;
					encerrar();
					break;
				}

			} while (opcao != 4);
		} else {
			menu();
		}
	}

	public void sugestaoSerie() throws Exception {

	}

	public void encerrar() throws Exception {
		System.exit(0);
	}
}