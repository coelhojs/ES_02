/*Crie uma classe Contato que possui dois atributos: nome e email do tipo String. Crie outra
classe, chamada Agenda, que possui um atributo contatos do tipo vetor de Contato. A classe
Agenda deve conter um m�todo para adicionar um novo contato em uma posi��o vazia do vetor,
outro m�todo para buscar um contato (retorna uma inst�ncia de Contato) atrav�s do nome e,
por fim, um m�todo para excluir um contato atrav�s do nome*/

package Quest�o_07;

public class Agenda extends Contato {

	public Agenda(String nome, String email) {
		super(nome, email);

	}

	public Agenda() {
		super();
	}
	
	

}
