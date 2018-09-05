package Questão_03;

public class PessoaFisica extends Pessoa {
	private long cpf;
	private int idade;
	private String sexo;

	public PessoaFisica(String nome, long cpf, int idade, String sexo) {
		super(nome);
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
	}

	public PessoaFisica() {
		super();
		this.cpf = 12345678910L;
		this.idade = 40;
		this.sexo = "feminino";
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
