import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("in.txt"))) {
			int i = 0;
			String line = br.readLine();

			while (line != null) {

				if (i >= 3 && !line.equals(";")) {
					String[] fields = line.split(",");
					int arrivalTime = Integer.parseInt(fields[0].substring(fields[0].indexOf("=") + 1));
					int latency = Integer.parseInt(fields[1]);
					int seekTime = Integer.parseInt(fields[2]);
					int transferTime = Integer.parseInt(fields[3]);
					lista.add(requisicao = new Requisicao(arrivalTime, latency, seekTime, transferTime));
				}
				line = br.readLine();
				i++;
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"))) {


				System.out.println("Relatorio de saida gerado. Abra out.txt e veja os resultados");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
