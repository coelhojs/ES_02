package Questão_03;

public class Cliente {
	private String nome;
	private double limiteCredito;
	private PessoaFisica pf;
	private PessoaJuridica pj;

	public Cliente() {
	}

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

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

}
