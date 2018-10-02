package CatalogoNetflix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Catalogo {
	int i = 0, opcao;
	Serie[] series;
	StringBuilder texto;
	String resultado, serie;

	public void inicializarCatalogo() throws Exception {
		series = new Serie[61];
		i = 0;
		File file = new File("Series.txt");

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
		String linha = null;
		linha = br.readLine();

		while (i < series.length) {
			String campos[] = linha.split(";");

			series[i] = new Serie();

			series[i].setNome(campos[0]);
			series[i].setTipo(campos[1]);
			series[i].setDuracao(campos[2]);
			series[i].setPais(campos[3]);
			series[i].setIdioma(campos[4]);
			series[i].setEmissora(campos[5]);
			series[i].setTransmissao(campos[6]);
			series[i].setNumTemporadas(campos[7]);
			series[i].setNumEpisodios(campos[8]);

			i++;
			linha = br.readLine();
		}
		br.close();
	}

	public void menu() throws Exception {
		Object[] options = { "Abrir o catálogo", "Pesquisar série", "Lista de favoritas", "Pedir uma sugestão de série",
				"Sair" };
		int opcao = JOptionPane.showOptionDialog(null, "Selecione a opção abaixo", "Bem vindo ao Catálogo Netflix",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		while (opcao != 4) {
			switch (opcao) {
			case 0:
				opcao = JOptionPane.showOptionDialog(null, abrirCatalogo(), "Catálogo de séries",
						JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
				break;
			case 1:
				opcao = JOptionPane.showOptionDialog(null, pesquisarSerie(), "Catálogo de séries",
						JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
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

	public String abrirCatalogo() throws Exception {
		texto = new StringBuilder();

		for (i = 1; i < series.length; i++) {
			texto.append(series[i].getNome() + ", " + series[i].getNumTemporadas() + " temporadas");
			texto.append("        ");
			if (i % 4 == 0) {
				texto.append("\n\n");
			}
		}
		return texto.toString();
	}

	// quando clico no cancel, dá erro de exception
	public String pesquisarSerie() throws Exception {
		texto = new StringBuilder();

		serie = JOptionPane.showInputDialog(null, "Informe o nome da Série:", "Pesquisa de série",
				JOptionPane.OK_CANCEL_OPTION);
		if (opcao == JOptionPane.OK_OPTION) {
			for (i = 1; i < series.length; i++) {
				if (serie.equalsIgnoreCase(series[i].getNome())) {
					texto.append(series[i].getNome() + ", " + series[i].getTipo() + ", duração: "
							+ series[i].getDuracao() + ", País: " + series[i].getPais() + ", Idioma: "
							+ series[i].getIdioma() + ", Emissora: " + series[i].getEmissora() + ", Transmissão: "
							+ series[i].getTransmissao() + ", Temporadas: " + series[i].getNumTemporadas()
							+ ", Episódios: " + series[i].getNumEpisodios());
					resultado = texto.toString();
				}
			}
		} else {
			menu();
		}
		return resultado;
	}

	public void listaFavoritos() throws Exception {

	}

	public void sugestaoSerie() throws Exception {

	}

}
