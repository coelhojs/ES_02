package Questao_05;

public class Endereco {
	private String nome, endereco, cidade, UF;
	private int telefone, cep;

	public Endereco(String nome, String endereco, String cidade, String uF, int telefone, int cep) {
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		UF = uF;
		this.telefone = telefone;
		this.cep = cep;
	}

	public Endereco() {

	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public String getUF() {
		return UF;
	}

	public int getTelefone() {
		return telefone;
	}

	public int getCep() {
		return cep;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

}
