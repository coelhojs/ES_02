package Quest�o_01;

public class DataApp {

	public static void main(String[] args) {

		Data hoje = new Data();

		// Data atual:
		System.out.println("Hoje: " + hoje.getDia() + "/" + hoje.getMes() + "/" + hoje.getAno());
		// Adicionando 50 dias, a nova data ser�:
		hoje.adicionaDias(50);
		// System.out.println("Nova data: " + );

	}

}
