package Questao_01;

public class Pessoa {
	private String nome, sexo, estadoCivil, idade;

	public Pessoa(String nome, String sexo, String estadoCivil, String idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + ", Sexo: " + getSexo() + ", Estado Civil: " + getEstadoCivil() + ", Idade: "
				+ getIdade();
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

	public String getIdade() {
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

	public void setIdade(String idade) {
		this.idade = idade;
	}
}
