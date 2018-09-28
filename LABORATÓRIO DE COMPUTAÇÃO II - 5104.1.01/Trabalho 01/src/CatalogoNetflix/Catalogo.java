package CatalogoNetflix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Catalogo {
	int i = 0;
	int temporadas;
	Serie[] series;

	public void inicializarCatalogo() throws Exception {
		series = new Serie[100];
		i = 0;
		File file = new File("Series.txt");

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "ISO-8859-1"));
		String linha = null;
		linha = br.readLine();

		while (i < 60) {
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

	public String abrirCatalogo() throws Exception {
		StringBuilder nomes = new StringBuilder();

		for (i = 1; i < 60; i++) {
			nomes.append(series[i].getNome() + ", " + series[i].getNumTemporadas() + " temporadas");
			nomes.append("        ");
			if (i % 4 == 0) {
				nomes.append("\n\n");
			}
		}
		return nomes.toString();
	}

	public void pesquisarSerie() throws Exception {

	}

	public void listaFavoritos() throws Exception {

	}

	public void sugestaoSerie() throws Exception {

	}

}
