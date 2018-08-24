package Questão_01;
public class Data {
	private int ano;
	private int mes;
	private int dia;

	public Data(int ano, int mes, int dia) {
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}

	public Data() {
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
