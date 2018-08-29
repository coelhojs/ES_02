package Questão_01;

import java.time.format.DateTimeFormatter;

public class DataApp {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		Data data = new Data();

		System.out.println("Hoje: " + data.getDia() + "/" + data.getMes() + "/" + data.getAno());
		data.adicionaDias(50);
		System.out.println("Nova data: " + formatter.format(data.getData()));
	}

}
