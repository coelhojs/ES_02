/*
OK • Visualize todas as séries disponíveis para exibição
OK • Busque por série na lista de séries disponíveis
+- • Crie sua lista de séries favoritas
• Remova elementos da sua lista de séries favoritas
• Visualize sua lista de séries favoritas
• Considerando a lista de séries favoritas, crie uma opção para sugestão de uma série baseado na lista de séries ou em escolha aleatória.
*/

package CatalogoNetflix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Random;

import javax.swing.JOptionPane;

public class Catalogo {
	Serie[] series, favoritos;
	int contFavs, contSeries, i, match = 0, opcao;
	String resultado, serie;
	StringBuilder texto;
	Object[] opcoesMenu = { "Abrir o catalogo", "Pesquisar serie", "Favoritos", "Adicionar aos favoritos",
			"Remover dos favoritos", "Pedir uma sugestao de serie", "Sair" };

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

		while (opcao != 6) {
			int opcao = JOptionPane.showOptionDialog(null, "Selecione a opcao abaixo", "Bem vindo ao Catalogo Netflix",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesMenu, opcoesMenu[0]);
			switch (opcao) {
			// "Abrir o catalogo"
			case 0:
				JOptionPane.showOptionDialog(null, abrirCatalogo(), "Catalogo de series", JOptionPane.DEFAULT_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null, opcoesMenu, opcoesMenu[0]);
				break;
			// "Pesquisar serie"
			case 1:
				JOptionPane.showOptionDialog(null, pesquisarSerie(), "Pesquisa de series", JOptionPane.DEFAULT_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null, opcoesMenu, opcoesMenu[0]);

				break;
			// "Favoritos"
			case 2:
				JOptionPane.showOptionDialog(null, abrirFavoritos(), "Séries favoritas", JOptionPane.DEFAULT_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null, opcoesMenu, opcoesMenu[0]);
				break;
			// "Adicionar aos favoritos"
			case 3:

				JOptionPane.showOptionDialog(null, favoritar(), "Adicionar aos favoritos", JOptionPane.DEFAULT_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null, opcoesMenu, opcoesMenu[0]);

				break;
			// "Remover dos favoritos"
			case 4:
				JOptionPane.showOptionDialog(null, desfavoritar(), "Remover dos favoritos", JOptionPane.DEFAULT_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null, opcoesMenu, opcoesMenu[0]);
				break;
			// "Pedir uma sugestao de serie"
			case 5:
				JOptionPane.showOptionDialog(null, sugestaoSerie(), "Sugestao de série", JOptionPane.DEFAULT_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null, opcoesMenu, opcoesMenu[0]);

				break;
			// "Sair"
			case 6:
				encerrar();
				break;
			}
		}
	}

	public void inserirFim(Serie serie) throws Exception {
		if (contSeries >= series.length) {
			throw new Exception("Erro!");
		} else {
			series[contSeries] = serie;
			contSeries++;
		}
	}

	public void removerInicio() throws Exception {
		if (series.length == 0) {
			throw new Exception("Erro!");
		} else {
			int n = series.length - 1;
			for (int i = 0; i < n; i++) {
				series[i] = series[i + 1];
			}
		}
	}

	// baseado em inserirInicio de Lista
	public String favoritar() throws Exception {

		serie = JOptionPane.showInputDialog(null, "Informe o nome da Serie:", "Adicionar serie",
				JOptionPane.OK_CANCEL_OPTION);
		match = 0;
		if (serie == null) {
			resultado = "Banco de dados não encontrado.";
		} else {
			for (i = 0; i < series.length; i++) {
				if (serie.equalsIgnoreCase(series[i].getNome())) {
					match = i;
				}
			}
			for (i = 0; i < contFavs; i++) {
				if (serie.equalsIgnoreCase(favoritos[i].getNome())) {
					match = 0;
					resultado = "Série já está na lista.";
				}
			}
			if (match > 0) {
				for (i = contFavs; i > 0; i--) {
					favoritos[i] = favoritos[i - 1];
				}
				favoritos[0] = series[match];
				contFavs++;
				resultado = "Série adicionada";
			}
			// se a serie nao for encontrada
			if (!serie.equalsIgnoreCase(series[match].getNome())) {
				resultado = "Série já está na lista ou nome incorreto.";
			}

		}
		return resultado;
	}

	// baseado em removerPos de Lista
	public String desfavoritar() throws Exception {
		serie = JOptionPane.showInputDialog(null, "Informe o nome da Serie:", "Remover serie",
				JOptionPane.OK_CANCEL_OPTION);
		match = 0;
		if (serie == null) {
			resultado = "Banco de dados não encontrado.";
		} else if (contFavs > 0) {
			for (i = 0; i < contFavs; i++) {
				if (serie.equalsIgnoreCase(favoritos[i].getNome())) {
					match = i;
				}
			}
			if (match > 0) {

				if (contFavs == 0 || match < 0 || match >= contFavs) {
					resultado = "Lista vazia.";
				} else {
					contFavs--;
					for (int i = match; i < contFavs; i++) {
						favoritos[i] = favoritos[i + 1];
					}
					resultado = "Série removida.";
				}
			}

		} else {
			resultado = "Lista vazia.";
		}
		return resultado;
	}

	public String abrirCatalogo() throws Exception {
		texto = new StringBuilder();
		if (series.length > 0) {
			for (i = 1; i < series.length; i++) {
				texto.append(series[i].getNome() + ", " + series[i].getNumTemporadas() + " temporadas");
				texto.append("        ");
				if (i % 6 == 0) {
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

	public String pesquisarSerie() throws Exception {
		texto = new StringBuilder();

		serie = JOptionPane.showInputDialog(null, "Informe o nome da Serie:", "Pesquisa de serie",
				JOptionPane.OK_CANCEL_OPTION);
		if (serie == null) {
			resultado = "Banco de dados não encontrado.";
		} else {
			// criando string com os dados da serie encontrada
			for (i = 0; i < series.length; i++) {
				if (serie.equalsIgnoreCase(series[i].getNome())) {
					match = i;
					texto.append(series[i].getNome() + ", " + series[i].getTipo() + ", duracao: "
							+ series[i].getDuracao() + ", Pais: " + series[i].getPais() + ", Idioma: "
							+ series[i].getIdioma() + ", Emissora: " + series[i].getEmissora() + ", Transmissao: "
							+ series[i].getTransmissao() + ", Temporadas: " + series[i].getNumTemporadas()
							+ ", Episodios: " + series[i].getNumEpisodios());
				}
			}
			resultado = texto.toString();
			// se a serie nao for encontrada
			if (!serie.equalsIgnoreCase(series[match].getNome())) {
				resultado = "Verifique no catalogo o nome digitado.";
			}

		}
		return resultado;
	}

	public String sugestaoSerie() throws Exception {
		Random random = new Random();
		texto = new StringBuilder();

		int i = random.nextInt(61);

		texto.append(series[i].getNome() + ", " + series[i].getTipo() + ", duracao: " + series[i].getDuracao()
				+ ", Pais: " + series[i].getPais() + ", Idioma: " + series[i].getIdioma() + ", Emissora: "
				+ series[i].getEmissora() + ", Transmissao: " + series[i].getTransmissao() + ", Temporadas: "
				+ series[i].getNumTemporadas() + ", Episodios: " + series[i].getNumEpisodios());

		return texto.toString();
	}

	public void encerrar() throws Exception {
		System.exit(0);
	}
}