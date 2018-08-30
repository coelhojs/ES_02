package Quest�o_01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataApp {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");

		Data hoje = new Data();
		System.out.println("Hoje: " + formatter.format(hoje.getData()));
		Data data = new Data(2018, 8, 29);
		System.out.println("Data definida: " + formatter.format(data.getData()));
		System.out.println("Dias no m�s " + data.getMes() + ": " + data.diasNoMes());
		data.adicionaDias(3);
		System.out.println("Nova data: " + formatter.format(data.getData()));
		System.out.println("Dia da semana: " + data.diaDaSemana());

	}

}
