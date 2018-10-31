package Quest�o_02_OK;

import java.time.format.DateTimeFormatter;

public class DataApp {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");

		Data hoje = new Data();
		System.out.println("Hoje: " + formatter.format(hoje.getData()));
		Data data = new Data(1994, 3, 15);
		System.out.println("Dias no m�s " + data.getMes() + ": " + data.diasNoMes());
		data.adicionaDias(3);
		// int maisDias = Integer.parseInt(JOptionPane.showInputDialog("Digite os dias a
		// adicionar: "));
		// data.adicionaDias(maisDias);
		System.out.println("Adicionando 3 dias. Nova data: " + formatter.format(data.getData()));
		System.out.println("Dia da semana: " + data.diaDaSemana());
		System.out.println("� ano bissexto? " + data.eAnoBissexto());
		data.proximoDia();
		System.out.println("Pr�ximo dia ap�s a nova data: " + formatter.format(data.getData()));
		System.out.println("\nPolimorfismo: ");
		System.out.println("Data por extenso: " + data);
		System.out.println("Teste equals: " + hoje.equals(data));

	}

}
