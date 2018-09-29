package Questão_03;

public class Funcionario extends Pessoa {
	private String nome, cargo;
	private double salario;
	private PessoaFisica pf;

	public Funcionario(PessoaFisica pf, String cargo, double salario) {
		this.pf = pf;
		this.nome = pf.getNome();
		this.cargo = cargo;
		this.salario = salario;
	}

	public Funcionario() {
	}

	public String getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}

}
