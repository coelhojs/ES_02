package Questao_01;

public class Pessoa {
	private String nome, sexo, estadoCivil;
	private int idade;

	public Pessoa(String nome, String sexo, String estadoCivil, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "testando to string";
	}

	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public int getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
