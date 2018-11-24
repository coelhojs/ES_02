import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Normalizer;

public class Leitor {
	public static void main(String[] args) throws IOException {

		ClassLoader loader = Leitor.class.getClassLoader();
		System.out.println(loader.getResource("Leitor.class"));

		File file = new File(
				"D:\\Google Drive\\1.Engenharia de Software\\2-2018\\LABORATÓRIO DE COMPUTAÇÃO II - 5104.1.01 - FALTA 17\\Trabalhos\\speech.txt");
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);

		String line;

		// Initializing counters
		int palavras = 0;
		// int sentenceCount = 0;
		// int characterCount = 0;
		// int paragraphCount = 1;
		// int espacos = 0;

		// Reading line by line from the
		// file until a null is returned
		while ((line = reader.readLine()) != null) {
			if (!(line.equals(""))) {

				String minusculos = line.toLowerCase();

				String semAcentos = minusculos;
				System.out.println(Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", ""));

				String alfanumerico = minusculos.replaceAll("[^\\p{Alpha}\\p{Digit}]\\s+", "");

				System.out.println(alfanumerico);

				// \\s+ is the space delimiter in java
				String[] wordList = alfanumerico.split("\\s+");

				palavras += wordList.length;
			}
		}

		System.out.println("Total word count = " + palavras);
	}
}
