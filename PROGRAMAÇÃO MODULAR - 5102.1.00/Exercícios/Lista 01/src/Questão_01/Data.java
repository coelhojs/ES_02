package Questão_01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {
	private LocalDate data;
	private int dia;
	private int mes;
	private int ano;

	public Data(int ano, int mes, int dia) {
		this.data = LocalDate.of(ano, mes, dia);
		this.dia = data.getDayOfMonth();
		this.mes = data.getMonthValue();
		this.ano = data.getYear();
	}

	public Data() {

		this.data = LocalDate.now();
		this.dia = data.getDayOfMonth();
		this.mes = data.getMonthValue();
		this.ano = data.getYear();
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public void adicionaDias(int dias) {
		setData(data.plusDays(dias));
	}
}