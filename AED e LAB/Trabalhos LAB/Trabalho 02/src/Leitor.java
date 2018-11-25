import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Normalizer;

public class Leitor {
	public static void main(String[] args) throws IOException {

		FileInputStream fileStream = new FileInputStream(
				"D:\\Desenvolvimento\\4.Semestres\\ES_02\\AED e LAB\\Trabalhos LAB\\Trabalho 02\\speech.txt");
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);

		String line;

		// Initializing counters
		int palavras = 0;

		// Reading line by line from the
		// file until a null is returned
		while ((line = reader.readLine()) != null && palavras <= 1024) {
			if (!(line.equals(""))) {

				String minusculos = line.toLowerCase();

				String semAcentos = Normalizer.normalize(minusculos, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]",
						"");

				String alfanumerico = semAcentos.replaceAll("[^\\p{Alpha}\\p{Digit}]\\s+", "");

				System.out.println(alfanumerico);

				// \\s+ is the space delimiter in java
				String[] wordList = alfanumerico.split("\\s+");

				palavras += wordList.length;
			}
		}

		System.out.println("Total word count = " + palavras);
	}
}
