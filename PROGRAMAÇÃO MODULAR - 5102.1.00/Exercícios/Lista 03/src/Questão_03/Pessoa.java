package Quest�o_03;

public class Pessoa {
	private String nome;
	private long cpf;
	private int idade;
	private String sexo;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa() {
		this.nome = "Nome Padr�o";
	}

	public int getIdade() {
		return this.idade;
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