package Questão_02;

public class PessoaAplicacao {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		System.out.println("Dados da pessoa criada:");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CPF: " + pessoa.getCpf());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("Sexo: " + pessoa.getSexo());
	}

}
