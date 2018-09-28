package CatalogoNetflix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Catalogo {
	Serie[] series;
	int i = 0;

	public void inicializarCatalogo() throws Exception {
		File file = new File("Series.txt");

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "ISO-8859-1"));
		String linha = null;
		linha = br.readLine();

		while (linha != null) {
			String campos[] = linha.split(";");
			linha = br.readLine();

			//series[] = new Serie();

			series[i].setNome(campos[0]);
			/*series[i].setNome(campos[1]);
			series[i].setNome(campos[2]);
			series[i].setNome(campos[3]);
			series[i].setNome(campos[4]);*/
			i++;
		}
		br.close();
	}

	public void abrirCatalogo() throws Exception {
		for(i = 0; i < 61; i++) {
			System.out.println(series[i].getNome());
		}
	}

	public void pesquisarSerie() throws Exception {

	}

	public void listaFavoritos() throws Exception {

	}

	public void sugestaoSerie() throws Exception {

	}

}
