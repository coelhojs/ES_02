package Questão_03;

public class Cliente {
	private static final int MAX_CLIENTES = 100;
	private PessoaFisica[] clientePF;
	private PessoaJuridica[] clientePJ;
	private int numClientesPJ, numClientesPF;

	public Cliente(Pessoa cliente) {
		clientePF = new PessoaFisica[MAX_CLIENTES];
		clientePJ = new PessoaJuridica[MAX_CLIENTES];
		
	}
}
