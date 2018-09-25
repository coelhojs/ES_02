package CatalogoNetflix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Catalogo {
	public void abrirCatalogo() throws Exception {
		File file = new File("Series.txt");

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "ISO-8859-1"));
		String linha = null;
		linha = br.readLine();

		while (linha != null) {
			linha = br.readLine();
			String campos[] = linha.split(";");
			System.out.println(campos[0]);
//			JOptionPane.showMessageDialog(null,  campos[0]);
		}

		br.close();

	}

}
