package CatalogoNetflix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Catalogo {
	int i = 0;
	Serie[] series;
	StringBuilder texto;
	String resultado, serie;

	public void inicializarCatalogo() throws Exception {
		series = new Serie[61];
		i = 0;
		File file = new File("Series.txt");

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "ISO-8859-1"));
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

	public String pesquisarSerie() throws Exception {
		texto = new StringBuilder();

		serie = JOptionPane.showInputDialog(null, "Informe o nome da S�rie:", "Pesquisa de s�rie",
				JOptionPane.OK_CANCEL_OPTION);
		for (i = 1; i < series.length; i++) {
			if (serie.equalsIgnoreCase(series[i].getNome())) {
				texto.append(series[i].getNome() + ", " + series[i].getTipo() + ", dura��o: " + series[i].getDuracao()
						+ ", Pa�s: " + series[i].getPais() + ", Idioma: " + series[i].getIdioma() + ", Emissora: "
						+ series[i].getEmissora() + ", Transmiss�o: " + series[i].getTransmissao() + ", Temporadas: "
						+ series[i].getNumTemporadas() + ", Epis�dios: " + series[i].getNumEpisodios());
				resultado = texto.toString();
			}
		}
		return resultado;
	}

	public void listaFavoritos() throws Exception {

	}

	public void sugestaoSerie() throws Exception {

	}

}
