package Quest�o_03;

public class DataApp {

	public static void main(String[] args) {

		Data hoje = new Data();
		System.out.println("Hoje: " + hoje.formatoBarra.format(hoje.getData()));
		Data data = new Data(1994, 3, 15);
		System.out.println("Data definida: " + data.formatoBarra.format(data.getData()));
		System.out.println("Dias no m�s " + data.getMes() + ": " + data.diasNoMes());
		data.adicionaDias(3);
		//int maisDias = Integer.parseInt(JOptionPane.showInputDialog("Digite os dias a adicionar: "));
		//data.adicionaDias(maisDias);
		System.out.println("Adicionando 3 dias. Nova data: " + data.formatoBarra.format(data.getData()));
		System.out.println("Dia da semana: " + data.diaDaSemana());
		System.out.println("� ano bissexto? " + data.eAnoBissexto());
		data.proximoDia();
		System.out.println("Pr�ximo dia ap�s a nova data: " + data.formatoBarra.format(data.getData()));
		System.out.println("Data por extenso: " + data.porExtenso());
		
	}

}
