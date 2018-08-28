package Questão_01;

import java.time.LocalDate;

public class Data {
	private int ano;
	private int mes;
	private int dia;
	private LocalDate data; 
	
	public Data() {
		
		data = LocalDate.now();
		
		this.ano = data.getYear();
		this.mes = data.getMonthValue();
		this.dia = data.getDayOfMonth();
		
	}

	public int getAno() {
		return ano;
	}

	public int getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}

	public void adicionaDias(int dia) {
		int lastDay = 31;
		int intervalDays = 0;

		this.dia += dia;

		if (this.dia > lastDay) {
			intervalDays = this.dia - lastDay;
			this.mes++;
			this.dia = intervalDays;
		}

	}
}
