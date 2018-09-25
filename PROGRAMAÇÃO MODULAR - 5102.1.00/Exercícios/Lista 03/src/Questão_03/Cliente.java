package Questão_03;

public class Cliente {
	private PessoaFisica clientePF;
	private PessoaJuridica clientePJ;
	
	public Cliente(PessoaFisica clientePF) {
		clientePF = new PessoaFisica();
	}
	
	public Cliente(PessoaJuridica clientePJ) {
		clientePJ = new PessoaJuridica();
	}
}
