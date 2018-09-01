package Questão_03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	private LocalDate data;

	DateTimeFormatter formatoBarra = DateTimeFormatter.ofPattern("dd/MM/YYYY");
	DateTimeFormatter formatoPorExtenso = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' YYYY");
	DateTimeFormatter formatoDiaSemana = DateTimeFormatter.ofPattern("EEEE", new Locale("pt", "BR"));

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
		return this.mes;
	}

	public int getAno() {
		return this.ano;
	}

	public LocalDate getData() {
		return this.data;
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
		int diasNoMes = this.data.lengthOfMonth();
		return diasNoMes;

	}

	public String diaDaSemana() {
		String diaDaSemana = getData().format(formatoDiaSemana);
		return diaDaSemana.toString();
	}

	public boolean eAnoBissexto() {
		boolean eAnoBissexto = this.data.isLeapYear();
		return eAnoBissexto;
	}

	public void proximoDia() {
		setData(this.data.plusDays(1));
	}

	public String porExtenso() {
		String porExtenso = formatoPorExtenso.format(getData());
		return porExtenso;
	}
}