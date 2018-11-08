package Questao_02;

public class Funcionario {
	private String endereco, nome, sexo, cargo;
	private int telefone, idade;
	private double salario;
	private long cpf;

	public Funcionario(PessoaFisica pf, String cargo, double salario) {
		this.nome = pf.getNome();
		this.cpf = pf.getCpf();
		this.endereco = pf.getEndereco();
		this.telefone = pf.getTelefone();
		this.idade = pf.getIdade();
		this.sexo = pf.getSexo();
		this.cargo = cargo;
		this.salario = salario;
	}

	public Funcionario() {
	}

	public String getEndereco() {
		return endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public String getCargo() {
		return cargo;
	}

	public int getTelefone() {
		return telefone;
	}

	public int getIdade() {
		return idade;
	}

	public double getSalario() {
		return salario;
	}

	public long getCpf() {
		return cpf;
	}

	public void setSalario(double salario) throws Exception {
		if (salario >= 0) {
			this.salario = salario;
		} else {
			throw new ExcecaoValorNegativo();
		}
	}

}
