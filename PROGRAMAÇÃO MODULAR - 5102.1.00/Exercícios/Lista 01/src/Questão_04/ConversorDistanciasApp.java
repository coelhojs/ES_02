package Quest�o_04;

public class ConversorDistanciasApp {

	public static void main(String[] args) {
		ConversorDistancias conversor = new ConversorDistancias(300.00, 50.00, 2.00, 10.00);
		System.out.println("De p�s para metros: ");
		System.out.println("P�s: " + conversor.getPes());
		System.out.println("Polegadas: " + conversor.pesParaPolegadas(conversor.getPes()));
	}

}
