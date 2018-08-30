package Questão_01;

import java.time.DayOfWeek;
import java.time.LocalDate;

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
		this.ano = data.getYear();
		this.mes = data.getMonthValue();
		this.dia = data.getDayOfMonth();
	}

	public void adicionaDias(int dias) {
		setData(this.data.plusDays(dias));
	}

	public int diasNoMes() {
		int diasNoMes = data.lengthOfMonth();
		return diasNoMes;

	}

	public String diaDaSemana() {
		DayOfWeek diaDaSemana = data.getDayOfWeek();
		return diaDaSemana.toString();
	}

	public boolean eAnoBissexto() {
		boolean eAnoBissexto = data.isLeapYear();
		return eAnoBissexto;
	}
}