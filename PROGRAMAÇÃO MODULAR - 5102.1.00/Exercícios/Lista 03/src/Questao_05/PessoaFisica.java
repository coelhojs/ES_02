package Questao_05;

public class PessoaFisica extends Pessoa {
	private long cpf;
	private int idade;
	private String sexo;

	public PessoaFisica(String nome, int idade, String sexo, String endereco, String cidade, String uF, int telefone,
			int cep, long cpf) {
		super(nome, endereco, cidade, uF, telefone, cep);

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
