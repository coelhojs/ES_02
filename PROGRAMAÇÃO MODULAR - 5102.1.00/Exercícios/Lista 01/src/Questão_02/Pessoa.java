package Questão_02;

public class Pessoa {
	private String nome;
	private long cpf;
	private int idade;
	private String sexo;

	public Pessoa(String nome, long cpf, int idade, String sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;

	}

	public Pessoa() {
		this.nome = "Nome Padrão";
		this.cpf = 12345678910L;
		this.idade = 99;
		this.sexo = "Feminino";
	}

	public String getNome() {
		return this.nome;
	}

	public long getCpf() {
		return this.cpf;
	}

	public int getIdade() {
		return this.idade;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Boolean isMaiorIdade() {
		idade = getIdade();
		if (idade >= 18) {
			return true;
		} else {
			return false;
		}
	}
}