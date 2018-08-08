import java.util.ArrayList;

public class Aplicacao {
	private class Professor {

	}

	/**
	 * Exemplo ilustrando o c�digo como era feito na vers�o Java 1.4
	 */
	public static void Array14() {
		ArrayList listaDeProfessores = new ArrayList();

		listaDeProfessores.add("Hugo de Paula");
		// Adiciona um professor na lista
		listaDeProfessores.add("Z� da Silva");
		// Adiciona um professor na lista

		String prof1 = (String) listaDeProfessores.get(0);
		// Recupera o 1o professor da lista

		Professor prof2 = (Professor) listaDeProfessores.get(1);
		// Essa �ltima linha ir� compilar, uma vez que a fun��o
		// get(n) retorna Object, mas ir� produzir erro de execu��o.
	}

	public static void Array15() {
		ArrayList<String> listaDeProfessores = new ArrayList();
		// Define tipo da lista como par�metro

		listaDeProfessores.add("Hugo de Paula");
		listaDeProfessores.add("Z� da Silva");

		String prof1 = listaDeProfessores.get(0);
		// Sem type casting
		Professor prof2 = (Professor) listaDeProfessores.get(1);
		// Produz erro de compila��o (erro de tipo)

	}

	public static void main(String[] args) {
		Array14();

	}
}
