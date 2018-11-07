package Questao_01;

public class PessoaFisica extends Pessoa {
	private long cpf;
	private int idade;
	private String sexo;

	public PessoaFisica(String nome, String endereco, int telefone, long cpf, int idade, String sexo) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
	}

	public PessoaFisica() {
		super();
	}

	public long getCpf() {
		return cpf;
	}

	public int getIdade() {
		return idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
