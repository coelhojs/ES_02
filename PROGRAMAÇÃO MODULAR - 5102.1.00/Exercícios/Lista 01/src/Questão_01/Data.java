package Questão_01;

import java.time.LocalDate;

public class Data {
	private LocalDate hoje;
	private int dia;
	private int mes;
	private int ano;

	public Data(int ano, int mes, int dia) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data() {

		hoje = LocalDate.now();

		this.dia = hoje.getDayOfMonth();
		this.mes = hoje.getMonthValue();
		this.ano = hoje.getYear();
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

	public void adicionaDias(int dias) {
		LocalDate novaData = hoje.plusDays(dias);	
	}
}