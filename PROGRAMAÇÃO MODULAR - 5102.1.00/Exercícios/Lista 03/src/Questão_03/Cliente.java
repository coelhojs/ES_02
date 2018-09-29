package Questão_03;

public class Cliente extends Pessoa {
	private String nome;
	private double limiteCredito;
	private PessoaFisica pf;
	private PessoaJuridica pj;

	public Cliente(PessoaFisica pf, double limiteCredito) {
		this.nome = pf.getNome();
		this.limiteCredito = limiteCredito;
		this.pf = pf;
	}

	public Cliente(PessoaJuridica pj, double limiteCredito) {
		this.nome = pj.getNome();
		this.limiteCredito = limiteCredito;
		this.pj = pj;
	}

	public Cliente() {
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}
}
