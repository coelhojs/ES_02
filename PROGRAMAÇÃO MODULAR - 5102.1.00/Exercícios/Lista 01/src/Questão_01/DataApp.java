package Questão_01;

import java.time.format.DateTimeFormatter;

public class DataApp {

	public static void main(String[] args) {

		Data data = new Data(2018, 8, 29);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");

		System.out.println("Hoje: " + formatter.format(data.getData()));
		System.out.println("Dias no mês " + data.getMes() + ": " + data.diasNoMes());
		data.adicionaDias(3);
		System.out.println("Nova data: " + formatter.format(data.getData()));
		System.out.println(data.getData().toString());
	}

}
