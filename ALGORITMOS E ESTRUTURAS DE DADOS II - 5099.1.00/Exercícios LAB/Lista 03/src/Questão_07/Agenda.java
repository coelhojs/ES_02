/*Crie uma classe Contato que possui dois atributos: nome e email do tipo String. Crie outra
classe, chamada Agenda, que possui um atributo contatos do tipo vetor de Contato. A classe
Agenda deve conter um m�todo para adicionar um novo contato em uma posi��o vazia do vetor,
outro m�todo para buscar um contato (retorna uma inst�ncia de Contato) atrav�s do nome e,
por fim, um m�todo para excluir um contato atrav�s do nome*/

package Quest�o_07;

public class Agenda {
	private Contato[] contato;
	//verificar por que o atributo contato n�o est� sendo usado
	
	public Agenda(Contato[] contato) {
		this.contato = contato;
	}

	public Agenda() {
	}

	public static void main(String[] args) {
		Contato[] contato = new Contato[10];

		for (int i = 0; i < contato.length; i++) {
			contato[i] = new Contato("Nome" + i, "email" + i + "@mail.com");
			System.out.println("Nome: " + contato[i].getNome());
			System.out.println("Email: " + contato[i].getEmail());
			System.out.println();
		}
	}
}