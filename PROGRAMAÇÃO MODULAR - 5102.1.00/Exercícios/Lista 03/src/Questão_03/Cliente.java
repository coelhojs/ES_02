package Questão_03;

public class Cliente {
	private Pessoa[] cliente;

	public Cliente(PessoaFisica cliente) {
		this.cliente = new PessoaFisica();
	}

	public Cliente(PessoaJuridica cliente) {
		this.cliente = new PessoaJuridica();
	}

}
