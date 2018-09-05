package Questão_03;

public class PessoaAplicacao {

	public static void main(String[] args) {
		Pessoa pessoaPadrao = new Pessoa();
		System.out.println("Dados da pessoa criada com os valores padrão:");
		System.out.println("Nome: " + pessoaPadrao.getNome());
		System.out.println("CPF: " + pessoaPadrao.getCpf());
		System.out.println("Idade: " + pessoaPadrao.getIdade());
		System.out.println("Sexo: " + pessoaPadrao.getSexo());
		System.out.println();
		Pessoa pessoa = new Pessoa("Cristiano", 11254085610L, 24, "masculino");
		System.out.println("Dados de Cristiano:");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CPF: " + pessoa.getCpf());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("Sexo: " + pessoa.getSexo());
	}

}
