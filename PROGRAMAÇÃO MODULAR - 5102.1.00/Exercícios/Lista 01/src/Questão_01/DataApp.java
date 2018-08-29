package Questão_01;

public class DataApp {

	public static void main(String[] args) {

		Data data = new Data();

		// Data atual:
		data.adicionaDias(50);
		System.out.println("Hoje: " + data.getDia() + "/" + data.getMes() + "/" + data.getAno());
		// Adicionando 50 dias, a nova data será:
		// System.out.println("Nova data: " + );

	}

}
