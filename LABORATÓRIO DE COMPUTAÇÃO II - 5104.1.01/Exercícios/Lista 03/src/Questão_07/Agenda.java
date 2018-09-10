/*Crie uma classe Contato que possui dois atributos: nome e email do tipo String. Crie outra
classe, chamada Agenda, que possui um atributo contatos do tipo vetor de Contato. A classe
Agenda deve conter um método para adicionar um novo contato em uma posição vazia do vetor,
outro método para buscar um contato (retorna uma instância de Contato) através do nome e,
por fim, um método para excluir um contato através do nome*/

package Questão_07;

public class Agenda {
	private Contato[] contato;
	//verificar por que o atributo contato não está sendo usado
	
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