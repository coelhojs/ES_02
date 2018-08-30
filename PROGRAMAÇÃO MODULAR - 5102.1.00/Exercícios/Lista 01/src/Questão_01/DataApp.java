package Quest�o_01;

import java.time.format.DateTimeFormatter;

public class DataApp {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");

		Data hoje = new Data();
		System.out.println("Hoje: " + formatter.format(hoje.getData()));
		Data data = new Data(1994, 3, 15);
		System.out.println("Data definida: " + formatter.format(data.getData()));
		System.out.println("Dias no m�s " + data.getMes() + ": " + data.diasNoMes());
		data.adicionaDias(3);
		System.out.println("Adicionando 3 dias. Nova data: " + formatter.format(data.getData()));
		System.out.println("Dia da semana: " + data.diaDaSemana());
		System.out.println("� ano bissexto? " + data.eAnoBissexto());
		data.proximoDia();
		System.out.println("Pr�ximo dia ap�s a nova data: " + formatter.format(data.getData()));

	}

}
