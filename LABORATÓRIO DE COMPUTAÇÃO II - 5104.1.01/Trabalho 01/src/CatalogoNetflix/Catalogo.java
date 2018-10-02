package CatalogoNetflix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Catalogo {
	int i = 0, match, opcao;
	Serie[] series, favoritos;
	StringBuilder texto;
	String resultado, serie;

	public void inicializarCatalogo() throws Exception {
		series = new Serie[61];
		favoritos = new Serie[61];
		i = 0;
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

			i++;
			linha = br.readLine();
		}
		br.close();
	}

	public void menu() throws Exception {
		Object[] opcoesIniciais = { "Abrir o cat�logo", "Pesquisar s�rie", "Lista de favoritas",
				"Pedir uma sugest�o de s�rie", "Sair" };

		Object[] opcoesPesquisa = { "Adicionar s�rie aos favoritos", "Voltar ao menu anterior" };

		int opcao = JOptionPane.showOptionDialog(null, "Selecione a op��o abaixo", "Bem vindo ao Cat�logo Netflix",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesIniciais, opcoesIniciais[0]);
		while (opcao != 4) {
			switch (opcao) {
			case 0:
				opcao = JOptionPane.showOptionDialog(null, abrirCatalogo(), "Cat�logo de s�ries",
						JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesIniciais,
						opcoesIniciais[0]);
				break;
			case 1:
				opcao = JOptionPane.showOptionDialog(null, pesquisarSerie(), "Cat�logo de s�ries",
						JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesPesquisa,
						opcoesPesquisa[0]);
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
			System.out.println(series[i].getId());
		}
		return texto.toString();
	}

	// quando clico no cancel, d� erro de exception
	public String pesquisarSerie() throws Exception {
		texto = new StringBuilder();

		serie = JOptionPane.showInputDialog(null, "Informe o nome da S�rie:", "Pesquisa de s�rie",
				JOptionPane.OK_CANCEL_OPTION);

		for (i = 1; i < series.length; i++) {
			if (serie.equalsIgnoreCase(series[i].getNome())) {
				match = i;
				texto.append(series[i].getNome() + ", " + series[i].getTipo() + ", dura��o: " + series[i].getDuracao()
						+ ", Pa�s: " + series[i].getPais() + ", Idioma: " + series[i].getIdioma() + ", Emissora: "
						+ series[i].getEmissora() + ", Transmiss�o: " + series[i].getTransmissao() + ", Temporadas: "
						+ series[i].getNumTemporadas() + ", Epis�dios: " + series[i].getNumEpisodios());
				resultado = texto.toString();
			}
		}
		if (!serie.equalsIgnoreCase(series[match].getNome())) {
			resultado = "Verifique no cat�logo o nome digitado.";
		}
		return resultado;
	}

	public void adicionarFavorito(Serie serie) throws Exception {
		for (i = 0; i < favoritos.length; i++) {
			if (favoritos[i] == null) {
				favoritos[i] = series[i];
			} else {
				throw new Exception("Erro! Lista cheia");
			}
		}
	}

	public void removerFavoritos() throws Exception {

	}

	public void listaFavoritos() throws Exception {

	}

	public void sugestaoSerie() throws Exception {

	}

}
